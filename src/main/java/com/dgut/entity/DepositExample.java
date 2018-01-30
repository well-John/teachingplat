package com.dgut.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepositExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChargeDateIsNull() {
            addCriterion("charge_date is null");
            return (Criteria) this;
        }

        public Criteria andChargeDateIsNotNull() {
            addCriterion("charge_date is not null");
            return (Criteria) this;
        }

        public Criteria andChargeDateEqualTo(Date value) {
            addCriterion("charge_date =", value, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateNotEqualTo(Date value) {
            addCriterion("charge_date <>", value, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateGreaterThan(Date value) {
            addCriterion("charge_date >", value, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("charge_date >=", value, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateLessThan(Date value) {
            addCriterion("charge_date <", value, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateLessThanOrEqualTo(Date value) {
            addCriterion("charge_date <=", value, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateIn(List<Date> values) {
            addCriterion("charge_date in", values, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateNotIn(List<Date> values) {
            addCriterion("charge_date not in", values, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateBetween(Date value1, Date value2) {
            addCriterion("charge_date between", value1, value2, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeDateNotBetween(Date value1, Date value2) {
            addCriterion("charge_date not between", value1, value2, "chargeDate");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIsNull() {
            addCriterion("charge_money is null");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIsNotNull() {
            addCriterion("charge_money is not null");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyEqualTo(String value) {
            addCriterion("charge_money =", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotEqualTo(String value) {
            addCriterion("charge_money <>", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyGreaterThan(String value) {
            addCriterion("charge_money >", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("charge_money >=", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyLessThan(String value) {
            addCriterion("charge_money <", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyLessThanOrEqualTo(String value) {
            addCriterion("charge_money <=", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyLike(String value) {
            addCriterion("charge_money like", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotLike(String value) {
            addCriterion("charge_money not like", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIn(List<String> values) {
            addCriterion("charge_money in", values, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotIn(List<String> values) {
            addCriterion("charge_money not in", values, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyBetween(String value1, String value2) {
            addCriterion("charge_money between", value1, value2, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotBetween(String value1, String value2) {
            addCriterion("charge_money not between", value1, value2, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrganiserIsNull() {
            addCriterion("organiser is null");
            return (Criteria) this;
        }

        public Criteria andOrganiserIsNotNull() {
            addCriterion("organiser is not null");
            return (Criteria) this;
        }

        public Criteria andOrganiserEqualTo(Integer value) {
            addCriterion("organiser =", value, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserNotEqualTo(Integer value) {
            addCriterion("organiser <>", value, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserGreaterThan(Integer value) {
            addCriterion("organiser >", value, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserGreaterThanOrEqualTo(Integer value) {
            addCriterion("organiser >=", value, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserLessThan(Integer value) {
            addCriterion("organiser <", value, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserLessThanOrEqualTo(Integer value) {
            addCriterion("organiser <=", value, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserIn(List<Integer> values) {
            addCriterion("organiser in", values, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserNotIn(List<Integer> values) {
            addCriterion("organiser not in", values, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserBetween(Integer value1, Integer value2) {
            addCriterion("organiser between", value1, value2, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserNotBetween(Integer value1, Integer value2) {
            addCriterion("organiser not between", value1, value2, "organiser");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdIsNull() {
            addCriterion("organiser_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdIsNotNull() {
            addCriterion("organiser_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdEqualTo(Integer value) {
            addCriterion("organiser_id =", value, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdNotEqualTo(Integer value) {
            addCriterion("organiser_id <>", value, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdGreaterThan(Integer value) {
            addCriterion("organiser_id >", value, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organiser_id >=", value, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdLessThan(Integer value) {
            addCriterion("organiser_id <", value, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdLessThanOrEqualTo(Integer value) {
            addCriterion("organiser_id <=", value, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdIn(List<Integer> values) {
            addCriterion("organiser_id in", values, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdNotIn(List<Integer> values) {
            addCriterion("organiser_id not in", values, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdBetween(Integer value1, Integer value2) {
            addCriterion("organiser_id between", value1, value2, "organiserId");
            return (Criteria) this;
        }

        public Criteria andOrganiserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organiser_id not between", value1, value2, "organiserId");
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