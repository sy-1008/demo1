package com.suyi.demo.mapper;

import com.suyi.demo.model.TeacherCourseAll;
import com.suyi.demo.model.TeacherCourseAllExample;
import java.util.List;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TeacherCourseAllMapper {
    long countByExample(TeacherCourseAllExample example);

    int deleteByExample(TeacherCourseAllExample example);

    int insert(TeacherCourseAll record);

    int insertSelective(TeacherCourseAll record);

    List<TeacherCourseAll> selectByExample(TeacherCourseAllExample example);

    int updateByExampleSelective(@Param("record") TeacherCourseAll record, @Param("example") TeacherCourseAllExample example);

    int updateByExample(@Param("record") TeacherCourseAll record, @Param("example") TeacherCourseAllExample example);

    int batchInsert(@Param("list") List<TeacherCourseAll> list);

    @ResultMap("BaseResultMap")
    @Select("select * from sy.teacher_course_all where course_name=#{courseName}")
    List<TeacherCourseAll> coursedetailinfo(String courseName);

    @ResultMap("BaseResultMap")
    @Select("select  * from sy.teacher_course_all where teacher_id=#{teacherId}")
    List<TeacherCourseAll> teacherdetailinfo(String teacherId);

    /**
     * 修改教师授课信息
     *
     * @param teacherId
     * @param teacherName
     * @param teaIdentity
     * @param teachHour
     * @param courseId
     * @return
     */
    @ResultMap("BaseResultMap")
    @Update("update sy.tc set tea_identity=#{teaIdentity}," +
            "teach_hour=#{teachHour} WHERE teacher_id=#{teacherId} AND course_id=#{courseId}")
    int teacherinfomodify(String teacherId, String teacherName, String teaIdentity, String teachHour, String courseId);

    /**
     * 删除教师授课信息
     *
     * @param teacherId
     * @param courseId
     * @return
     */
    @Delete("delete from sy.tc WHERE teacher_id=#{teacherId} AND course_id=#{courseId}")
    int deleteteachercourse(String teacherId, String courseId);
}