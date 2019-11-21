package com.gnw.Pojo.UserPojo;

import java.util.ArrayList;
import java.util.List;

public class DetailsImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailsImgExample() {
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

        public Criteria andDetaImgIdIsNull() {
            addCriterion("deta_img_id is null");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdIsNotNull() {
            addCriterion("deta_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdEqualTo(String value) {
            addCriterion("deta_img_id =", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdNotEqualTo(String value) {
            addCriterion("deta_img_id <>", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdGreaterThan(String value) {
            addCriterion("deta_img_id >", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("deta_img_id >=", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdLessThan(String value) {
            addCriterion("deta_img_id <", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdLessThanOrEqualTo(String value) {
            addCriterion("deta_img_id <=", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdLike(String value) {
            addCriterion("deta_img_id like", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdNotLike(String value) {
            addCriterion("deta_img_id not like", value, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdIn(List<String> values) {
            addCriterion("deta_img_id in", values, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdNotIn(List<String> values) {
            addCriterion("deta_img_id not in", values, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdBetween(String value1, String value2) {
            addCriterion("deta_img_id between", value1, value2, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andDetaImgIdNotBetween(String value1, String value2) {
            addCriterion("deta_img_id not between", value1, value2, "detaImgId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdIsNull() {
            addCriterion("prod_details_id is null");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdIsNotNull() {
            addCriterion("prod_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdEqualTo(String value) {
            addCriterion("prod_details_id =", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdNotEqualTo(String value) {
            addCriterion("prod_details_id <>", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdGreaterThan(String value) {
            addCriterion("prod_details_id >", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_details_id >=", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdLessThan(String value) {
            addCriterion("prod_details_id <", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("prod_details_id <=", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdLike(String value) {
            addCriterion("prod_details_id like", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdNotLike(String value) {
            addCriterion("prod_details_id not like", value, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdIn(List<String> values) {
            addCriterion("prod_details_id in", values, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdNotIn(List<String> values) {
            addCriterion("prod_details_id not in", values, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdBetween(String value1, String value2) {
            addCriterion("prod_details_id between", value1, value2, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsIdNotBetween(String value1, String value2) {
            addCriterion("prod_details_id not between", value1, value2, "prodDetailsId");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlIsNull() {
            addCriterion("deta_img_url is null");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlIsNotNull() {
            addCriterion("deta_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlEqualTo(String value) {
            addCriterion("deta_img_url =", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlNotEqualTo(String value) {
            addCriterion("deta_img_url <>", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlGreaterThan(String value) {
            addCriterion("deta_img_url >", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("deta_img_url >=", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlLessThan(String value) {
            addCriterion("deta_img_url <", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlLessThanOrEqualTo(String value) {
            addCriterion("deta_img_url <=", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlLike(String value) {
            addCriterion("deta_img_url like", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlNotLike(String value) {
            addCriterion("deta_img_url not like", value, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlIn(List<String> values) {
            addCriterion("deta_img_url in", values, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlNotIn(List<String> values) {
            addCriterion("deta_img_url not in", values, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlBetween(String value1, String value2) {
            addCriterion("deta_img_url between", value1, value2, "detaImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetaImgUrlNotBetween(String value1, String value2) {
            addCriterion("deta_img_url not between", value1, value2, "detaImgUrl");
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