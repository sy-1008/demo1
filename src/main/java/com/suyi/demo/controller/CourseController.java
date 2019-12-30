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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;



//    @RequestMapping(value = "/showcourseinfo", method = RequestMethod.GET)
//    public String showcourseinfo(Model model, HttpServletRequest request) {
//        String courseName = request.getParameter("courseName");
//        Course course = courseService.coursedetailinfo(courseName);
//        model.addAttribute("onecourses", course);
//        return "admin/coursedetailinfo.html";
//    }


//    @RequestMapping(value = "/coursepage")
//    public String selectAll(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
//        PageHelper.startPage(start, size, "course_id desc");
//        List<Course> courses = courseService.selectAll();
//        PageInfo<Course> page = new PageInfo<>(courses);
//        m.addAttribute("page", page);
//        return "/admin/coursepage.html";
//    }
@RequestMapping(value = "/insertcourse",method = RequestMethod.POST)
    public String insertCourse(Course course) {
        courseService.insert(course);

        return "redirect:/coursepage";

    }


}
