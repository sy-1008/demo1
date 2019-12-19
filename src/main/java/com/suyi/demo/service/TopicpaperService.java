package com.suyi.demo.service;

import com.suyi.demo.model.TopicpaperExample;
import java.util.List;
import com.suyi.demo.model.Topicpaper;
public interface TopicpaperService{


    long countByExample(TopicpaperExample example);

    int deleteByExample(TopicpaperExample example);

    int deleteByPrimaryKey(String topicpaperId);

    int insert(Topicpaper record);

    int insertSelective(Topicpaper record);

    List<Topicpaper> selectByExample(TopicpaperExample example);

    Topicpaper selectByPrimaryKey(String topicpaperId);

    int updateByExampleSelective(Topicpaper record,TopicpaperExample example);

    int updateByExample(Topicpaper record,TopicpaperExample example);

    int updateByPrimaryKeySelective(Topicpaper record);

    int updateByPrimaryKey(Topicpaper record);

    int updateBatch(List<Topicpaper> list);

    int batchInsert(List<Topicpaper> list);

}
