package com.suyi.demo.service.impl;

import com.suyi.demo.mapper.UserMapper;
import com.suyi.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.suyi.demo.mapper.StudentMapper;
import com.suyi.demo.model.StudentExample;
import com.suyi.demo.model.Student;
import com.suyi.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private UserMapper userMapper;
    @Override
    public long countByExample(StudentExample example) {
        return studentMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentExample example) {
        return studentMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String studentId) {
        return studentMapper.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public List<Student> selectByExample(StudentExample example) {
        return studentMapper.selectByExample(example);
    }

    @Override
    public Student selectByPrimaryKey(String studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByExampleSelective(Student record, StudentExample example) {
        return studentMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Student record, StudentExample example) {
        return studentMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Student> list) {
        return studentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Student> list) {
        return studentMapper.batchInsert(list);
    }

    @Override
    public Student studentregisterByStudentid(String studentId, String name, String password, String sex, String major, String className) {
        User user = new User();
        user.setUserId(studentId);
        user.setPassword(password);
        user.setRole(3);
        userMapper.insert(user);
        Student student = new Student();
        student.setStudentId(studentId);
        student.setName(name);
        student.setSex(sex);
        student.setMajor(major);
        student.setClassName(className);
        studentMapper.insert(student);

        return student;
    }



}
