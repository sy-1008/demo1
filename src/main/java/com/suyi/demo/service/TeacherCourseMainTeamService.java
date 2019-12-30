package com.suyi.demo.service;

import com.suyi.demo.model.TeacherCourseMainTeamExample;
import java.util.List;
import com.suyi.demo.model.TeacherCourseMainTeam;

public interface TeacherCourseMainTeamService {


    long countByExample(TeacherCourseMainTeamExample example);

    int deleteByExample(TeacherCourseMainTeamExample example);

    int insert(TeacherCourseMainTeam record);

    int insertSelective(TeacherCourseMainTeam record);

    List<TeacherCourseMainTeam> selectByExample(TeacherCourseMainTeamExample example);

    int updateByExampleSelective(TeacherCourseMainTeam record, TeacherCourseMainTeamExample example);

    int updateByExample(TeacherCourseMainTeam record, TeacherCourseMainTeamExample example);

    int batchInsert(List<TeacherCourseMainTeam> list);

}

