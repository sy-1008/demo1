package com.suyi.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TopicpaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicpaperExample() {
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

        public Criteria andTopicpaperIdIsNull() {
            addCriterion("topicpaper_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdIsNotNull() {
            addCriterion("topicpaper_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdEqualTo(String value) {
            addCriterion("topicpaper_id =", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdNotEqualTo(String value) {
            addCriterion("topicpaper_id <>", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdGreaterThan(String value) {
            addCriterion("topicpaper_id >", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("topicpaper_id >=", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdLessThan(String value) {
            addCriterion("topicpaper_id <", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdLessThanOrEqualTo(String value) {
            addCriterion("topicpaper_id <=", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdLike(String value) {
            addCriterion("topicpaper_id like", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdNotLike(String value) {
            addCriterion("topicpaper_id not like", value, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdIn(List<String> values) {
            addCriterion("topicpaper_id in", values, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdNotIn(List<String> values) {
            addCriterion("topicpaper_id not in", values, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdBetween(String value1, String value2) {
            addCriterion("topicpaper_id between", value1, value2, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andTopicpaperIdNotBetween(String value1, String value2) {
            addCriterion("topicpaper_id not between", value1, value2, "topicpaperId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdIsNull() {
            addCriterion("stutopic_id is null");
            return (Criteria) this;
        }

        public Criteria andStutopicIdIsNotNull() {
            addCriterion("stutopic_id is not null");
            return (Criteria) this;
        }

        public Criteria andStutopicIdEqualTo(String value) {
            addCriterion("stutopic_id =", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdNotEqualTo(String value) {
            addCriterion("stutopic_id <>", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdGreaterThan(String value) {
            addCriterion("stutopic_id >", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdGreaterThanOrEqualTo(String value) {
            addCriterion("stutopic_id >=", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdLessThan(String value) {
            addCriterion("stutopic_id <", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdLessThanOrEqualTo(String value) {
            addCriterion("stutopic_id <=", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdLike(String value) {
            addCriterion("stutopic_id like", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdNotLike(String value) {
            addCriterion("stutopic_id not like", value, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdIn(List<String> values) {
            addCriterion("stutopic_id in", values, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdNotIn(List<String> values) {
            addCriterion("stutopic_id not in", values, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdBetween(String value1, String value2) {
            addCriterion("stutopic_id between", value1, value2, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andStutopicIdNotBetween(String value1, String value2) {
            addCriterion("stutopic_id not between", value1, value2, "stutopicId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(String value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(String value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(String value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(String value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(String value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLike(String value) {
            addCriterion("paper_id like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotLike(String value) {
            addCriterion("paper_id not like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<String> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<String> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(String value1, String value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(String value1, String value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andRelevancyIsNull() {
            addCriterion("relevancy is null");
            return (Criteria) this;
        }

        public Criteria andRelevancyIsNotNull() {
            addCriterion("relevancy is not null");
            return (Criteria) this;
        }

        public Criteria andRelevancyEqualTo(Double value) {
            addCriterion("relevancy =", value, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyNotEqualTo(Double value) {
            addCriterion("relevancy <>", value, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyGreaterThan(Double value) {
            addCriterion("relevancy >", value, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyGreaterThanOrEqualTo(Double value) {
            addCriterion("relevancy >=", value, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyLessThan(Double value) {
            addCriterion("relevancy <", value, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyLessThanOrEqualTo(Double value) {
            addCriterion("relevancy <=", value, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyIn(List<Double> values) {
            addCriterion("relevancy in", values, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyNotIn(List<Double> values) {
            addCriterion("relevancy not in", values, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyBetween(Double value1, Double value2) {
            addCriterion("relevancy between", value1, value2, "relevancy");
            return (Criteria) this;
        }

        public Criteria andRelevancyNotBetween(Double value1, Double value2) {
            addCriterion("relevancy not between", value1, value2, "relevancy");
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