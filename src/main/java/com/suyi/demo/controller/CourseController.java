package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.mapper.CourseMapper;
import com.suyi.demo.model.Course;
import com.suyi.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import java.util.List;


@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    /**
     * 显示课程详细信息
     * @param model
     * @return
     */

    @RequestMapping(value = "/showcourseinfo")
    public String showcourseinfo(Model model) {
        Course course = courseService.coursedetailinfo();
        model.addAttribute("onecourses", course);
        return "admin/coursedetailinfo.html";
    }

    /**
     * 显示全部课程信息
     * @param m
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/coursepage")
    public String selectAll(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        PageHelper.startPage(start,size,"course_id desc");
        List<Course>courses = courseService.selectAll();
        PageInfo<Course> page = new PageInfo<>(courses);
        m.addAttribute("page", page);
        return "/admin/coursepage.html";
    }

}
