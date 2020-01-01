package com.suyi.demo.mapper;

import com.suyi.demo.model.StutopicTopicTeacher;
import com.suyi.demo.model.StutopicTopicTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StutopicTopicTeacherMapper {
    long countByExample(StutopicTopicTeacherExample example);

    int deleteByExample(StutopicTopicTeacherExample example);

    int insert(StutopicTopicTeacher record);

    int insertSelective(StutopicTopicTeacher record);

    List<StutopicTopicTeacher> selectByExample(StutopicTopicTeacherExample example);

    int updateByExampleSelective(@Param("record") StutopicTopicTeacher record, @Param("example") StutopicTopicTeacherExample example);

    int updateByExample(@Param("record") StutopicTopicTeacher record, @Param("example") StutopicTopicTeacherExample example);

    int batchInsert(@Param("list") List<StutopicTopicTeacher> list);
}