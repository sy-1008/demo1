package com.suyi.demo.mapper;

import com.suyi.demo.model.StudentScCourseTcTeacher;
import com.suyi.demo.model.StudentScCourseTcTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentScCourseTcTeacherMapper {
    long countByExample(StudentScCourseTcTeacherExample example);

    int deleteByExample(StudentScCourseTcTeacherExample example);

    int insert(StudentScCourseTcTeacher record);

    int insertSelective(StudentScCourseTcTeacher record);

    List<StudentScCourseTcTeacher> selectByExample(StudentScCourseTcTeacherExample example);

    int updateByExampleSelective(@Param("record") StudentScCourseTcTeacher record, @Param("example") StudentScCourseTcTeacherExample example);

    int updateByExample(@Param("record") StudentScCourseTcTeacher record, @Param("example") StudentScCourseTcTeacherExample example);

    int batchInsert(@Param("list") List<StudentScCourseTcTeacher> list);
}