package com.suyi.demo.model;

import java.io.Serializable;

public class TeacherCourseAll implements Serializable {
    /**
     * 教师ID
     */
    private String teacherId;

    /**
     * 姓名
     */
    private String teacherName;

    /**
     * 性别
     */
    private String teacherSex;

    /**
     * 教师职称
     */
    private String teacherProtitle;

    /**
     * 手机号
     */
    private String teacherPhone;

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
    private String teaIdentity;

    /**
     * 授课学时
     */
    private Integer teachHour;

    /**
     * TCID
     */
    private String tcId;

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

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public String getTeacherProtitle() {
        return teacherProtitle;
    }

    public void setTeacherProtitle(String teacherProtitle) {
        this.teacherProtitle = teacherProtitle;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
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

    public String getTeaIdentity() {
        return teaIdentity;
    }

    public void setTeaIdentity(String teaIdentity) {
        this.teaIdentity = teaIdentity;
    }

    public Integer getTeachHour() {
        return teachHour;
    }

    public void setTeachHour(Integer teachHour) {
        this.teachHour = teachHour;
    }

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", teacherSex=").append(teacherSex);
        sb.append(", teacherProtitle=").append(teacherProtitle);
        sb.append(", teacherPhone=").append(teacherPhone);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", term=").append(term);
        sb.append(", courseHour=").append(courseHour);
        sb.append(", teaIdentity=").append(teaIdentity);
        sb.append(", teachHour=").append(teachHour);
        sb.append(", tcId=").append(tcId);
        sb.append("]");
        return sb.toString();
    }
}