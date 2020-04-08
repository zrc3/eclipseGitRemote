package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class MOrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MOrderdetailExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdIsNull() {
            addCriterion("M_ORDERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdIsNotNull() {
            addCriterion("M_ORDERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdEqualTo(Integer value) {
            addCriterion("M_ORDERS_ID =", value, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdNotEqualTo(Integer value) {
            addCriterion("M_ORDERS_ID <>", value, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdGreaterThan(Integer value) {
            addCriterion("M_ORDERS_ID >", value, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_ORDERS_ID >=", value, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdLessThan(Integer value) {
            addCriterion("M_ORDERS_ID <", value, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_ORDERS_ID <=", value, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdIn(List<Integer> values) {
            addCriterion("M_ORDERS_ID in", values, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdNotIn(List<Integer> values) {
            addCriterion("M_ORDERS_ID not in", values, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("M_ORDERS_ID between", value1, value2, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_ORDERS_ID not between", value1, value2, "mOrdersId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdIsNull() {
            addCriterion("M_ITEMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMItemsIdIsNotNull() {
            addCriterion("M_ITEMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMItemsIdEqualTo(Integer value) {
            addCriterion("M_ITEMS_ID =", value, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdNotEqualTo(Integer value) {
            addCriterion("M_ITEMS_ID <>", value, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdGreaterThan(Integer value) {
            addCriterion("M_ITEMS_ID >", value, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_ITEMS_ID >=", value, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdLessThan(Integer value) {
            addCriterion("M_ITEMS_ID <", value, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_ITEMS_ID <=", value, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdIn(List<Integer> values) {
            addCriterion("M_ITEMS_ID in", values, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdNotIn(List<Integer> values) {
            addCriterion("M_ITEMS_ID not in", values, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("M_ITEMS_ID between", value1, value2, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_ITEMS_ID not between", value1, value2, "mItemsId");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberIsNull() {
            addCriterion("M_ITEMS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberIsNotNull() {
            addCriterion("M_ITEMS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberEqualTo(Integer value) {
            addCriterion("M_ITEMS_NUMBER =", value, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberNotEqualTo(Integer value) {
            addCriterion("M_ITEMS_NUMBER <>", value, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberGreaterThan(Integer value) {
            addCriterion("M_ITEMS_NUMBER >", value, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_ITEMS_NUMBER >=", value, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberLessThan(Integer value) {
            addCriterion("M_ITEMS_NUMBER <", value, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("M_ITEMS_NUMBER <=", value, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberIn(List<Integer> values) {
            addCriterion("M_ITEMS_NUMBER in", values, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberNotIn(List<Integer> values) {
            addCriterion("M_ITEMS_NUMBER not in", values, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberBetween(Integer value1, Integer value2) {
            addCriterion("M_ITEMS_NUMBER between", value1, value2, "mItemsNumber");
            return (Criteria) this;
        }

        public Criteria andMItemsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("M_ITEMS_NUMBER not between", value1, value2, "mItemsNumber");
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