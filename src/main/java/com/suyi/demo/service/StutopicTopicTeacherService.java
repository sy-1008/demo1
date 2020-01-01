package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.StutopicTopicTeacherExample;
import com.suyi.demo.model.StutopicTopicTeacher;
public interface StutopicTopicTeacherService{


    long countByExample(StutopicTopicTeacherExample example);

    int deleteByExample(StutopicTopicTeacherExample example);

    int insert(StutopicTopicTeacher record);

    int insertSelective(StutopicTopicTeacher record);

    List<StutopicTopicTeacher> selectByExample(StutopicTopicTeacherExample example);

    int updateByExampleSelective(StutopicTopicTeacher record,StutopicTopicTeacherExample example);

    int updateByExample(StutopicTopicTeacher record,StutopicTopicTeacherExample example);

    int batchInsert(List<StutopicTopicTeacher> list);

}
