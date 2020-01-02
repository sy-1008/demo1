package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.PaperStudentStutopicTopic;
import com.suyi.demo.model.PaperStudentStutopicTopicExample;
public interface PaperStudentStutopicTopicService{


    long countByExample(PaperStudentStutopicTopicExample example);

    int deleteByExample(PaperStudentStutopicTopicExample example);

    int insert(PaperStudentStutopicTopic record);

    int insertSelective(PaperStudentStutopicTopic record);

    List<PaperStudentStutopicTopic> selectByExample(PaperStudentStutopicTopicExample example);

    int updateByExampleSelective(PaperStudentStutopicTopic record,PaperStudentStutopicTopicExample example);

    int updateByExample(PaperStudentStutopicTopic record,PaperStudentStutopicTopicExample example);

    int batchInsert(List<PaperStudentStutopicTopic> list);

}
