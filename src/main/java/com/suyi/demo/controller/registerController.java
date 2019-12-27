package com.suyi.demo.controller;

import com.suyi.demo.model.Student;
import com.suyi.demo.model.Teacher;
import com.suyi.demo.model.User;
import com.suyi.demo.service.StudentService;
import com.suyi.demo.service.TeacherService;
import com.suyi.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class registerController {
   @Resource
    StudentService studentService;
@Resource
    TeacherService teacherService;
    @RequestMapping(value = "/studentregister", method = RequestMethod.POST)
    public String Studentregister(Student student ,User user) {
        studentService.studentregisterByStudentid(student.getStudentId(),student.getName(),user.getPassword(),student.getSex(),student.getMajor(),student.getClassName());

        return "common/login.html";
    }
@RequestMapping(value ="/teacherregister",method = RequestMethod.POST)
    public String Teacherregister(Teacher teacher,User user)
    {
        teacherService.teacherregisterByteacherID(teacher.getTeacherId(),teacher.getName(),user.getPassword(),user.getRole(),teacher.getSex(),teacher.getProtitle(),teacher.getPhone());
        return "common/login.html";
    }

}
