package com.suyi.demo.mapper;

import com.suyi.demo.model.Topic;
import com.suyi.demo.model.TopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TopicMapper {
    long countByExample(TopicExample example);

    int deleteByExample(TopicExample example);

    int deleteByPrimaryKey(String topicId);

    int insert(Topic record);

    int insertSelective(Topic record);

    List<Topic> selectByExample(TopicExample example);

    Topic selectByPrimaryKey(String topicId);

    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);

    int updateBatch(List<Topic> list);

    /**
     * 更新选题人数
     * @param list
     * @return
     */
    int batchInsert(@Param("list") List<Topic> list);
    @ResultMap("BaseResultMap")
    @Update("update sy.topic set student_num=#{studentNum} where topic_id=#{topicId} ")
    int updatestudentNum(int studentNum,String topicId);
}