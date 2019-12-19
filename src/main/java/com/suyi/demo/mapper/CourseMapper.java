package com.suyi.demo.mapper;

import com.suyi.demo.model.Course;
import com.suyi.demo.model.CourseExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(String courseId);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    int updateBatch(List<Course> list);

    int batchInsert(@Param("list") List<Course> list);



    @ResultMap("BaseResultMap")
    @Select("select * from sy.course")
    List<Course> selectAll();

    @ResultMap("BaseResultMap")
    @Select("select * from sy.course where course_name='java'")
    Course coursedetailinfo();
}