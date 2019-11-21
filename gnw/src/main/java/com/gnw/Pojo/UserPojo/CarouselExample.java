package com.gnw.Pojo.UserPojo;

import java.util.ArrayList;
import java.util.List;

public class CarouselExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarouselExample() {
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

        public Criteria andCaroIdIsNull() {
            addCriterion("caro_id is null");
            return (Criteria) this;
        }

        public Criteria andCaroIdIsNotNull() {
            addCriterion("caro_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaroIdEqualTo(String value) {
            addCriterion("caro_id =", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdNotEqualTo(String value) {
            addCriterion("caro_id <>", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdGreaterThan(String value) {
            addCriterion("caro_id >", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdGreaterThanOrEqualTo(String value) {
            addCriterion("caro_id >=", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdLessThan(String value) {
            addCriterion("caro_id <", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdLessThanOrEqualTo(String value) {
            addCriterion("caro_id <=", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdLike(String value) {
            addCriterion("caro_id like", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdNotLike(String value) {
            addCriterion("caro_id not like", value, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdIn(List<String> values) {
            addCriterion("caro_id in", values, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdNotIn(List<String> values) {
            addCriterion("caro_id not in", values, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdBetween(String value1, String value2) {
            addCriterion("caro_id between", value1, value2, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroIdNotBetween(String value1, String value2) {
            addCriterion("caro_id not between", value1, value2, "caroId");
            return (Criteria) this;
        }

        public Criteria andCaroUrlIsNull() {
            addCriterion("caro_url is null");
            return (Criteria) this;
        }

        public Criteria andCaroUrlIsNotNull() {
            addCriterion("caro_url is not null");
            return (Criteria) this;
        }

        public Criteria andCaroUrlEqualTo(String value) {
            addCriterion("caro_url =", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlNotEqualTo(String value) {
            addCriterion("caro_url <>", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlGreaterThan(String value) {
            addCriterion("caro_url >", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlGreaterThanOrEqualTo(String value) {
            addCriterion("caro_url >=", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlLessThan(String value) {
            addCriterion("caro_url <", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlLessThanOrEqualTo(String value) {
            addCriterion("caro_url <=", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlLike(String value) {
            addCriterion("caro_url like", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlNotLike(String value) {
            addCriterion("caro_url not like", value, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlIn(List<String> values) {
            addCriterion("caro_url in", values, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlNotIn(List<String> values) {
            addCriterion("caro_url not in", values, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlBetween(String value1, String value2) {
            addCriterion("caro_url between", value1, value2, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroUrlNotBetween(String value1, String value2) {
            addCriterion("caro_url not between", value1, value2, "caroUrl");
            return (Criteria) this;
        }

        public Criteria andCaroStatusIsNull() {
            addCriterion("caro_status is null");
            return (Criteria) this;
        }

        public Criteria andCaroStatusIsNotNull() {
            addCriterion("caro_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaroStatusEqualTo(String value) {
            addCriterion("caro_status =", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusNotEqualTo(String value) {
            addCriterion("caro_status <>", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusGreaterThan(String value) {
            addCriterion("caro_status >", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusGreaterThanOrEqualTo(String value) {
            addCriterion("caro_status >=", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusLessThan(String value) {
            addCriterion("caro_status <", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusLessThanOrEqualTo(String value) {
            addCriterion("caro_status <=", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusLike(String value) {
            addCriterion("caro_status like", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusNotLike(String value) {
            addCriterion("caro_status not like", value, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusIn(List<String> values) {
            addCriterion("caro_status in", values, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusNotIn(List<String> values) {
            addCriterion("caro_status not in", values, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusBetween(String value1, String value2) {
            addCriterion("caro_status between", value1, value2, "caroStatus");
            return (Criteria) this;
        }

        public Criteria andCaroStatusNotBetween(String value1, String value2) {
            addCriterion("caro_status not between", value1, value2, "caroStatus");
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