package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.*;
import com.suyi.demo.service.*;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TopicController {
    @Autowired
    TeacherCourseTopicService teacherCourseTopicService;
    @Autowired
    StutopicTopicTeacherService stutopicTopicTeacherService;
    @Autowired
    PaperStudentStutopicTopicService paperStudentStutopicTopicService;
    @Autowired
    TopicService topicService;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 显示一门课程下 主题list
     *
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showtopiclistBycourseName", method = RequestMethod.GET)
    public String showtopiclistBycourseName(Model model, HttpSession session, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        User user = (User) session.getAttribute("user");
        model.addAttribute("loginUser", user);
        PageHelper.startPage(start, size);
        String courseId = request.getParameter("courseId");
        TeacherCourseTopicExample example = new TeacherCourseTopicExample();
        example.createCriteria().andCourseIdEqualTo(courseId);
        List<TeacherCourseTopic> teacherCourseTopics = teacherCourseTopicService.selectByExample(example);

        PageInfo<TeacherCourseTopic> page = new PageInfo<>(teacherCourseTopics);
        model.addAttribute("page", page);
        //设置model 为了courseName
        TeacherCourseTopic teacherCourseTopic = teacherCourseTopics.get(0);
        model.addAttribute("weilecourseId", teacherCourseTopic);
        return "teacher/teacher_coursedetail_topic.html";

    }

    /**
     * 显示一个主题的详细信息
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/showtopicdetail", method = RequestMethod.GET)
    public String showtopicdetail(Model model, HttpServletRequest request) {
        String topic= request.getParameter("topic");
        StutopicTopicTeacherExample stutopicTopicTeacherExample = new StutopicTopicTeacherExample();
        stutopicTopicTeacherExample.createCriteria().andTopicIdEqualTo(topic);
        List<StutopicTopicTeacher> stutopicTopicTeachers = stutopicTopicTeacherService.selectByExample(stutopicTopicTeacherExample);
        model.addAttribute("topic", stutopicTopicTeachers);
        PaperStudentStutopicTopicExample paperStudentStutopicTopicExample = new PaperStudentStutopicTopicExample();
        paperStudentStutopicTopicExample.createCriteria().andTopicIdEqualTo(topic);
        List<PaperStudentStutopicTopic> paperStudentStutopicTopics = paperStudentStutopicTopicService.selectByExample(paperStudentStutopicTopicExample);
        model.addAttribute("paper", paperStudentStutopicTopics);
        return "teacher/teacher_coursedetail_topicdetail.html";
    }

    /**
     * 新增主题
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/inserttopic", method = RequestMethod.POST)
    public String inserttopic(Model model, HttpServletRequest request) throws ParseException, UnsupportedEncodingException {
       String courseId=request.getParameter("url");
       String url="redirect:/showtopiclistBycourseName?courseId="+courseId;

        Topic topic = new Topic();
        topic.setCourseId(request.getParameter("courseId"));
        topic.setTopicId(request.getParameter("topicId"));
        topic.setTopic(request.getParameter("topic"));
        topic.setKeyword(request.getParameter("keyword"));
        topic.setTeacherId(request.getParameter("teacherId"));
        Date date = sdf.parse(request.getParameter("creationTime"));
        topic.setCreationTime(date);
        topic.setStudentNum(Integer.parseInt(request.getParameter("studentNum")));
        topicService.insert(topic);
        return url;
    }

}
