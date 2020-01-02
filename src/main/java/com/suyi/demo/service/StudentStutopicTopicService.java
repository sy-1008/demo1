package com.suyi.demo.service;

import com.suyi.demo.model.StudentStutopicTopicExample;
import com.suyi.demo.model.StudentStutopicTopic;
import java.util.List;
public interface StudentStutopicTopicService{


    long countByExample(StudentStutopicTopicExample example);

    int deleteByExample(StudentStutopicTopicExample example);

    int insert(StudentStutopicTopic record);

    int insertSelective(StudentStutopicTopic record);

    List<StudentStutopicTopic> selectByExample(StudentStutopicTopicExample example);

    int updateByExampleSelective(StudentStutopicTopic record,StudentStutopicTopicExample example);

    int updateByExample(StudentStutopicTopic record,StudentStutopicTopicExample example);

    int batchInsert(List<StudentStutopicTopic> list);

}
