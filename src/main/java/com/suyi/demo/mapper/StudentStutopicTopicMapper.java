package com.suyi.demo.mapper;

import com.suyi.demo.model.StudentStutopicTopic;
import com.suyi.demo.model.StudentStutopicTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentStutopicTopicMapper {
    long countByExample(StudentStutopicTopicExample example);

    int deleteByExample(StudentStutopicTopicExample example);

    int insert(StudentStutopicTopic record);

    int insertSelective(StudentStutopicTopic record);

    List<StudentStutopicTopic> selectByExample(StudentStutopicTopicExample example);

    int updateByExampleSelective(@Param("record") StudentStutopicTopic record, @Param("example") StudentStutopicTopicExample example);

    int updateByExample(@Param("record") StudentStutopicTopic record, @Param("example") StudentStutopicTopicExample example);

    int batchInsert(@Param("list") List<StudentStutopicTopic> list);
}