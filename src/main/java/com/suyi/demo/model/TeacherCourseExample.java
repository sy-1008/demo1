package com.suyi.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherCourseExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNull() {
            addCriterion("teacher_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNotNull() {
            addCriterion("teacher_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexEqualTo(String value) {
            addCriterion("teacher_sex =", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotEqualTo(String value) {
            addCriterion("teacher_sex <>", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThan(String value) {
            addCriterion("teacher_sex >", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_sex >=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThan(String value) {
            addCriterion("teacher_sex <", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThanOrEqualTo(String value) {
            addCriterion("teacher_sex <=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLike(String value) {
            addCriterion("teacher_sex like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotLike(String value) {
            addCriterion("teacher_sex not like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIn(List<String> values) {
            addCriterion("teacher_sex in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotIn(List<String> values) {
            addCriterion("teacher_sex not in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexBetween(String value1, String value2) {
            addCriterion("teacher_sex between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotBetween(String value1, String value2) {
            addCriterion("teacher_sex not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleIsNull() {
            addCriterion("teacher_protitle is null");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleIsNotNull() {
            addCriterion("teacher_protitle is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleEqualTo(String value) {
            addCriterion("teacher_protitle =", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleNotEqualTo(String value) {
            addCriterion("teacher_protitle <>", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleGreaterThan(String value) {
            addCriterion("teacher_protitle >", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_protitle >=", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleLessThan(String value) {
            addCriterion("teacher_protitle <", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleLessThanOrEqualTo(String value) {
            addCriterion("teacher_protitle <=", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleLike(String value) {
            addCriterion("teacher_protitle like", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleNotLike(String value) {
            addCriterion("teacher_protitle not like", value, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleIn(List<String> values) {
            addCriterion("teacher_protitle in", values, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleNotIn(List<String> values) {
            addCriterion("teacher_protitle not in", values, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleBetween(String value1, String value2) {
            addCriterion("teacher_protitle between", value1, value2, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProtitleNotBetween(String value1, String value2) {
            addCriterion("teacher_protitle not between", value1, value2, "teacherProtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("teacher_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("teacher_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("teacher_phone =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("teacher_phone <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("teacher_phone >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_phone >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("teacher_phone <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("teacher_phone <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("teacher_phone like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("teacher_phone not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("teacher_phone in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("teacher_phone not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("teacher_phone between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("teacher_phone not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andCourseHourIsNull() {
            addCriterion("course_hour is null");
            return (Criteria) this;
        }

        public Criteria andCourseHourIsNotNull() {
            addCriterion("course_hour is not null");
            return (Criteria) this;
        }

        public Criteria andCourseHourEqualTo(Integer value) {
            addCriterion("course_hour =", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotEqualTo(Integer value) {
            addCriterion("course_hour <>", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourGreaterThan(Integer value) {
            addCriterion("course_hour >", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_hour >=", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourLessThan(Integer value) {
            addCriterion("course_hour <", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourLessThanOrEqualTo(Integer value) {
            addCriterion("course_hour <=", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourIn(List<Integer> values) {
            addCriterion("course_hour in", values, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotIn(List<Integer> values) {
            addCriterion("course_hour not in", values, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourBetween(Integer value1, Integer value2) {
            addCriterion("course_hour between", value1, value2, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotBetween(Integer value1, Integer value2) {
            addCriterion("course_hour not between", value1, value2, "courseHour");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityIsNull() {
            addCriterion("tea_identity is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityIsNotNull() {
            addCriterion("tea_identity is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityEqualTo(String value) {
            addCriterion("tea_identity =", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityNotEqualTo(String value) {
            addCriterion("tea_identity <>", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityGreaterThan(String value) {
            addCriterion("tea_identity >", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("tea_identity >=", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityLessThan(String value) {
            addCriterion("tea_identity <", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityLessThanOrEqualTo(String value) {
            addCriterion("tea_identity <=", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityLike(String value) {
            addCriterion("tea_identity like", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityNotLike(String value) {
            addCriterion("tea_identity not like", value, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityIn(List<String> values) {
            addCriterion("tea_identity in", values, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityNotIn(List<String> values) {
            addCriterion("tea_identity not in", values, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityBetween(String value1, String value2) {
            addCriterion("tea_identity between", value1, value2, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeaIdentityNotBetween(String value1, String value2) {
            addCriterion("tea_identity not between", value1, value2, "teaIdentity");
            return (Criteria) this;
        }

        public Criteria andTeachHourIsNull() {
            addCriterion("teach_hour is null");
            return (Criteria) this;
        }

        public Criteria andTeachHourIsNotNull() {
            addCriterion("teach_hour is not null");
            return (Criteria) this;
        }

        public Criteria andTeachHourEqualTo(Integer value) {
            addCriterion("teach_hour =", value, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourNotEqualTo(Integer value) {
            addCriterion("teach_hour <>", value, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourGreaterThan(Integer value) {
            addCriterion("teach_hour >", value, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("teach_hour >=", value, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourLessThan(Integer value) {
            addCriterion("teach_hour <", value, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourLessThanOrEqualTo(Integer value) {
            addCriterion("teach_hour <=", value, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourIn(List<Integer> values) {
            addCriterion("teach_hour in", values, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourNotIn(List<Integer> values) {
            addCriterion("teach_hour not in", values, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourBetween(Integer value1, Integer value2) {
            addCriterion("teach_hour between", value1, value2, "teachHour");
            return (Criteria) this;
        }

        public Criteria andTeachHourNotBetween(Integer value1, Integer value2) {
            addCriterion("teach_hour not between", value1, value2, "teachHour");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}