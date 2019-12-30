package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.TeacherCourseAllExample;
import com.suyi.demo.model.TeacherCourseAll;
public interface TeacherCourseAllService{


    long countByExample(TeacherCourseAllExample example);

    int deleteByExample(TeacherCourseAllExample example);

    int insert(TeacherCourseAll record);

    int insertSelective(TeacherCourseAll record);

    List<TeacherCourseAll> selectByExample(TeacherCourseAllExample example);

    int updateByExampleSelective(TeacherCourseAll record,TeacherCourseAllExample example);

    int updateByExample(TeacherCourseAll record,TeacherCourseAllExample example);

    int batchInsert(List<TeacherCourseAll> list);

    List<TeacherCourseAll> coursedetailinfo(String courseName);

    List<TeacherCourseAll>teacherdetailinfo(String teacherName);
}
