package com.suyi.demo.mapper;

import com.suyi.demo.model.TeacherCourseMainTeam;
import com.suyi.demo.model.TeacherCourseMainTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeacherCourseMainTeamMapper {
    long countByExample(TeacherCourseMainTeamExample example);

    int deleteByExample(TeacherCourseMainTeamExample example);

    int insert(TeacherCourseMainTeam record);

    int insertSelective(TeacherCourseMainTeam record);

    List<TeacherCourseMainTeam> selectByExample(TeacherCourseMainTeamExample example);

    int updateByExampleSelective(@Param("record") TeacherCourseMainTeam record, @Param("example") TeacherCourseMainTeamExample example);

    int updateByExample(@Param("record") TeacherCourseMainTeam record, @Param("example") TeacherCourseMainTeamExample example);

    int batchInsert(@Param("list") List<TeacherCourseMainTeam> list);
}