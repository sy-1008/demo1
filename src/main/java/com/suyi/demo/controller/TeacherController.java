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

    /**
     * 教师管理页面
     * @param m
     * @param session
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/teacherpage")
    public String selectAll(Model m, HttpSession session,@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        User user= (User) session.getAttribute("user");
        m.addAttribute("loginUser",user);
        PageHelper.startPage(start, size, "teacher_id desc");
        List<Teacher> teachers = teacherService.selectALL();
        PageInfo<Teacher> page = new PageInfo<>(teachers);
        m.addAttribute("page", page);
        return "/teacher/teacherpage.html";
    }

    @RequestMapping(value = "/insertteacher")
    public String insertTeacher(HttpServletRequest request) {
        String teacherId=request.getParameter("teacherId");
        User u = new User();
        u.setUserId(teacherId);
        u.setPassword("123456");
        u.setRole(2);
        //判定授课学时冲突
        String name=request.getParameter("name");
        String sex=request.getParameter("sex");
        String pro=request.getParameter("pro");
        String phone=request.getParameter("phone");
        String courseId=request.getParameter("courseId");
        String courseName=request.getParameter("courseName");
        String teachHour=request.getParameter("teachHour");
        String teaIdentity=request.getParameter("teaIdentity");
        String tcId=request.getParameter("tcId");
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
        userService.insert(u);
        Teacher teacher=new Teacher();
        teacher.setTeacherId(teacherId);
        teacher.setName(name);
        teacher.setProtitle(pro);
        teacher.setPhone(phone);
        teacher.setSex(sex);
        teacherService.insert(teacher);
        Tc tc=new Tc();
        tc.setTcId(tcId);
        tc.setCourseId(courseId);
        tc.setTeacherId(teacherId);
        tc.setTeaIdentity(teaIdentity);
        tc.setTeachHour(Integer.parseInt(teachHour));
        tcService.insert(tc);
        }
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
        m.addAttribute("loginUser", user);
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
