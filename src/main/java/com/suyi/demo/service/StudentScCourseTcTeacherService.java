package com.suyi.demo.service;

import java.util.List;
import com.suyi.demo.model.StudentScCourseTcTeacherExample;
import com.suyi.demo.model.StudentScCourseTcTeacher;
public interface StudentScCourseTcTeacherService{


    long countByExample(StudentScCourseTcTeacherExample example);

    int deleteByExample(StudentScCourseTcTeacherExample example);

    int insert(StudentScCourseTcTeacher record);

    int insertSelective(StudentScCourseTcTeacher record);

    List<StudentScCourseTcTeacher> selectByExample(StudentScCourseTcTeacherExample example);

    int updateByExampleSelective(StudentScCourseTcTeacher record,StudentScCourseTcTeacherExample example);

    int updateByExample(StudentScCourseTcTeacher record,StudentScCourseTcTeacherExample example);

    int batchInsert(List<StudentScCourseTcTeacher> list);

}
