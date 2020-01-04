package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.TopicExample;
import com.suyi.demo.model.Topic;
public interface TopicService{


    long countByExample(TopicExample example);

    int deleteByExample(TopicExample example);

    int deleteByPrimaryKey(String topicId);

    int insert(Topic record);

    int insertSelective(Topic record);

    List<Topic> selectByExample(TopicExample example);

    Topic selectByPrimaryKey(String topicId);

    int updateByExampleSelective(Topic record,TopicExample example);

    int updateByExample(Topic record,TopicExample example);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);

    int updateBatch(List<Topic> list);

    int batchInsert(List<Topic> list);

    int updatestudentNum(int studentNum,String topicId);
}
