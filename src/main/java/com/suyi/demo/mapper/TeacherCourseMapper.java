package com.suyi.demo.mapper;

import com.suyi.demo.model.*;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
public interface TeacherCourseMapper {
    long countByExample(TeacherCourseExample example);

    int deleteByExample(TeacherCourseExample example);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    List<TeacherCourse> selectByExample(TeacherCourseExample example);

    int updateByExampleSelective(@Param("record") TeacherCourse record, @Param("example") TeacherCourseExample example);

    int updateByExample(@Param("record") TeacherCourse record, @Param("example") TeacherCourseExample example);

    int batchInsert(@Param("list") List<TeacherCourse> list);
    @ResultMap("BaseResultMap")
    @Select("select * from sy.teacher_course")
    List<TeacherCourse>selectAll();

//    @ResultMap("BaseResultMap")
//    @Select("insert into sy.teacher_course(teacher_id, teacher_name, teacher_sex, teacher_protitle, teacher_phone, course_id, course_name, term, course_hour, tea_identity, teach_hour) values (null ,null,null ,null,null,#{course.getCourseId(),#{course.getCourseName(),#{course.getTerm()},#{course.getCourseHour()},null ,null )")
//    int insertcourse(Course course);

}