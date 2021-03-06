package com.suyi.demo.model;

import java.io.Serializable;
import java.util.Date;

public class StutopicTopicTeacher implements Serializable {
    /**
    * StuTopicID
    */
    private String stuTopicId;

    /**
    * 学号
    */
    private String studentId;

    /**
    * 选题时间
    */
    private Date selectTime;

    /**
    * 是否已经上传论文（0表示未上传，1表示已上传）
    */
    private String flag;

    /**
    * 主题ID
    */
    private String topicId;

    /**
    * 课程ID
    */
    private String courseId;

    /**
    * 出题教师 ID
    */
    private String teacherId;

    /**
    * 主题名
    */
    private String topic;

    /**
    * 关键词
    */
    private String keyword;

    /**
    * 创建时间
    */
    private Date creationTime;

    /**
    * 已选学生人数（每个主题最多被 5 名学生所选）
    */
    private Integer studentNum;

    /**
    * 姓名
    */
    private String name;

    /**
    * 性别
    */
    private String sex;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 教师职称
    */
    private String protitle;

    private static final long serialVersionUID = 1L;

    public String getStuTopicId() {
        return stuTopicId;
    }

    public void setStuTopicId(String stuTopicId) {
        this.stuTopicId = stuTopicId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getSelectTime() {
        return selectTime;
    }

    public void setSelectTime(Date selectTime) {
        this.selectTime = selectTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProtitle() {
        return protitle;
    }

    public void setProtitle(String protitle) {
        this.protitle = protitle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuTopicId=").append(stuTopicId);
        sb.append(", studentId=").append(studentId);
        sb.append(", selectTime=").append(selectTime);
        sb.append(", flag=").append(flag);
        sb.append(", topicId=").append(topicId);
        sb.append(", courseId=").append(courseId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", topic=").append(topic);
        sb.append(", keyword=").append(keyword);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", studentNum=").append(studentNum);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", protitle=").append(protitle);
        sb.append("]");
        return sb.toString();
    }
}