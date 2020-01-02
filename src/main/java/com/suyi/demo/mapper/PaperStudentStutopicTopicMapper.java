package com.suyi.demo.mapper;

import com.suyi.demo.model.PaperStudentStutopicTopic;
import com.suyi.demo.model.PaperStudentStutopicTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaperStudentStutopicTopicMapper {
    long countByExample(PaperStudentStutopicTopicExample example);

    int deleteByExample(PaperStudentStutopicTopicExample example);

    int insert(PaperStudentStutopicTopic record);

    int insertSelective(PaperStudentStutopicTopic record);

    List<PaperStudentStutopicTopic> selectByExample(PaperStudentStutopicTopicExample example);

    int updateByExampleSelective(@Param("record") PaperStudentStutopicTopic record, @Param("example") PaperStudentStutopicTopicExample example);

    int updateByExample(@Param("record") PaperStudentStutopicTopic record, @Param("example") PaperStudentStutopicTopicExample example);

    int batchInsert(@Param("list") List<PaperStudentStutopicTopic> list);
}