package com.suyi.demo.mapper;

import com.suyi.demo.model.TeacherCourseTopic;
import com.suyi.demo.model.TeacherCourseTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeacherCourseTopicMapper {
    long countByExample(TeacherCourseTopicExample example);

    int deleteByExample(TeacherCourseTopicExample example);

    int insert(TeacherCourseTopic record);

    int insertSelective(TeacherCourseTopic record);

    List<TeacherCourseTopic> selectByExample(TeacherCourseTopicExample example);

    int updateByExampleSelective(@Param("record") TeacherCourseTopic record, @Param("example") TeacherCourseTopicExample example);

    int updateByExample(@Param("record") TeacherCourseTopic record, @Param("example") TeacherCourseTopicExample example);

    int batchInsert(@Param("list") List<TeacherCourseTopic> list);
}