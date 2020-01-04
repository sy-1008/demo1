package com.suyi.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyi.demo.model.*;
import com.suyi.demo.service.*;
import net.sf.jsqlparser.expression.operators.relational.GreaterThanEquals;
import net.sf.jsqlparser.statement.select.Top;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @Autowired
    private StudentCourseService studentCourseService;
    @Autowired
    private StutopicTopicTeacherService stutopicTopicTeacherService;
    @Autowired
    private PaperService paperService;
    @Autowired
    private StudentScCourseTcTeacherService studentScCourseTcTeacherService;
    @Autowired
    private PaperStudentStutopicTopicService paperStudentStutopicTopicService;
    @Autowired
    private StudentStutopicTopicService studentStutopicTopicService;
    @Autowired
    private StutopicService stutopicService;
    @Autowired
    private TopicService topicService;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 显示一门课程的所有选课学生
     *
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showstudentlist", method = RequestMethod.GET)
    public String showstudentlistBycourseId(Model model, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        PageHelper.startPage(start, size, "course_id desc");
        String courseId = request.getParameter("courseId");
        //设置session
//        HttpSession session=request.getSession();
//        session.setAttribute("courseName",courseName);
//        courseName= (String) session.getAttribute("courseName");
        StudentCourseExample example = new StudentCourseExample();
        example.createCriteria().andCourseIdEqualTo(courseId);
        List<StudentCourse> studentCourses = studentCourseService.selectByExample(example);
        PageInfo<StudentCourse> page = new PageInfo<>(studentCourses);
        model.addAttribute("page", page);
        StudentCourse studentCourse = studentCourses.get(0);
        model.addAttribute("weilecourseId", studentCourse);
        return "teacher/teacher_coursedetail_student.html";

    }

    /**
     * 根据学生学号 显示该学生的选题信息
     *
     * @param model
     * @param request
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showstutopiclistBystudentId", method = RequestMethod.GET)
    public String showstutopiclistBystudentId(Model model, HttpServletRequest request, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        PageHelper.startPage(start, size, "topic_id desc");
        String studentId = request.getParameter("studentId");
        StutopicTopicTeacherExample stutopicTopicTeacherExample = new StutopicTopicTeacherExample();
        stutopicTopicTeacherExample.createCriteria().andStudentIdEqualTo(studentId);
        List<StutopicTopicTeacher> stutopicTopicTeachers = stutopicTopicTeacherService.selectByExample(stutopicTopicTeacherExample);
        PageInfo<StutopicTopicTeacher> page = new PageInfo<>(stutopicTopicTeachers);
        model.addAttribute("page", page);
        //获取论文列表
        PaperExample example = new PaperExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        List<Paper> papers = paperService.selectByExample(example);
        model.addAttribute("paper", papers);
        //获取studentId
        Paper paper = papers.get(0);
        model.addAttribute("paper", paper);
        return "teacher/teacher_coursedetail_student_stutopic.html";
    }

    /**
     * 显示一名学生选课列表
     *
     * @param model
     * @param session
     * @param start
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/studenthome")
    public String selectstudent(Model model, HttpSession session, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        User user = (User) session.getAttribute("user");
        StudentScCourseTcTeacherExample studentScCourseTcTeacherExample = new StudentScCourseTcTeacherExample();
        studentScCourseTcTeacherExample.createCriteria().andStudentIdEqualTo(user.getUserId()).andTeaIdentityEqualTo("主讲教师");
        List<StudentScCourseTcTeacher> studentScCourseTcTeachers = studentScCourseTcTeacherService.selectByExample(studentScCourseTcTeacherExample);
        PageInfo<StudentScCourseTcTeacher> page = new PageInfo<>(studentScCourseTcTeachers);
        model.addAttribute("page", page);
        return "student/studenthome.html";
    }

    /**
     * 显示一门课程下的所有主题列表
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/showcoursetopic")
    public String showcoursetopic(Model model, HttpServletRequest request) {
        String studentId = request.getParameter("studentId");
        model.addAttribute("studentId", studentId);
        String courseId = request.getParameter("courseId");
        TopicExample topicExample=new TopicExample();
        topicExample.createCriteria().andCourseIdEqualTo(courseId);
        List<Topic>topics=topicService.selectByExample(topicExample);
//        PaperStudentStutopicTopicExample paperStudentStutopicTopicExample = new PaperStudentStutopicTopicExample();
//        paperStudentStutopicTopicExample.createCriteria().andCourseIdEqualTo(courseId);
//        List<PaperStudentStutopicTopic> paperStudentStutopicTopics = paperStudentStutopicTopicService.selectByExample(paperStudentStutopicTopicExample);
        model.addAttribute("topic", topics);
        return "student/StuTopic.html";
    }

    /**
     * 查看一个主题的选题学生名单 和 其上传论文列表
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/showstudentlistandpaperlistBytopicId")
    public String showstudentlistandpaperlistBycourseId(Model model, HttpServletRequest request) {
        String topicId = request.getParameter("topicId");
        PaperStudentStutopicTopicExample paperStudentStutopicTopicExample = new PaperStudentStutopicTopicExample();
        paperStudentStutopicTopicExample.createCriteria().andTopicIdEqualTo(topicId);
        List<PaperStudentStutopicTopic> paperStudentStutopicTopics = paperStudentStutopicTopicService.selectByExample(paperStudentStutopicTopicExample);
        model.addAttribute("student", paperStudentStutopicTopics);
        return "student/StuTopic_studentlist_paperlist.html";
    }

    /**
     * 查看我的主题
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/showmytopicandpaper")
    public String showmytopicandpaper(Model model, HttpServletRequest request) {
        String studentId = request.getParameter("studentId");
        model.addAttribute("studentId", studentId);
        StudentStutopicTopicExample studentStutopicTopicExample = new StudentStutopicTopicExample();
        studentStutopicTopicExample.createCriteria().andStudentIdEqualTo(studentId);
        List<StudentStutopicTopic> studentStutopicTopics = studentStutopicTopicService.selectByExample(studentStutopicTopicExample);
        model.addAttribute("mytopicandpaper", studentStutopicTopics);

        //显示论文
        PaperExample paperExample = new PaperExample();
        paperExample.createCriteria().andStudentIdEqualTo(studentId);
        List<Paper> papers = paperService.selectByExample(paperExample);
        model.addAttribute("paper", papers);
        return "student/MyTopicandPaper.html";
    }

    /**
     * 上传论文
     *
     * @return
     */
    @RequestMapping(value = "/insertpaper", method = RequestMethod.POST)
    public String insertpaper(HttpServletRequest request) throws ParseException {
        String studentId = request.getParameter("studentId");
        String paperId = request.getParameter("paperId");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String sourse = request.getParameter("source");
        String keyword = request.getParameter("keyword");
        String abstract_text = request.getParameter("abstractText");
        String doclocation = request.getParameter("docLocation");
        String uploadingtime = request.getParameter("uploadingTime");
        Paper paper = new Paper();
        paper.setPaperId(paperId);
        paper.setStudentId(studentId);
        paper.setTitle(title);
        paper.setAuthor(author);
        paper.setSource(sourse);
        paper.setKeyword(keyword);
        paper.setAbstractText(abstract_text);
        paper.setDocLocation(doclocation);
        paper.setUploadingTime(sdf.parse(uploadingtime));
        paperService.insert(paper);
        String url = "redirect:/showmytopicandpaper?studentId=" + studentId;
        return url;
    }

    @RequestMapping(value = "/inserttopic")
    public String inserttopic(HttpServletRequest request) {
        String studentId = request.getParameter("studentId");
        String topicId = request.getParameter("topicId");
        //判断是否满5人
        Topic topic = topicService.selectByPrimaryKey(topicId);
        int studentNum=topic.getStudentNum();
        if (studentNum < 5) {
            Stutopic stutopic = new Stutopic();
            Random rand = new Random();
            int i=rand.nextInt();
            //转为字符串
            stutopic.setStutopicId(i+"");
            stutopic.setStudentId(studentId);
            stutopic.setTopicId(topicId);
            stutopic.setFlag("0");
            Calendar cal = Calendar.getInstance();
            Date time = cal.getTime();
            stutopic.setSelectTime(time);
            stutopicService.insert(stutopic);
            studentNum+=1;
            //更新topic表
            topicService.updatestudentNum(studentNum,topicId);
        }
        String url = "redirect:/showmytopicandpaper?studentId=" + studentId;
        return url;
    }
}
