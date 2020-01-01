package com.suyi.demo.service;

import com.suyi.demo.model.TeacherCourseTopic;
import java.util.List;
import com.suyi.demo.model.TeacherCourseTopicExample;
public interface TeacherCourseTopicService{


    long countByExample(TeacherCourseTopicExample example);

    int deleteByExample(TeacherCourseTopicExample example);

    int insert(TeacherCourseTopic record);

    int insertSelective(TeacherCourseTopic record);

    List<TeacherCourseTopic> selectByExample(TeacherCourseTopicExample example);

    int updateByExampleSelective(TeacherCourseTopic record,TeacherCourseTopicExample example);

    int updateByExample(TeacherCourseTopic record,TeacherCourseTopicExample example);

    int batchInsert(List<TeacherCourseTopic> list);

}
