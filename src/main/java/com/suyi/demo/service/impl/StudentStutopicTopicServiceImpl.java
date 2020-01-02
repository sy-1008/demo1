package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.model.StudentStutopicTopicExample;
import com.suyi.demo.model.StudentStutopicTopic;
import java.util.List;
import com.suyi.demo.mapper.StudentStutopicTopicMapper;
import com.suyi.demo.service.StudentStutopicTopicService;
@Service
public class StudentStutopicTopicServiceImpl implements StudentStutopicTopicService{

    @Resource
    private StudentStutopicTopicMapper studentStutopicTopicMapper;

    @Override
    public long countByExample(StudentStutopicTopicExample example) {
        return studentStutopicTopicMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentStutopicTopicExample example) {
        return studentStutopicTopicMapper.deleteByExample(example);
    }

    @Override
    public int insert(StudentStutopicTopic record) {
        return studentStutopicTopicMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentStutopicTopic record) {
        return studentStutopicTopicMapper.insertSelective(record);
    }

    @Override
    public List<StudentStutopicTopic> selectByExample(StudentStutopicTopicExample example) {
        return studentStutopicTopicMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(StudentStutopicTopic record,StudentStutopicTopicExample example) {
        return studentStutopicTopicMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(StudentStutopicTopic record,StudentStutopicTopicExample example) {
        return studentStutopicTopicMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<StudentStutopicTopic> list) {
        return studentStutopicTopicMapper.batchInsert(list);
    }

}
