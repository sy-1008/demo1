package com.suyi.demo.model;

import java.io.Serializable;

public class StudentScCourseTcTeacher implements Serializable {
    /**
    * SCID
    */
    private String scId;

    /**
    * 学号
    */
    private String studentId;

    /**
    * 姓名
    */
    private String studentName;

    /**
    * 性别
    */
    private String studentSex;

    /**
    * 专业
    */
    private String studentMajor;

    /**
    * 班级
    */
    private String studentClassName;

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
    * 成绩
    */
    private Integer score;

    /**
    * 教师ID
    */
    private String teacherId;

    /**
    * 身份（主讲教师或者团队教师）
    */
    private String teaIdentity;

    /**
    * 授课学时
    */
    private Integer teachHour;

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
    private String protitle;

    /**
    * 手机号
    */
    private String phone;

    private static final long serialVersionUID = 1L;

    public String getScId() {
        return scId;
    }

    public void setScId(String scId) {
        this.scId = scId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentClassName() {
        return studentClassName;
    }

    public void setStudentClassName(String studentClassName) {
        this.studentClassName = studentClassName;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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

    public String getProtitle() {
        return protitle;
    }

    public void setProtitle(String protitle) {
        this.protitle = protitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scId=").append(scId);
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentSex=").append(studentSex);
        sb.append(", studentMajor=").append(studentMajor);
        sb.append(", studentClassName=").append(studentClassName);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", term=").append(term);
        sb.append(", courseHour=").append(courseHour);
        sb.append(", score=").append(score);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teaIdentity=").append(teaIdentity);
        sb.append(", teachHour=").append(teachHour);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", teacherSex=").append(teacherSex);
        sb.append(", protitle=").append(protitle);
        sb.append(", phone=").append(phone);
        sb.append("]");
        return sb.toString();
    }
}