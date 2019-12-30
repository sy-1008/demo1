package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.StudentCourseExample;
import com.suyi.demo.model.StudentCourse;
public interface StudentCourseService{


    long countByExample(StudentCourseExample example);

    int deleteByExample(StudentCourseExample example);

    int insert(StudentCourse record);

    int insertSelective(StudentCourse record);

    List<StudentCourse> selectByExample(StudentCourseExample example);

    int updateByExampleSelective(StudentCourse record,StudentCourseExample example);

    int updateByExample(StudentCourse record,StudentCourseExample example);

    int batchInsert(List<StudentCourse> list);

}
