package com.suyi.demo.model;

import java.io.Serializable;

public class TeacherCourseMainTeam implements Serializable {
    /**
     * 教师ID
     */
    private String teacherId;

    /**
     * 姓名
     */
    private String teacherName;

    /**
     * 课程ID
     */
    private String courseId;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 开设学期
     */
    private String term;

    /**
     * 课时数
     */
    private Integer courseHour;

    /**
     * 身份（主讲教师或者团队教师）
     */
    private String teaIdentityMain;

    /**
     * 教师ID
     */
    private String teacherTeamId;

    /**
     * 姓名
     */
    private String teacherTeamName;

    /**
     * 身份（主讲教师或者团队教师）
     */
    private String teacherCourseTeam;

    private static final long serialVersionUID = 1L;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }

    public String getTeaIdentityMain() {
        return teaIdentityMain;
    }

    public void setTeaIdentityMain(String teaIdentityMain) {
        this.teaIdentityMain = teaIdentityMain;
    }

    public String getTeacherTeamId() {
        return teacherTeamId;
    }

    public void setTeacherTeamId(String teacherTeamId) {
        this.teacherTeamId = teacherTeamId;
    }

    public String getTeacherTeamName() {
        return teacherTeamName;
    }

    public void setTeacherTeamName(String teacherTeamName) {
        this.teacherTeamName = teacherTeamName;
    }

    public String getTeacherCourseTeam() {
        return teacherCourseTeam;
    }

    public void setTeacherCourseTeam(String teacherCourseTeam) {
        this.teacherCourseTeam = teacherCourseTeam;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", term=").append(term);
        sb.append(", courseHour=").append(courseHour);
        sb.append(", teaIdentityMain=").append(teaIdentityMain);
        sb.append(", teacherTeamId=").append(teacherTeamId);
        sb.append(", teacherTeamName=").append(teacherTeamName);
        sb.append(", teacherCourseTeam=").append(teacherCourseTeam);
        sb.append("]");
        return sb.toString();
    }
}