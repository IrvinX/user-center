package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcPermissionExample {
    /**
     * D_UC_PERMISSION
     */
    protected String orderByClause;

    /**
     * D_UC_PERMISSION
     */
    protected boolean distinct;

    /**
     * D_UC_PERMISSION
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_PERMISSION
     */
    protected Page page;

    public DUcPermissionExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    /**
     * D_UC_PERMISSION null
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVeridIsNull() {
            addCriterion("VERID is null");
            return (Criteria) this;
        }

        public Criteria andVeridIsNotNull() {
            addCriterion("VERID is not null");
            return (Criteria) this;
        }

        public Criteria andVeridEqualTo(Short value) {
            addCriterion("VERID =", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridNotEqualTo(Short value) {
            addCriterion("VERID <>", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridGreaterThan(Short value) {
            addCriterion("VERID >", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridGreaterThanOrEqualTo(Short value) {
            addCriterion("VERID >=", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridLessThan(Short value) {
            addCriterion("VERID <", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridLessThanOrEqualTo(Short value) {
            addCriterion("VERID <=", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridIn(List<Short> values) {
            addCriterion("VERID in", values, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridNotIn(List<Short> values) {
            addCriterion("VERID not in", values, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridBetween(Short value1, Short value2) {
            addCriterion("VERID between", value1, value2, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridNotBetween(Short value1, Short value2) {
            addCriterion("VERID not between", value1, value2, "verid");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNull() {
            addCriterion("SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("SYS_ID =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("SYS_ID <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("SYS_ID >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ID >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("SYS_ID <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("SYS_ID <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("SYS_ID like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("SYS_ID not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("SYS_ID in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("SYS_ID not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("SYS_ID between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("SYS_ID not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPOrderIsNull() {
            addCriterion("P_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andPOrderIsNotNull() {
            addCriterion("P_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andPOrderEqualTo(Short value) {
            addCriterion("P_ORDER =", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderNotEqualTo(Short value) {
            addCriterion("P_ORDER <>", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderGreaterThan(Short value) {
            addCriterion("P_ORDER >", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("P_ORDER >=", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderLessThan(Short value) {
            addCriterion("P_ORDER <", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderLessThanOrEqualTo(Short value) {
            addCriterion("P_ORDER <=", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderIn(List<Short> values) {
            addCriterion("P_ORDER in", values, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderNotIn(List<Short> values) {
            addCriterion("P_ORDER not in", values, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderBetween(Short value1, Short value2) {
            addCriterion("P_ORDER between", value1, value2, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderNotBetween(Short value1, Short value2) {
            addCriterion("P_ORDER not between", value1, value2, "pOrder");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andPBeloneIsNull() {
            addCriterion("P_BELONE is null");
            return (Criteria) this;
        }

        public Criteria andPBeloneIsNotNull() {
            addCriterion("P_BELONE is not null");
            return (Criteria) this;
        }

        public Criteria andPBeloneEqualTo(Short value) {
            addCriterion("P_BELONE =", value, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneNotEqualTo(Short value) {
            addCriterion("P_BELONE <>", value, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneGreaterThan(Short value) {
            addCriterion("P_BELONE >", value, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneGreaterThanOrEqualTo(Short value) {
            addCriterion("P_BELONE >=", value, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneLessThan(Short value) {
            addCriterion("P_BELONE <", value, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneLessThanOrEqualTo(Short value) {
            addCriterion("P_BELONE <=", value, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneIn(List<Short> values) {
            addCriterion("P_BELONE in", values, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneNotIn(List<Short> values) {
            addCriterion("P_BELONE not in", values, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneBetween(Short value1, Short value2) {
            addCriterion("P_BELONE between", value1, value2, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPBeloneNotBetween(Short value1, Short value2) {
            addCriterion("P_BELONE not between", value1, value2, "pBelone");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("P_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("P_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(Short value) {
            addCriterion("P_TYPE =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(Short value) {
            addCriterion("P_TYPE <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(Short value) {
            addCriterion("P_TYPE >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("P_TYPE >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(Short value) {
            addCriterion("P_TYPE <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(Short value) {
            addCriterion("P_TYPE <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<Short> values) {
            addCriterion("P_TYPE in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<Short> values) {
            addCriterion("P_TYPE not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(Short value1, Short value2) {
            addCriterion("P_TYPE between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(Short value1, Short value2) {
            addCriterion("P_TYPE not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andOrderTurnIsNull() {
            addCriterion("ORDER_TURN is null");
            return (Criteria) this;
        }

        public Criteria andOrderTurnIsNotNull() {
            addCriterion("ORDER_TURN is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTurnEqualTo(Short value) {
            addCriterion("ORDER_TURN =", value, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnNotEqualTo(Short value) {
            addCriterion("ORDER_TURN <>", value, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnGreaterThan(Short value) {
            addCriterion("ORDER_TURN >", value, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_TURN >=", value, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnLessThan(Short value) {
            addCriterion("ORDER_TURN <", value, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_TURN <=", value, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnIn(List<Short> values) {
            addCriterion("ORDER_TURN in", values, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnNotIn(List<Short> values) {
            addCriterion("ORDER_TURN not in", values, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnBetween(Short value1, Short value2) {
            addCriterion("ORDER_TURN between", value1, value2, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andOrderTurnNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_TURN not between", value1, value2, "orderTurn");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("PERMISSION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("PERMISSION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("PERMISSION_NAME =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("PERMISSION_NAME <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("PERMISSION_NAME >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_NAME >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("PERMISSION_NAME <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_NAME <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("PERMISSION_NAME like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("PERMISSION_NAME not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("PERMISSION_NAME in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("PERMISSION_NAME not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("PERMISSION_NAME between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_NAME not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNull() {
            addCriterion("EXPRESSION is null");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNotNull() {
            addCriterion("EXPRESSION is not null");
            return (Criteria) this;
        }

        public Criteria andExpressionEqualTo(String value) {
            addCriterion("EXPRESSION =", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotEqualTo(String value) {
            addCriterion("EXPRESSION <>", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThan(String value) {
            addCriterion("EXPRESSION >", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESSION >=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThan(String value) {
            addCriterion("EXPRESSION <", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThanOrEqualTo(String value) {
            addCriterion("EXPRESSION <=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLike(String value) {
            addCriterion("EXPRESSION like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotLike(String value) {
            addCriterion("EXPRESSION not like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionIn(List<String> values) {
            addCriterion("EXPRESSION in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotIn(List<String> values) {
            addCriterion("EXPRESSION not in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionBetween(String value1, String value2) {
            addCriterion("EXPRESSION between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotBetween(String value1, String value2) {
            addCriterion("EXPRESSION not between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andPUrlIsNull() {
            addCriterion("P_URL is null");
            return (Criteria) this;
        }

        public Criteria andPUrlIsNotNull() {
            addCriterion("P_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPUrlEqualTo(String value) {
            addCriterion("P_URL =", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotEqualTo(String value) {
            addCriterion("P_URL <>", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThan(String value) {
            addCriterion("P_URL >", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThanOrEqualTo(String value) {
            addCriterion("P_URL >=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThan(String value) {
            addCriterion("P_URL <", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThanOrEqualTo(String value) {
            addCriterion("P_URL <=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLike(String value) {
            addCriterion("P_URL like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotLike(String value) {
            addCriterion("P_URL not like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlIn(List<String> values) {
            addCriterion("P_URL in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotIn(List<String> values) {
            addCriterion("P_URL not in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlBetween(String value1, String value2) {
            addCriterion("P_URL between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotBetween(String value1, String value2) {
            addCriterion("P_URL not between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagIsNull() {
            addCriterion("ASSIGNMENT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagIsNotNull() {
            addCriterion("ASSIGNMENT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagEqualTo(Short value) {
            addCriterion("ASSIGNMENT_FLAG =", value, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagNotEqualTo(Short value) {
            addCriterion("ASSIGNMENT_FLAG <>", value, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagGreaterThan(Short value) {
            addCriterion("ASSIGNMENT_FLAG >", value, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("ASSIGNMENT_FLAG >=", value, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagLessThan(Short value) {
            addCriterion("ASSIGNMENT_FLAG <", value, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagLessThanOrEqualTo(Short value) {
            addCriterion("ASSIGNMENT_FLAG <=", value, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagIn(List<Short> values) {
            addCriterion("ASSIGNMENT_FLAG in", values, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagNotIn(List<Short> values) {
            addCriterion("ASSIGNMENT_FLAG not in", values, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagBetween(Short value1, Short value2) {
            addCriterion("ASSIGNMENT_FLAG between", value1, value2, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andAssignmentFlagNotBetween(Short value1, Short value2) {
            addCriterion("ASSIGNMENT_FLAG not between", value1, value2, "assignmentFlag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CREATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CREATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CREATEUSER like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CREATEUSER not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CREATEUSER not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("UPDATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("UPDATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("UPDATEUSER =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("UPDATEUSER <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("UPDATEUSER >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("UPDATEUSER <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("UPDATEUSER like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("UPDATEUSER not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("UPDATEUSER in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("UPDATEUSER not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("UPDATEUSER between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSER not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andSysIdLikeInsensitive(String value) {
            addCriterion("upper(SYS_ID) like", value.toUpperCase(), "sysId");
            return (Criteria) this;
        }

        public Criteria andPidLikeInsensitive(String value) {
            addCriterion("upper(PID) like", value.toUpperCase(), "pid");
            return (Criteria) this;
        }

        public Criteria andIconLikeInsensitive(String value) {
            addCriterion("upper(ICON) like", value.toUpperCase(), "icon");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLikeInsensitive(String value) {
            addCriterion("upper(PERMISSION_NAME) like", value.toUpperCase(), "permissionName");
            return (Criteria) this;
        }

        public Criteria andExpressionLikeInsensitive(String value) {
            addCriterion("upper(EXPRESSION) like", value.toUpperCase(), "expression");
            return (Criteria) this;
        }

        public Criteria andPUrlLikeInsensitive(String value) {
            addCriterion("upper(P_URL) like", value.toUpperCase(), "pUrl");
            return (Criteria) this;
        }

        public Criteria andCreateuserLikeInsensitive(String value) {
            addCriterion("upper(CREATEUSER) like", value.toUpperCase(), "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLikeInsensitive(String value) {
            addCriterion("upper(UPDATEUSER) like", value.toUpperCase(), "updateuser");
            return (Criteria) this;
        }
    }

    /**
     * D_UC_PERMISSION
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_PERMISSION null
     */
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