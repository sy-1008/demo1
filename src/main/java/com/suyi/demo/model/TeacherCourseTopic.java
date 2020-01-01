package com.suyi.demo.model;

import java.io.Serializable;
import java.util.Date;

public class TeacherCourseTopic implements Serializable {
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
    * 主题ID
    */
    private String topicId;

    /**
    * 主题名
    */
    private String topic;

    /**
    * 关键词
    */
    private String topicKeyword;

    /**
    * 创建时间
    */
    private Date topicCreationTime;

    /**
    * 已选学生人数（每个主题最多被 5 名学生所选）
    */
    private Integer topicStudentNum;

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

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopicKeyword() {
        return topicKeyword;
    }

    public void setTopicKeyword(String topicKeyword) {
        this.topicKeyword = topicKeyword;
    }

    public Date getTopicCreationTime() {
        return topicCreationTime;
    }

    public void setTopicCreationTime(Date topicCreationTime) {
        this.topicCreationTime = topicCreationTime;
    }

    public Integer getTopicStudentNum() {
        return topicStudentNum;
    }

    public void setTopicStudentNum(Integer topicStudentNum) {
        this.topicStudentNum = topicStudentNum;
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
        sb.append(", topicId=").append(topicId);
        sb.append(", topic=").append(topic);
        sb.append(", topicKeyword=").append(topicKeyword);
        sb.append(", topicCreationTime=").append(topicCreationTime);
        sb.append(", topicStudentNum=").append(topicStudentNum);
        sb.append("]");
        return sb.toString();
    }
}