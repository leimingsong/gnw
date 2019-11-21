package com.gnw.Pojo.UserPojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductFeedbackExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andProdFeedbackIdIsNull() {
            addCriterion("prod_feedback_id is null");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdIsNotNull() {
            addCriterion("prod_feedback_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdEqualTo(String value) {
            addCriterion("prod_feedback_id =", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdNotEqualTo(String value) {
            addCriterion("prod_feedback_id <>", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdGreaterThan(String value) {
            addCriterion("prod_feedback_id >", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_feedback_id >=", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdLessThan(String value) {
            addCriterion("prod_feedback_id <", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdLessThanOrEqualTo(String value) {
            addCriterion("prod_feedback_id <=", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdLike(String value) {
            addCriterion("prod_feedback_id like", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdNotLike(String value) {
            addCriterion("prod_feedback_id not like", value, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdIn(List<String> values) {
            addCriterion("prod_feedback_id in", values, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdNotIn(List<String> values) {
            addCriterion("prod_feedback_id not in", values, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdBetween(String value1, String value2) {
            addCriterion("prod_feedback_id between", value1, value2, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andProdFeedbackIdNotBetween(String value1, String value2) {
            addCriterion("prod_feedback_id not between", value1, value2, "prodFeedbackId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(String value) {
            addCriterion("prod_id =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(String value) {
            addCriterion("prod_id <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(String value) {
            addCriterion("prod_id >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_id >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(String value) {
            addCriterion("prod_id <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(String value) {
            addCriterion("prod_id <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLike(String value) {
            addCriterion("prod_id like", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotLike(String value) {
            addCriterion("prod_id not like", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<String> values) {
            addCriterion("prod_id in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<String> values) {
            addCriterion("prod_id not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(String value1, String value2) {
            addCriterion("prod_id between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(String value1, String value2) {
            addCriterion("prod_id not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("feedback_time is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("feedback_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(Date value) {
            addCriterion("feedback_time =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(Date value) {
            addCriterion("feedback_time <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(Date value) {
            addCriterion("feedback_time >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("feedback_time >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(Date value) {
            addCriterion("feedback_time <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("feedback_time <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<Date> values) {
            addCriterion("feedback_time in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<Date> values) {
            addCriterion("feedback_time not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(Date value1, Date value2) {
            addCriterion("feedback_time between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("feedback_time not between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIsNull() {
            addCriterion("feedback_content is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIsNotNull() {
            addCriterion("feedback_content is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentEqualTo(String value) {
            addCriterion("feedback_content =", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotEqualTo(String value) {
            addCriterion("feedback_content <>", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentGreaterThan(String value) {
            addCriterion("feedback_content >", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_content >=", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLessThan(String value) {
            addCriterion("feedback_content <", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLessThanOrEqualTo(String value) {
            addCriterion("feedback_content <=", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLike(String value) {
            addCriterion("feedback_content like", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotLike(String value) {
            addCriterion("feedback_content not like", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIn(List<String> values) {
            addCriterion("feedback_content in", values, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotIn(List<String> values) {
            addCriterion("feedback_content not in", values, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentBetween(String value1, String value2) {
            addCriterion("feedback_content between", value1, value2, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotBetween(String value1, String value2) {
            addCriterion("feedback_content not between", value1, value2, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdIsNull() {
            addCriterion("par_feedback_id is null");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdIsNotNull() {
            addCriterion("par_feedback_id is not null");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdEqualTo(String value) {
            addCriterion("par_feedback_id =", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdNotEqualTo(String value) {
            addCriterion("par_feedback_id <>", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdGreaterThan(String value) {
            addCriterion("par_feedback_id >", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdGreaterThanOrEqualTo(String value) {
            addCriterion("par_feedback_id >=", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdLessThan(String value) {
            addCriterion("par_feedback_id <", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdLessThanOrEqualTo(String value) {
            addCriterion("par_feedback_id <=", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdLike(String value) {
            addCriterion("par_feedback_id like", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdNotLike(String value) {
            addCriterion("par_feedback_id not like", value, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdIn(List<String> values) {
            addCriterion("par_feedback_id in", values, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdNotIn(List<String> values) {
            addCriterion("par_feedback_id not in", values, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdBetween(String value1, String value2) {
            addCriterion("par_feedback_id between", value1, value2, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andParFeedbackIdNotBetween(String value1, String value2) {
            addCriterion("par_feedback_id not between", value1, value2, "parFeedbackId");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNull() {
            addCriterion("spare1 is null");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNotNull() {
            addCriterion("spare1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare1EqualTo(String value) {
            addCriterion("spare1 =", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotEqualTo(String value) {
            addCriterion("spare1 <>", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThan(String value) {
            addCriterion("spare1 >", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("spare1 >=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThan(String value) {
            addCriterion("spare1 <", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThanOrEqualTo(String value) {
            addCriterion("spare1 <=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Like(String value) {
            addCriterion("spare1 like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotLike(String value) {
            addCriterion("spare1 not like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1In(List<String> values) {
            addCriterion("spare1 in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotIn(List<String> values) {
            addCriterion("spare1 not in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Between(String value1, String value2) {
            addCriterion("spare1 between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotBetween(String value1, String value2) {
            addCriterion("spare1 not between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNull() {
            addCriterion("spare2 is null");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNotNull() {
            addCriterion("spare2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare2EqualTo(String value) {
            addCriterion("spare2 =", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotEqualTo(String value) {
            addCriterion("spare2 <>", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThan(String value) {
            addCriterion("spare2 >", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("spare2 >=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThan(String value) {
            addCriterion("spare2 <", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThanOrEqualTo(String value) {
            addCriterion("spare2 <=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Like(String value) {
            addCriterion("spare2 like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotLike(String value) {
            addCriterion("spare2 not like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2In(List<String> values) {
            addCriterion("spare2 in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotIn(List<String> values) {
            addCriterion("spare2 not in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Between(String value1, String value2) {
            addCriterion("spare2 between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotBetween(String value1, String value2) {
            addCriterion("spare2 not between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNull() {
            addCriterion("spare3 is null");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNotNull() {
            addCriterion("spare3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare3EqualTo(String value) {
            addCriterion("spare3 =", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotEqualTo(String value) {
            addCriterion("spare3 <>", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThan(String value) {
            addCriterion("spare3 >", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThanOrEqualTo(String value) {
            addCriterion("spare3 >=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThan(String value) {
            addCriterion("spare3 <", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThanOrEqualTo(String value) {
            addCriterion("spare3 <=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Like(String value) {
            addCriterion("spare3 like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotLike(String value) {
            addCriterion("spare3 not like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3In(List<String> values) {
            addCriterion("spare3 in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotIn(List<String> values) {
            addCriterion("spare3 not in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Between(String value1, String value2) {
            addCriterion("spare3 between", value1, value2, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotBetween(String value1, String value2) {
            addCriterion("spare3 not between", value1, value2, "spare3");
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