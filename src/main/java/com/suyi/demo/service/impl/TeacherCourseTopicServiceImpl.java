package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.model.TeacherCourseTopic;
import java.util.List;
import com.suyi.demo.mapper.TeacherCourseTopicMapper;
import com.suyi.demo.model.TeacherCourseTopicExample;
import com.suyi.demo.service.TeacherCourseTopicService;
@Service
public class TeacherCourseTopicServiceImpl implements TeacherCourseTopicService{

    @Resource
    private TeacherCourseTopicMapper teacherCourseTopicMapper;

    @Override
    public long countByExample(TeacherCourseTopicExample example) {
        return teacherCourseTopicMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TeacherCourseTopicExample example) {
        return teacherCourseTopicMapper.deleteByExample(example);
    }

    @Override
    public int insert(TeacherCourseTopic record) {
        return teacherCourseTopicMapper.insert(record);
    }

    @Override
    public int insertSelective(TeacherCourseTopic record) {
        return teacherCourseTopicMapper.insertSelective(record);
    }

    @Override
    public List<TeacherCourseTopic> selectByExample(TeacherCourseTopicExample example) {
        return teacherCourseTopicMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TeacherCourseTopic record,TeacherCourseTopicExample example) {
        return teacherCourseTopicMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TeacherCourseTopic record,TeacherCourseTopicExample example) {
        return teacherCourseTopicMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<TeacherCourseTopic> list) {
        return teacherCourseTopicMapper.batchInsert(list);
    }

}
