package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.TeacherCourseAll;
import com.suyi.demo.model.TeacherCourseAllExample;
import com.suyi.demo.service.TeacherCourseAllService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TeacherCourseAllController {
    @Autowired
    private TeacherCourseAllService teacherCourseAllService;

    /**
     * 显示课程详细信息
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/showcourseinfo",method = RequestMethod.GET)
    public String showcourseinfo(Model model, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
    {
        PageHelper.startPage(start, size, "course_id desc");
        String courseName=request.getParameter("courseName");
        List<TeacherCourseAll> teacherCourseAll=teacherCourseAllService.coursedetailinfo(courseName);
        PageInfo<TeacherCourseAll> page = new PageInfo<>(teacherCourseAll);
        model.addAttribute("onecourses",teacherCourseAll);

        TeacherCourseAll t=teacherCourseAllService.coursedetailinfo(courseName).get(0);
        model.addAttribute("course",t);
        return "admin/coursedetailinfo.html";
    }

    /**
     * 显示教师详细信息
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showteacherinfo",method = RequestMethod.GET)
    public String showteacherinfo(Model model,HttpServletRequest request,@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
    {
        PageHelper.startPage(start, size, "course_id desc");
        String teacherName=request.getParameter("name");
        List<TeacherCourseAll>teacherCourseAlls=teacherCourseAllService.teacherdetailinfo(teacherName);
        //PageInfo<TeacherCourseAll>page=new PageInfo<>(teacherCourseAlls);
        model.addAttribute("oneteacher",teacherCourseAlls);

        TeacherCourseAll t=teacherCourseAllService.teacherdetailinfo(teacherName).get(0);
        model.addAttribute("teacher",t);
        return "teacher/teacherdetailinfo.html";
    }

    /**
     * 显示一门课程的所有授课教师信息
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showteacherinfobycourseName",method = RequestMethod.GET)
    public String showteacherinfoByCourseName(Model model,HttpServletRequest request,@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
    {
        PageHelper.startPage(start, size, "teacher_id desc");
        String courseName=request.getParameter("courseName");
        TeacherCourseAllExample example=new TeacherCourseAllExample();
        example.createCriteria().andCourseNameEqualTo(courseName);
        List<TeacherCourseAll>teacherCourseAlls=teacherCourseAllService.selectByExample(example);
        PageInfo<TeacherCourseAll>page=new PageInfo<>(teacherCourseAlls);
        model.addAttribute("page", page);
        TeacherCourseAll teacherCourseAll=teacherCourseAlls.get(0);
        model.addAttribute("weilecoursename",teacherCourseAll);
        return "/teacher/teacher_coursedetail_teacher.html";
    }

}
