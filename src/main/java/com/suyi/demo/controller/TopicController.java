package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.*;
import com.suyi.demo.service.CourseService;
import com.suyi.demo.service.TeacherCourseTopicService;
import com.suyi.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TopicController {
   @Autowired
    TeacherCourseTopicService teacherCourseTopicService;

    /**
     * 显示一门课程下 主题list
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showtopiclistBycourseName",method = RequestMethod.GET)
    public String showtopiclistBycourseName(Model model, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
    {

        PageHelper.startPage(start, size);
        String courseName=request.getParameter("courseName");
        TeacherCourseTopicExample example=new TeacherCourseTopicExample();
        example.createCriteria().andCourseNameEqualTo(courseName);
       List<TeacherCourseTopic>teacherCourseTopics=teacherCourseTopicService.selectByExample(example);

        PageInfo<TeacherCourseTopic>page=new PageInfo<>(teacherCourseTopics);
        model.addAttribute("page",page);

        return "teacher/teacher_coursedetail_topic.html";

    }
}
