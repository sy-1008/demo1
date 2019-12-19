package com.suyi.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.model.Course;
import com.suyi.demo.model.CourseExample;
import java.util.List;
import com.suyi.demo.mapper.CourseMapper;
import com.suyi.demo.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{

    @Resource
    private CourseMapper courseMapper;

    @Override
    public long countByExample(CourseExample example) {
        return courseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CourseExample example) {
        return courseMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String courseId) {
        return courseMapper.deleteByPrimaryKey(courseId);
    }

    @Override
    public int insert(Course record) {
        return courseMapper.insert(record);
    }

    @Override
    public int insertSelective(Course record) {
        return courseMapper.insertSelective(record);
    }

    @Override
    public List<Course> selectByExample(CourseExample example) {
        return courseMapper.selectByExample(example);
    }

    @Override
    public Course selectByPrimaryKey(String courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public int updateByExampleSelective(Course record,CourseExample example) {
        return courseMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Course record,CourseExample example) {
        return courseMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Course record) {
        return courseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Course> list) {
        return courseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Course> list) {
        return courseMapper.batchInsert(list);
    }



    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }
    @Override
   public  Course coursedetailinfo(){
        return courseMapper.coursedetailinfo();
    }

}
