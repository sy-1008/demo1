package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.mapper.CourseMapper;
import com.suyi.demo.model.Course;
import com.suyi.demo.model.User;
import com.suyi.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/insertcourse", method = RequestMethod.POST)
    public String insertCourse(Course course) {
        courseService.insert(course);

        return "redirect:/coursepage";

    }

    /**
     * 修改课程基本信息
     *
     * @return
     */
    @RequestMapping(value = "/modifycourseinfo", method = RequestMethod.POST)
    public String modifycourseinfo(HttpServletRequest request) {
        Course course=new Course();
        course.setCourseId(request.getParameter("courseId"));
        course.setCourseName(request.getParameter("courseName"));
        course.setTerm(request.getParameter("term"));
        course.setCourseHour(Integer.parseInt(request.getParameter("courseHour")));
        courseService.updateByPrimaryKey(course);
        return "redirect:/coursepage";
    }

}
