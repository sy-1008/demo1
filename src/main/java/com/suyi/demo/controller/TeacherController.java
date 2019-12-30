package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.*;
import com.suyi.demo.service.*;
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
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @Autowired
    CourseService courseService;
    @Autowired
    TcService tcService;
    @Autowired
    UserService userService;
    @Autowired
    TeacherCourseAllService teacherCourseAllService;
    @Autowired
    TeacherCourseMainTeamService teacherCourseMainTeamService;

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
        return "redirect:/teacherpage";
    }

    /**
     * 显示一个教师所授课程列表
     *
     * @param m
     * @return
     */
    @RequestMapping(value = "/teacherhome")
    public String selectteacher(Model m, HttpSession session, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        User user = (User) session.getAttribute("user");
        TeacherCourseMainTeamExample example = new TeacherCourseMainTeamExample();
        example.or().andTeacherIdEqualTo(user.getUserId());
        example.or().andTeacherTeamIdEqualTo(user.getUserId());
        //example.createCriteria().andTeacherIdEqualTo(user.getUserId());

        List<TeacherCourseMainTeam> teacherCourseMainTeams = teacherCourseMainTeamService.selectByExample(example);

//        List<TeacherCourseAll>teacherCourseAlls=teacherCourseAllService.teacherdetailinfo(teacher.getName());
        PageInfo<TeacherCourseMainTeam> page = new PageInfo<>(teacherCourseMainTeams);
        m.addAttribute("page", page);
//        m.addAttribute("courses",teacherCourseMainTeams);
        return "/teacher/teacherhome.html";
    }




}
