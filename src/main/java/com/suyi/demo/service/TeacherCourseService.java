package com.suyi.demo.service;

import java.util.List;

import com.suyi.demo.model.*;

public interface TeacherCourseService {


    long countByExample(TeacherCourseExample example);

    int deleteByExample(TeacherCourseExample example);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    List<TeacherCourse> selectByExample(TeacherCourseExample example);

    int updateByExampleSelective(TeacherCourse record, TeacherCourseExample example);

    int updateByExample(TeacherCourse record, TeacherCourseExample example);

    int batchInsert(List<TeacherCourse> list);

    List<TeacherCourse> selectAll();

//    int insertcourse(Course course);

}
