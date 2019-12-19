package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.StutopicExample;
import com.suyi.demo.model.Stutopic;
public interface StutopicService{


    long countByExample(StutopicExample example);

    int deleteByExample(StutopicExample example);

    int deleteByPrimaryKey(String stutopicId);

    int insert(Stutopic record);

    int insertSelective(Stutopic record);

    List<Stutopic> selectByExample(StutopicExample example);

    Stutopic selectByPrimaryKey(String stutopicId);

    int updateByExampleSelective(Stutopic record,StutopicExample example);

    int updateByExample(Stutopic record,StutopicExample example);

    int updateByPrimaryKeySelective(Stutopic record);

    int updateByPrimaryKey(Stutopic record);

    int updateBatch(List<Stutopic> list);

    int batchInsert(List<Stutopic> list);

}
