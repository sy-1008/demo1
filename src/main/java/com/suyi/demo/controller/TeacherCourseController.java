package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.Course;
import com.suyi.demo.model.Teacher;
import com.suyi.demo.model.TeacherCourse;
import com.suyi.demo.model.User;
import com.suyi.demo.service.TeacherCourseAllService;
import com.suyi.demo.service.TeacherCourseService;
import com.suyi.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TeacherCourseController {
    @Autowired
    private TeacherCourseService teacherCourseService;
   @Resource
    TeacherService teacherService;
    @RequestMapping(value = "/coursepage")
    public String selectAll(Model model, HttpSession session,@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
    {
        User user= (User) session.getAttribute("user");
//        Teacher teacher=teacherService.FindteacherName(user);
        model.addAttribute("loginUser",user);
        PageHelper.startPage(start, size, "course_id desc");
        List<TeacherCourse>teacherCourses=teacherCourseService.selectAll();
        PageInfo<TeacherCourse> page = new PageInfo<>(teacherCourses);
        model.addAttribute("page", page);
        return "/admin/coursepage.html";
    }
//    @RequestMapping(value = "/insertcourse",method = RequestMethod.POST)
//public String insertCourse(Course course )
//{
//    //teacherCourseService.insertcourse(course);
//    return "redirect:/coursepage";
//}

}
