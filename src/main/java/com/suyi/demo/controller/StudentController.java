package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.Student;
import com.suyi.demo.model.StudentCourse;
import com.suyi.demo.model.StudentCourseExample;
import com.suyi.demo.service.StudentCourseService;
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
        String courseName=request.getParameter("courseName");
        //设置session
//        HttpSession session=request.getSession();
//        session.setAttribute("courseName",courseName);
//        courseName= (String) session.getAttribute("courseName");
        StudentCourseExample example=new StudentCourseExample();
        example.createCriteria().andCourseNameEqualTo(courseName);
        List<StudentCourse>studentCourses=studentCourseService.selectByExample(example);
        PageInfo<StudentCourse>page=new PageInfo<>(studentCourses);
        model.addAttribute("page", page);
        StudentCourse studentCourse=studentCourses.get(0);
        model.addAttribute("weilecoursename",studentCourse);
        return "teacher/teacher_coursedetail_student.html";

    }

}
