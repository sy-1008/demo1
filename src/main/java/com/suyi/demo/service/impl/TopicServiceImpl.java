package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.mapper.TopicMapper;
import java.util.List;
import com.suyi.demo.model.TopicExample;
import com.suyi.demo.model.Topic;
import com.suyi.demo.service.TopicService;
@Service
public class TopicServiceImpl implements TopicService{

    @Resource
    private TopicMapper topicMapper;

    @Override
    public long countByExample(TopicExample example) {
        return topicMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TopicExample example) {
        return topicMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String topicId) {
        return topicMapper.deleteByPrimaryKey(topicId);
    }

    @Override
    public int insert(Topic record) {
        return topicMapper.insert(record);
    }

    @Override
    public int insertSelective(Topic record) {
        return topicMapper.insertSelective(record);
    }

    @Override
    public List<Topic> selectByExample(TopicExample example) {
        return topicMapper.selectByExample(example);
    }

    @Override
    public Topic selectByPrimaryKey(String topicId) {
        return topicMapper.selectByPrimaryKey(topicId);
    }

    @Override
    public int updateByExampleSelective(Topic record,TopicExample example) {
        return topicMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Topic record,TopicExample example) {
        return topicMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Topic record) {
        return topicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Topic record) {
        return topicMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Topic> list) {
        return topicMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Topic> list) {
        return topicMapper.batchInsert(list);
    }

}
