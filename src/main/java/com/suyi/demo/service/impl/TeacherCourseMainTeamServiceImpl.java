package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.model.TeacherCourseMainTeamExample;
import java.util.List;
import com.suyi.demo.model.TeacherCourseMainTeam;
import com.suyi.demo.mapper.TeacherCourseMainTeamMapper;
import com.suyi.demo.service.TeacherCourseMainTeamService;

@Service
public class TeacherCourseMainTeamServiceImpl implements TeacherCourseMainTeamService {

    @Resource
    private TeacherCourseMainTeamMapper teacherCourseMainTeamMapper;

    @Override
    public long countByExample(TeacherCourseMainTeamExample example) {
        return teacherCourseMainTeamMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TeacherCourseMainTeamExample example) {
        return teacherCourseMainTeamMapper.deleteByExample(example);
    }

    @Override
    public int insert(TeacherCourseMainTeam record) {
        return teacherCourseMainTeamMapper.insert(record);
    }

    @Override
    public int insertSelective(TeacherCourseMainTeam record) {
        return teacherCourseMainTeamMapper.insertSelective(record);
    }

    @Override
    public List<TeacherCourseMainTeam> selectByExample(TeacherCourseMainTeamExample example) {
        return teacherCourseMainTeamMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TeacherCourseMainTeam record, TeacherCourseMainTeamExample example) {
        return teacherCourseMainTeamMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TeacherCourseMainTeam record, TeacherCourseMainTeamExample example) {
        return teacherCourseMainTeamMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<TeacherCourseMainTeam> list) {
        return teacherCourseMainTeamMapper.batchInsert(list);
    }

}

