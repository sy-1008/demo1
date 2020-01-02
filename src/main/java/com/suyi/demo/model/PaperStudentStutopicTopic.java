package com.suyi.demo.model;

import java.io.Serializable;
import java.util.Date;

public class PaperStudentStutopicTopic implements Serializable {
    /**
    * 论文ID
    */
    private String paperId;

    /**
    * 论文题目
    */
    private String title;

    /**
    * 作者
    */
    private String author;

    /**
    * 出处
    */
    private String source;

    /**
    * 关键词
    */
    private String paperKeyword;

    /**
    * 摘要
    */
    private String abstractText;

    /**
    * 文件物理位置
    */
    private String docLocation;

    /**
    * 上传时间
    */
    private Date uploadingTime;

    /**
    * 学号
    */
    private String studentId;

    /**
    * 姓名
    */
    private String name;

    /**
    * 性别
    */
    private String sex;

    /**
    * 专业
    */
    private String major;

    /**
    * 班级
    */
    private String className;

    /**
    * StuTopicID
    */
    private String stutopicId;

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
    private String topicKeyword;

    /**
    * 创建时间
    */
    private Date creationTime;

    /**
    * 已选学生人数（每个主题最多被 5 名学生所选）
    */
    private Integer studentNum;

    private static final long serialVersionUID = 1L;

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPaperKeyword() {
        return paperKeyword;
    }

    public void setPaperKeyword(String paperKeyword) {
        this.paperKeyword = paperKeyword;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public String getDocLocation() {
        return docLocation;
    }

    public void setDocLocation(String docLocation) {
        this.docLocation = docLocation;
    }

    public Date getUploadingTime() {
        return uploadingTime;
    }

    public void setUploadingTime(Date uploadingTime) {
        this.uploadingTime = uploadingTime;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStutopicId() {
        return stutopicId;
    }

    public void setStutopicId(String stutopicId) {
        this.stutopicId = stutopicId;
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

    public String getTopicKeyword() {
        return topicKeyword;
    }

    public void setTopicKeyword(String topicKeyword) {
        this.topicKeyword = topicKeyword;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paperId=").append(paperId);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", source=").append(source);
        sb.append(", paperKeyword=").append(paperKeyword);
        sb.append(", abstractText=").append(abstractText);
        sb.append(", docLocation=").append(docLocation);
        sb.append(", uploadingTime=").append(uploadingTime);
        sb.append(", studentId=").append(studentId);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", major=").append(major);
        sb.append(", className=").append(className);
        sb.append(", stutopicId=").append(stutopicId);
        sb.append(", selectTime=").append(selectTime);
        sb.append(", flag=").append(flag);
        sb.append(", topicId=").append(topicId);
        sb.append(", courseId=").append(courseId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", topic=").append(topic);
        sb.append(", topicKeyword=").append(topicKeyword);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", studentNum=").append(studentNum);
        sb.append("]");
        return sb.toString();
    }
}