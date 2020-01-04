package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.mapper.TeacherCourseAllMapper;
import java.util.List;
import com.suyi.demo.model.TeacherCourseAllExample;
import com.suyi.demo.model.TeacherCourseAll;
import com.suyi.demo.service.TeacherCourseAllService;

@Service
public class TeacherCourseAllServiceImpl implements TeacherCourseAllService {

    @Resource
    private TeacherCourseAllMapper teacherCourseAllMapper;

    @Override
    public long countByExample(TeacherCourseAllExample example) {
        return teacherCourseAllMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TeacherCourseAllExample example) {
        return teacherCourseAllMapper.deleteByExample(example);
    }

    @Override
    public int insert(TeacherCourseAll record) {
        return teacherCourseAllMapper.insert(record);
    }

    @Override
    public int insertSelective(TeacherCourseAll record) {
        return teacherCourseAllMapper.insertSelective(record);
    }

    @Override
    public List<TeacherCourseAll> selectByExample(TeacherCourseAllExample example) {
        return teacherCourseAllMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TeacherCourseAll record, TeacherCourseAllExample example) {
        return teacherCourseAllMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TeacherCourseAll record, TeacherCourseAllExample example) {
        return teacherCourseAllMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<TeacherCourseAll> list) {
        return teacherCourseAllMapper.batchInsert(list);
    }

    @Override
    public List<TeacherCourseAll> coursedetailinfo(String courseName) {
        return teacherCourseAllMapper.coursedetailinfo(courseName);
    }

    @Override
    public List<TeacherCourseAll> teacherdetailinfo(String teacherId) {
        return teacherCourseAllMapper.teacherdetailinfo(teacherId);
    }

    @Override
    public int teacherinfomodify(String teacherId, String teacherName, String teaIdentity, String teachHour, String courseId) {
        return teacherCourseAllMapper.teacherinfomodify(teacherId, teacherName, teaIdentity, teachHour, courseId);
    }

    @Override
    public int deleteteachercourse(String teacherId, String courseId) {
        return teacherCourseAllMapper.deleteteachercourse(teacherId, courseId);
    }

}

