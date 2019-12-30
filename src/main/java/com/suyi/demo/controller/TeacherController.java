package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.Course;
import com.suyi.demo.model.Tc;
import com.suyi.demo.model.Teacher;
import com.suyi.demo.model.User;
import com.suyi.demo.service.CourseService;
import com.suyi.demo.service.TcService;
import com.suyi.demo.service.TeacherService;
import com.suyi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @Autowired
    CourseService courseService;
    @Autowired
    TcService tcService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/teacherpage")
    public String selectAll(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        PageHelper.startPage(start, size, "teacher_id desc");
        List<Teacher> teachers = teacherService.selectALL();
        PageInfo<Teacher> page = new PageInfo<>(teachers);
        m.addAttribute("page", page);
        return "/teacher/teacherpage.html";
    }

    @RequestMapping(value = "/insertteacher")
    public String insertTeacher(Teacher teacher, Course course, Tc tc) {
        User u = new User();
        u.setUserId(teacher.getTeacherId());
        u.setPassword("123456");
        u.setRole(2);
        userService.insert(u);
        teacherService.insert(teacher);
        courseService.insert(course);
        tcService.insert(tc);
       return  "redirect:/teacherpage";
    }


}
