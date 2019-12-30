package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.mapper.StudentCourseMapper;
import java.util.List;
import com.suyi.demo.model.StudentCourseExample;
import com.suyi.demo.model.StudentCourse;
import com.suyi.demo.service.StudentCourseService;
@Service
public class StudentCourseServiceImpl implements StudentCourseService{

    @Resource
    private StudentCourseMapper studentCourseMapper;

    @Override
    public long countByExample(StudentCourseExample example) {
        return studentCourseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentCourseExample example) {
        return studentCourseMapper.deleteByExample(example);
    }

    @Override
    public int insert(StudentCourse record) {
        return studentCourseMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentCourse record) {
        return studentCourseMapper.insertSelective(record);
    }

    @Override
    public List<StudentCourse> selectByExample(StudentCourseExample example) {
        return studentCourseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(StudentCourse record,StudentCourseExample example) {
        return studentCourseMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(StudentCourse record,StudentCourseExample example) {
        return studentCourseMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<StudentCourse> list) {
        return studentCourseMapper.batchInsert(list);
    }

}
