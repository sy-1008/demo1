package com.suyi.demo.controller;

import com.suyi.demo.model.Course;
import com.suyi.demo.model.Tc;
import com.suyi.demo.model.TeacherCourseAll;
import com.suyi.demo.model.TeacherCourseAllExample;
import com.suyi.demo.service.CourseService;
import com.suyi.demo.service.TcService;
import com.suyi.demo.service.TeacherCourseAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TcController {
    @Autowired
    TcService tcService;
    @Autowired
    CourseService courseService;
    @Autowired
    TeacherCourseAllService teacherCourseAllService;

    @RequestMapping(value = "/addTc", method = RequestMethod.POST)
    public String addTc(Tc tc, HttpServletRequest request) {
        String courseId = request.getParameter("courseId");
        String teaIdentity=request.getParameter("teaIdentity");
        //判断课时数冲突
        Course course = courseService.selectByPrimaryKey(courseId);
        int courseHour = course.getCourseHour();
        TeacherCourseAllExample teacherCourseAllExample = new TeacherCourseAllExample();
        teacherCourseAllExample.createCriteria().andCourseIdEqualTo(courseId);
        List<TeacherCourseAll> teacherCourseAlls = teacherCourseAllService.selectByExample(teacherCourseAllExample);
        int temp = 0;
        for (int i = 0; i < teacherCourseAlls.size(); i++) {

            temp = temp + teacherCourseAlls.get(i).getTeachHour();

        }
        temp = temp + Integer.parseInt(request.getParameter("teachHour"));
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
        if (temp <= courseHour&&!flag) {
            tcService.insert(tc);
        }
        String url = "redirect:/showteacherinfobycourseName?courseId=" + courseId;
        return url;
    }
}
