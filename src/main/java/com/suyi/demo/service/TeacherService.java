package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.Teacher;
import com.suyi.demo.model.TeacherExample;
public interface TeacherService{


    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String teacherId);

    int updateByExampleSelective(Teacher record,TeacherExample example);

    int updateByExample(Teacher record,TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    int updateBatch(List<Teacher> list);

    int batchInsert(List<Teacher> list);

    List<Teacher>selectALL();
    void teacherregisterByteacherID(String teacherId,String name,String password,int role,String sex,String protitle,String phone);

    Teacher teacherdetailinfo(String name);
}
