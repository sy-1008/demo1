package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.suyi.demo.model.*;
import com.suyi.demo.service.*;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TeacherCourseAllController {
    @Autowired
    private TeacherCourseAllService teacherCourseAllService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TcService tcService;
    @Autowired
    private TeacherCourseService teacherCourseService;

    /**
     * 显示课程详细信息
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/showcourseinfo", method = RequestMethod.GET)
    public String showcourseinfo(Model model, HttpSession session, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        User user = (User) session.getAttribute("user");
        model.addAttribute("loginUser", user);

        PageHelper.startPage(start, size, "course_id desc");
        String courseName = request.getParameter("courseName");
        List<TeacherCourseAll> teacherCourseAll = teacherCourseAllService.coursedetailinfo(courseName);
        PageInfo<TeacherCourseAll> page = new PageInfo<>(teacherCourseAll);
        model.addAttribute("onecourses", teacherCourseAll);

        TeacherCourseAll t = teacherCourseAllService.coursedetailinfo(courseName).get(0);
        model.addAttribute("course", t);
        return "admin/coursedetailinfo.html";
    }

    /**
     * 显示教师详细信息
     *
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showteacherinfo", method = RequestMethod.GET)
    public String showteacherinfo(Model model, HttpSession session, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        User user = (User) session.getAttribute("user");
        model.addAttribute("loginUser", user);
        PageHelper.startPage(start, size, "course_id desc");
        String teacherId = request.getParameter("teacherId");
        List<TeacherCourseAll> teacherCourseAlls = teacherCourseAllService.teacherdetailinfo(teacherId);
        //PageInfo<TeacherCourseAll>page=new PageInfo<>(teacherCourseAlls);
        model.addAttribute("oneteacher", teacherCourseAlls);

        TeacherCourseAll t = teacherCourseAllService.teacherdetailinfo(teacherId).get(0);
        model.addAttribute("teacher", t);
        return "teacher/teacherdetailinfo.html";
    }

    /**
     * 显示一门课程的所有授课教师信息
     *
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showteacherinfobycourseName", method = RequestMethod.GET)
    public String showteacherinfoByCourseName(Model model, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        PageHelper.startPage(start, size, "teacher_id desc");
        String courseId = request.getParameter("courseId");
        TeacherCourseAllExample example = new TeacherCourseAllExample();
        example.createCriteria().andCourseIdEqualTo(courseId);
        List<TeacherCourseAll> teacherCourseAlls = teacherCourseAllService.selectByExample(example);
        PageInfo<TeacherCourseAll> page = new PageInfo<>(teacherCourseAlls);
        model.addAttribute("page", page);
        TeacherCourseAll teacherCourseAll = teacherCourseAlls.get(0);
        model.addAttribute("weilecourseId", teacherCourseAll);
        //为了显示已注册教师
        List<Teacher> teachers = teacherService.selectALL();
        model.addAttribute("teacher", teachers);
        return "/teacher/teacher_coursedetail_teacher.html";
    }

    /**
     * 显示教师信息
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/sshowteacherinfo", method = RequestMethod.GET)
    public String teacherinfomodifyByteacherId(Model model,HttpSession session, HttpServletRequest request) {
        User user= (User) session.getAttribute("user");
        model.addAttribute("loginUser",user);
        String courseId = request.getParameter("courseId");
        String teacherId = request.getParameter("teacherId");
        TeacherCourseAllExample teacherCourseAllExample = new TeacherCourseAllExample();
        teacherCourseAllExample.createCriteria().andTeacherIdEqualTo(teacherId).andCourseIdEqualTo(courseId);
        List<TeacherCourseAll> teacherCourseAlls = teacherCourseAllService.selectByExample(teacherCourseAllExample);
        TeacherCourseAll teacherCourseAll = teacherCourseAlls.get(0);
        model.addAttribute("teacher", teacherCourseAll);
        return "/teacher/teacher_coursedetail_teacher_modify.html";
    }

    /**
     * 修改教师授课信息
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/teacherinfomodify", method = RequestMethod.POST)
    public String teacherinfomodify(HttpServletRequest request) {
        String teacherId = request.getParameter("teacherId");
        String teacherName = request.getParameter("teacherName");
        String teaIdentity = request.getParameter("teaIdentity");
        String teachHour = request.getParameter("teachHour");
        String courseId = request.getParameter(("courseId"));
        //判定授课学时冲突
        Course course = courseService.selectByPrimaryKey(courseId);
        int courseHour = course.getCourseHour();
        TeacherCourseAllExample teacherCourseAllExample = new TeacherCourseAllExample();
        teacherCourseAllExample.createCriteria().andCourseIdEqualTo(courseId);
        List<TeacherCourseAll> teacherCourseAlls = teacherCourseAllService.selectByExample(teacherCourseAllExample);
        int temp = 0;
        for (int i = 0; i < teacherCourseAlls.size(); i++) {
            if (!teacherId.equals(teacherCourseAlls.get(i).getTeacherId())) {
                temp = temp + teacherCourseAlls.get(i).getTeachHour();
            }
        }
        temp = temp + Integer.parseInt(teachHour);
        Boolean flag = false;
        //检查身份冲突 是否存在主讲教师
        if ("主讲教师".equals(teaIdentity)) {

            for (int i = 0; i < teacherCourseAlls.size(); i++) {
                if ("主讲教师".equals(teacherCourseAlls.get(i).getTeaIdentity())) {
                    flag = true;
                    break;
                }
            }
        }
        if (temp <= courseHour && !flag) {
            teacherCourseAllService.teacherinfomodify(teacherId, teacherName, teaIdentity, teachHour, courseId);
        }

        String url = "redirect:/showteacherinfobycourseName?courseId=" + courseId;
        return url;
    }

    /**
     * 删除教师授课信息
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/deleteteachercourse")
    public String deleteteachercourse(HttpServletRequest request) {

        String teacherId = request.getParameter("teacherId");
        String courseId = request.getParameter(("courseId"));
        teacherCourseAllService.deleteteachercourse(teacherId, courseId);
        String url = "redirect:/showteacherinfobycourseName?courseId=" + courseId;
        return url;
    }

    /**
     * 修改教师授课信息
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/modifyteachercourseall", method = RequestMethod.POST)
    public String modifyteachercourseall(HttpServletRequest request) {
        String tcId = request.getParameter("tcId");
        String courseId = request.getParameter("courseId");
        String teacherId = request.getParameter("teacherId");
        String teaIdentity = request.getParameter("identity");
        String teachHour = request.getParameter("teachHour");
        Boolean exist = false;
        //判断是否存在主讲教师
        if (teaIdentity.equals("主讲教师")) {
            TeacherCourseExample teacherCourseExample = new TeacherCourseExample();
            teacherCourseExample.createCriteria().andCourseIdEqualTo(courseId);
            List<TeacherCourse> teacherCourses = teacherCourseService.selectByExample(teacherCourseExample);
            if (teacherCourses.size() != 0) {
                exist = true;
            }
        }
        //判断授课学时冲突
        Course course = courseService.selectByPrimaryKey(courseId);
        int courseHour = course.getCourseHour();
        TeacherCourseAllExample teacherCourseAllExample = new TeacherCourseAllExample();
        teacherCourseAllExample.createCriteria().andCourseIdEqualTo(courseId);
        List<TeacherCourseAll> teacherCourseAlls = teacherCourseAllService.selectByExample(teacherCourseAllExample);
        int temp = 0;
        //计算其他老师已有授课时长
        for (int i = 0; i < teacherCourseAlls.size(); i++) {
            if (!teacherId.equals(teacherCourseAlls.get(i).getTeacherId())) {
                temp = temp + teacherCourseAlls.get(i).getTeachHour();
            }
        }
        temp = temp + Integer.parseInt(teachHour);
        if (temp <= courseHour && !exist){
            Tc tc = new Tc();
            tc.setTcId(tcId);
            tc.setCourseId(courseId);
            tc.setTeacherId(teacherId);
            tc.setTeaIdentity(teaIdentity);
            tc.setTeachHour(Integer.parseInt(teachHour));
            tcService.updateByPrimaryKey(tc);
        }
        String url = "redirect:/showteacherinfo?teacherId=" + teacherId;
        return url;
    }
}
