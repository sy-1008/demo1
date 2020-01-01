package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.suyi.demo.model.StutopicTopicTeacherExample;
import com.suyi.demo.mapper.StutopicTopicTeacherMapper;
import com.suyi.demo.model.StutopicTopicTeacher;
import com.suyi.demo.service.StutopicTopicTeacherService;
@Service
public class StutopicTopicTeacherServiceImpl implements StutopicTopicTeacherService{

    @Resource
    private StutopicTopicTeacherMapper stutopicTopicTeacherMapper;

    @Override
    public long countByExample(StutopicTopicTeacherExample example) {
        return stutopicTopicTeacherMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StutopicTopicTeacherExample example) {
        return stutopicTopicTeacherMapper.deleteByExample(example);
    }

    @Override
    public int insert(StutopicTopicTeacher record) {
        return stutopicTopicTeacherMapper.insert(record);
    }

    @Override
    public int insertSelective(StutopicTopicTeacher record) {
        return stutopicTopicTeacherMapper.insertSelective(record);
    }

    @Override
    public List<StutopicTopicTeacher> selectByExample(StutopicTopicTeacherExample example) {
        return stutopicTopicTeacherMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(StutopicTopicTeacher record,StutopicTopicTeacherExample example) {
        return stutopicTopicTeacherMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(StutopicTopicTeacher record,StutopicTopicTeacherExample example) {
        return stutopicTopicTeacherMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<StutopicTopicTeacher> list) {
        return stutopicTopicTeacherMapper.batchInsert(list);
    }

}
