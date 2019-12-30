package com.suyi.demo.service.impl;

import com.suyi.demo.model.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.suyi.demo.mapper.TeacherCourseMapper;
import com.suyi.demo.service.TeacherCourseService;

@Service
public class TeacherCourseServiceImpl implements TeacherCourseService {

    @Resource
    private TeacherCourseMapper teacherCourseMapper;

    @Override
    public long countByExample(TeacherCourseExample example) {
        return teacherCourseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TeacherCourseExample example) {
        return teacherCourseMapper.deleteByExample(example);
    }

    @Override
    public int insert(TeacherCourse record) {
        return teacherCourseMapper.insert(record);
    }

    @Override
    public int insertSelective(TeacherCourse record) {
        return teacherCourseMapper.insertSelective(record);
    }

    @Override
    public List<TeacherCourse> selectByExample(TeacherCourseExample example) {
        return teacherCourseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TeacherCourse record, TeacherCourseExample example) {
        return teacherCourseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TeacherCourse record, TeacherCourseExample example) {
        return teacherCourseMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<TeacherCourse> list) {
        return teacherCourseMapper.batchInsert(list);
    }

    @Override
    public List<TeacherCourse> selectAll() {
        return teacherCourseMapper.selectAll();
    }

//    @Override
//    public int insertcourse(Course course) {
//        return teacherCourseMapper.insertcourse(course);
//    }


}
