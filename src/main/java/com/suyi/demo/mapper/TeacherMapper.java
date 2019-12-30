package com.suyi.demo.mapper;

import com.suyi.demo.model.*;

import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String teacherId);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    int updateBatch(List<Teacher> list);

    int batchInsert(@Param("list") List<Teacher> list);

    @ResultMap("BaseResultMap")
    @Select("select * from sy.teacher")
    List<Teacher>selectALL();
    @ResultMap("BaseResultMap")
    @Select("select * from sy.teacher where name=#{name}")
    Teacher teacherdetailinfo(String name);

//    /**
//     * 管理员或教师用户登录名
//     * @param user
//     * @return
//     */
//    @ResultMap("BaseResultMap")
//    @Select("select  * from sy.teacher where teacher_id=#{user.getUserId()}")
//    Teacher FindteacherName(User user);


}