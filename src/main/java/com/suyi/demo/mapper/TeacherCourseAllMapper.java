package com.suyi.demo.mapper;

import com.suyi.demo.model.TeacherCourseAll;
import com.suyi.demo.model.TeacherCourseAllExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeacherCourseAllMapper {
    long countByExample(TeacherCourseAllExample example);

    int deleteByExample(TeacherCourseAllExample example);

    int insert(TeacherCourseAll record);

    int insertSelective(TeacherCourseAll record);

    List<TeacherCourseAll> selectByExample(TeacherCourseAllExample example);

    int updateByExampleSelective(@Param("record") TeacherCourseAll record, @Param("example") TeacherCourseAllExample example);

    int updateByExample(@Param("record") TeacherCourseAll record, @Param("example") TeacherCourseAllExample example);

    int batchInsert(@Param("list") List<TeacherCourseAll> list);

    @ResultMap("BaseResultMap")
    @Select("select * from sy.teacher_course_all where course_name=#{courseName}")
    List<TeacherCourseAll> coursedetailinfo(String courseName);
    @ResultMap("BaseResultMap")
    @Select("select  * from sy.teacher_course_all where teacher_name=#{teacherName}")
    List<TeacherCourseAll>teacherdetailinfo(String teacherName);
}