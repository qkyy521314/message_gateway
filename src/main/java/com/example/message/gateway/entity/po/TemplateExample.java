package com.example.message.gateway.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemplateExample() {
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

        public Criteria andTemplateIDIsNull() {
            addCriterion("templateID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIDIsNotNull() {
            addCriterion("templateID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIDEqualTo(Integer value) {
            addCriterion("templateID =", value, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDNotEqualTo(Integer value) {
            addCriterion("templateID <>", value, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDGreaterThan(Integer value) {
            addCriterion("templateID >", value, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("templateID >=", value, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDLessThan(Integer value) {
            addCriterion("templateID <", value, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDLessThanOrEqualTo(Integer value) {
            addCriterion("templateID <=", value, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDIn(List<Integer> values) {
            addCriterion("templateID in", values, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDNotIn(List<Integer> values) {
            addCriterion("templateID not in", values, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDBetween(Integer value1, Integer value2) {
            addCriterion("templateID between", value1, value2, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateIDNotBetween(Integer value1, Integer value2) {
            addCriterion("templateID not between", value1, value2, "templateID");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNull() {
            addCriterion("templateName is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("templateName is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("templateName =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("templateName <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("templateName >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("templateName >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("templateName <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("templateName <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("templateName like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("templateName not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("templateName in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("templateName not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("templateName between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("templateName not between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateSignIsNull() {
            addCriterion("templateSign is null");
            return (Criteria) this;
        }

        public Criteria andTemplateSignIsNotNull() {
            addCriterion("templateSign is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateSignEqualTo(String value) {
            addCriterion("templateSign =", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotEqualTo(String value) {
            addCriterion("templateSign <>", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignGreaterThan(String value) {
            addCriterion("templateSign >", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignGreaterThanOrEqualTo(String value) {
            addCriterion("templateSign >=", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignLessThan(String value) {
            addCriterion("templateSign <", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignLessThanOrEqualTo(String value) {
            addCriterion("templateSign <=", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignLike(String value) {
            addCriterion("templateSign like", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotLike(String value) {
            addCriterion("templateSign not like", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignIn(List<String> values) {
            addCriterion("templateSign in", values, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotIn(List<String> values) {
            addCriterion("templateSign not in", values, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignBetween(String value1, String value2) {
            addCriterion("templateSign between", value1, value2, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotBetween(String value1, String value2) {
            addCriterion("templateSign not between", value1, value2, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIsNull() {
            addCriterion("templateContent is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIsNotNull() {
            addCriterion("templateContent is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentEqualTo(String value) {
            addCriterion("templateContent =", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotEqualTo(String value) {
            addCriterion("templateContent <>", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentGreaterThan(String value) {
            addCriterion("templateContent >", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentGreaterThanOrEqualTo(String value) {
            addCriterion("templateContent >=", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLessThan(String value) {
            addCriterion("templateContent <", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLessThanOrEqualTo(String value) {
            addCriterion("templateContent <=", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLike(String value) {
            addCriterion("templateContent like", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotLike(String value) {
            addCriterion("templateContent not like", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIn(List<String> values) {
            addCriterion("templateContent in", values, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotIn(List<String> values) {
            addCriterion("templateContent not in", values, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentBetween(String value1, String value2) {
            addCriterion("templateContent between", value1, value2, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotBetween(String value1, String value2) {
            addCriterion("templateContent not between", value1, value2, "templateContent");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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