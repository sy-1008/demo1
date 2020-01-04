package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.suyi.demo.model.StudentScCourseTcTeacherExample;
import com.suyi.demo.mapper.StudentScCourseTcTeacherMapper;
import com.suyi.demo.model.StudentScCourseTcTeacher;
import com.suyi.demo.service.StudentScCourseTcTeacherService;
@Service
public class StudentScCourseTcTeacherServiceImpl implements StudentScCourseTcTeacherService{

    @Resource
    private StudentScCourseTcTeacherMapper studentScCourseTcTeacherMapper;

    @Override
    public long countByExample(StudentScCourseTcTeacherExample example) {
        return studentScCourseTcTeacherMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentScCourseTcTeacherExample example) {
        return studentScCourseTcTeacherMapper.deleteByExample(example);
    }

    @Override
    public int insert(StudentScCourseTcTeacher record) {
        return studentScCourseTcTeacherMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentScCourseTcTeacher record) {
        return studentScCourseTcTeacherMapper.insertSelective(record);
    }

    @Override
    public List<StudentScCourseTcTeacher> selectByExample(StudentScCourseTcTeacherExample example) {
        return studentScCourseTcTeacherMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(StudentScCourseTcTeacher record,StudentScCourseTcTeacherExample example) {
        return studentScCourseTcTeacherMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(StudentScCourseTcTeacher record,StudentScCourseTcTeacherExample example) {
        return studentScCourseTcTeacherMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<StudentScCourseTcTeacher> list) {
        return studentScCourseTcTeacherMapper.batchInsert(list);
    }

}
