package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.*;
import com.suyi.demo.service.PaperService;
import com.suyi.demo.service.StudentCourseService;
import com.suyi.demo.service.StutopicTopicTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentCourseService studentCourseService;
@Autowired
private StutopicTopicTeacherService stutopicTopicTeacherService;
@Autowired
private PaperService paperService;
    /**
     * 显示一门课程的所有选课学生
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showstudentlist",method = RequestMethod.GET )
    public String showstudentlistBycourseId(Model model, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
    {
        PageHelper.startPage(start, size, "course_id desc");
        String courseId=request.getParameter("courseId");
        //设置session
//        HttpSession session=request.getSession();
//        session.setAttribute("courseName",courseName);
//        courseName= (String) session.getAttribute("courseName");
        StudentCourseExample example=new StudentCourseExample();
        example.createCriteria().andCourseIdEqualTo(courseId);
        List<StudentCourse>studentCourses=studentCourseService.selectByExample(example);
        PageInfo<StudentCourse>page=new PageInfo<>(studentCourses);
        model.addAttribute("page", page);
        StudentCourse studentCourse=studentCourses.get(0);
        model.addAttribute("weilecourseId",studentCourse);
        return "teacher/teacher_coursedetail_student.html";

    }

    /**
     * 根据学生学号 显示该学生的选题信息
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showstutopiclistBystudentId",method = RequestMethod.GET)
public String showstutopiclistBystudentId(Model model, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
{
    PageHelper.startPage(start, size, "topic_id desc");
    String  studentId=request.getParameter("studentId");
    StutopicTopicTeacherExample stutopicTopicTeacherExample=new StutopicTopicTeacherExample();
    stutopicTopicTeacherExample.createCriteria().andStudentIdEqualTo(studentId);
    List<StutopicTopicTeacher>stutopicTopicTeachers=stutopicTopicTeacherService.selectByExample(stutopicTopicTeacherExample);
    PageInfo<StutopicTopicTeacher>page=new PageInfo<>(stutopicTopicTeachers);
    model.addAttribute("page",page);
    //获取论文列表
    PaperExample example=new PaperExample();
    example.createCriteria().andStudentIdEqualTo(studentId);
    List<Paper>papers=paperService.selectByExample(example);
    model.addAttribute("paper",papers);
    //获取studentId
    Paper paper=papers.get(0);
    model.addAttribute("paper",paper);
    return "teacher/teacher_coursedetail_student_stutopic.html";
}

}
