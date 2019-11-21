package com.gnw.Pojo.UserPojo;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDetailsExample() {
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

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(String value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(String value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(String value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(String value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(String value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(String value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLike(String value) {
            addCriterion("cate_id like", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotLike(String value) {
            addCriterion("cate_id not like", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<String> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<String> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(String value1, String value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(String value1, String value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameIsNull() {
            addCriterion("prod_details_name is null");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameIsNotNull() {
            addCriterion("prod_details_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameEqualTo(String value) {
            addCriterion("prod_details_name =", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameNotEqualTo(String value) {
            addCriterion("prod_details_name <>", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameGreaterThan(String value) {
            addCriterion("prod_details_name >", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameGreaterThanOrEqualTo(String value) {
            addCriterion("prod_details_name >=", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameLessThan(String value) {
            addCriterion("prod_details_name <", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameLessThanOrEqualTo(String value) {
            addCriterion("prod_details_name <=", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameLike(String value) {
            addCriterion("prod_details_name like", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameNotLike(String value) {
            addCriterion("prod_details_name not like", value, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameIn(List<String> values) {
            addCriterion("prod_details_name in", values, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameNotIn(List<String> values) {
            addCriterion("prod_details_name not in", values, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameBetween(String value1, String value2) {
            addCriterion("prod_details_name between", value1, value2, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsNameNotBetween(String value1, String value2) {
            addCriterion("prod_details_name not between", value1, value2, "prodDetailsName");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentIsNull() {
            addCriterion("prod_details_comment is null");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentIsNotNull() {
            addCriterion("prod_details_comment is not null");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentEqualTo(String value) {
            addCriterion("prod_details_comment =", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentNotEqualTo(String value) {
            addCriterion("prod_details_comment <>", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentGreaterThan(String value) {
            addCriterion("prod_details_comment >", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentGreaterThanOrEqualTo(String value) {
            addCriterion("prod_details_comment >=", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentLessThan(String value) {
            addCriterion("prod_details_comment <", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentLessThanOrEqualTo(String value) {
            addCriterion("prod_details_comment <=", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentLike(String value) {
            addCriterion("prod_details_comment like", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentNotLike(String value) {
            addCriterion("prod_details_comment not like", value, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentIn(List<String> values) {
            addCriterion("prod_details_comment in", values, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentNotIn(List<String> values) {
            addCriterion("prod_details_comment not in", values, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentBetween(String value1, String value2) {
            addCriterion("prod_details_comment between", value1, value2, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andProdDetailsCommentNotBetween(String value1, String value2) {
            addCriterion("prod_details_comment not between", value1, value2, "prodDetailsComment");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlIsNull() {
            addCriterion("show_img_url is null");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlIsNotNull() {
            addCriterion("show_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlEqualTo(String value) {
            addCriterion("show_img_url =", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlNotEqualTo(String value) {
            addCriterion("show_img_url <>", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlGreaterThan(String value) {
            addCriterion("show_img_url >", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("show_img_url >=", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlLessThan(String value) {
            addCriterion("show_img_url <", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlLessThanOrEqualTo(String value) {
            addCriterion("show_img_url <=", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlLike(String value) {
            addCriterion("show_img_url like", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlNotLike(String value) {
            addCriterion("show_img_url not like", value, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlIn(List<String> values) {
            addCriterion("show_img_url in", values, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlNotIn(List<String> values) {
            addCriterion("show_img_url not in", values, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlBetween(String value1, String value2) {
            addCriterion("show_img_url between", value1, value2, "showImgUrl");
            return (Criteria) this;
        }

        public Criteria andShowImgUrlNotBetween(String value1, String value2) {
            addCriterion("show_img_url not between", value1, value2, "showImgUrl");
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