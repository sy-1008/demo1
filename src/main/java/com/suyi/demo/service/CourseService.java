package com.suyi.demo.service;

import com.suyi.demo.model.Course;
import com.suyi.demo.model.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface CourseService{


    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(String courseId);

    int updateByExampleSelective(Course record,CourseExample example);

    int updateByExample(Course record,CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    int updateBatch(List<Course> list);

    int batchInsert(List<Course> list);

    List<Course> selectAll();

    Course coursedetailinfo(String courseName);
}
