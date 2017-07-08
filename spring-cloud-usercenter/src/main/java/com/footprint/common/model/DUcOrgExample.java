package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcOrgExample {
    /**
     * D_UC_ORG
     */
    protected String orderByClause;

    /**
     * D_UC_ORG
     */
    protected boolean distinct;

    /**
     * D_UC_ORG
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_ORG
     */
    protected Page page;

    public DUcOrgExample() {
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
     * D_UC_ORG null
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

        public Criteria andOrgTypeIsNull() {
            addCriterion("ORG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("ORG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(Short value) {
            addCriterion("ORG_TYPE =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(Short value) {
            addCriterion("ORG_TYPE <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(Short value) {
            addCriterion("ORG_TYPE >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ORG_TYPE >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(Short value) {
            addCriterion("ORG_TYPE <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(Short value) {
            addCriterion("ORG_TYPE <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<Short> values) {
            addCriterion("ORG_TYPE in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<Short> values) {
            addCriterion("ORG_TYPE not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(Short value1, Short value2) {
            addCriterion("ORG_TYPE between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(Short value1, Short value2) {
            addCriterion("ORG_TYPE not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgIsNull() {
            addCriterion("VIRTUAL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgIsNotNull() {
            addCriterion("VIRTUAL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgEqualTo(Short value) {
            addCriterion("VIRTUAL_FLG =", value, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgNotEqualTo(Short value) {
            addCriterion("VIRTUAL_FLG <>", value, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgGreaterThan(Short value) {
            addCriterion("VIRTUAL_FLG >", value, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgGreaterThanOrEqualTo(Short value) {
            addCriterion("VIRTUAL_FLG >=", value, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgLessThan(Short value) {
            addCriterion("VIRTUAL_FLG <", value, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgLessThanOrEqualTo(Short value) {
            addCriterion("VIRTUAL_FLG <=", value, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgIn(List<Short> values) {
            addCriterion("VIRTUAL_FLG in", values, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgNotIn(List<Short> values) {
            addCriterion("VIRTUAL_FLG not in", values, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgBetween(Short value1, Short value2) {
            addCriterion("VIRTUAL_FLG between", value1, value2, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andVirtualFlgNotBetween(Short value1, Short value2) {
            addCriterion("VIRTUAL_FLG not between", value1, value2, "virtualFlg");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIsNull() {
            addCriterion("ORG_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIsNotNull() {
            addCriterion("ORG_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME =", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME <>", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThan(String value) {
            addCriterion("ORG_SHORT_NAME >", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME >=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThan(String value) {
            addCriterion("ORG_SHORT_NAME <", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME <=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLike(String value) {
            addCriterion("ORG_SHORT_NAME like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotLike(String value) {
            addCriterion("ORG_SHORT_NAME not like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME not in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME between", value1, value2, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME not between", value1, value2, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngIsNull() {
            addCriterion("ORG_NAME_ENG is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngIsNotNull() {
            addCriterion("ORG_NAME_ENG is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngEqualTo(String value) {
            addCriterion("ORG_NAME_ENG =", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngNotEqualTo(String value) {
            addCriterion("ORG_NAME_ENG <>", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngGreaterThan(String value) {
            addCriterion("ORG_NAME_ENG >", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME_ENG >=", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngLessThan(String value) {
            addCriterion("ORG_NAME_ENG <", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME_ENG <=", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngLike(String value) {
            addCriterion("ORG_NAME_ENG like", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngNotLike(String value) {
            addCriterion("ORG_NAME_ENG not like", value, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngIn(List<String> values) {
            addCriterion("ORG_NAME_ENG in", values, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngNotIn(List<String> values) {
            addCriterion("ORG_NAME_ENG not in", values, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngBetween(String value1, String value2) {
            addCriterion("ORG_NAME_ENG between", value1, value2, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME_ENG not between", value1, value2, "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngIsNull() {
            addCriterion("ORG_SHORT_NAME_ENG is null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngIsNotNull() {
            addCriterion("ORG_SHORT_NAME_ENG is not null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME_ENG =", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngNotEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME_ENG <>", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngGreaterThan(String value) {
            addCriterion("ORG_SHORT_NAME_ENG >", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME_ENG >=", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngLessThan(String value) {
            addCriterion("ORG_SHORT_NAME_ENG <", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngLessThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME_ENG <=", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngLike(String value) {
            addCriterion("ORG_SHORT_NAME_ENG like", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngNotLike(String value) {
            addCriterion("ORG_SHORT_NAME_ENG not like", value, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME_ENG in", values, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngNotIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME_ENG not in", values, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME_ENG between", value1, value2, "orgShortNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngNotBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME_ENG not between", value1, value2, "orgShortNameEng");
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

        public Criteria andOrgNameLikeInsensitive(String value) {
            addCriterion("upper(ORG_NAME) like", value.toUpperCase(), "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLikeInsensitive(String value) {
            addCriterion("upper(ORG_SHORT_NAME) like", value.toUpperCase(), "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgNameEngLikeInsensitive(String value) {
            addCriterion("upper(ORG_NAME_ENG) like", value.toUpperCase(), "orgNameEng");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEngLikeInsensitive(String value) {
            addCriterion("upper(ORG_SHORT_NAME_ENG) like", value.toUpperCase(), "orgShortNameEng");
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
     * D_UC_ORG
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_ORG null
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