package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.Teacher;
import com.suyi.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping(value="/teacherpage")
    public String selectAll(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        PageHelper.startPage(start,size,"teacher_id desc");
        List<Teacher>teachers = teacherService.selectALL();
        PageInfo<Teacher> page = new PageInfo<>(teachers);
        m.addAttribute("page", page);
        return "/teacher/teacherpage.html";
    }

}
