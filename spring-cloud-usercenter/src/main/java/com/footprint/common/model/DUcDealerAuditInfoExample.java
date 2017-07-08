package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcDealerAuditInfoExample {
    /**
     * D_UC_DEALER_AUDIT_INFO
     */
    protected String orderByClause;

    /**
     * D_UC_DEALER_AUDIT_INFO
     */
    protected boolean distinct;

    /**
     * D_UC_DEALER_AUDIT_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_DEALER_AUDIT_INFO
     */
    protected Page page;

    public DUcDealerAuditInfoExample() {
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
     * D_UC_DEALER_AUDIT_INFO null
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

        public Criteria andAuditIdIsNull() {
            addCriterion("AUDIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNotNull() {
            addCriterion("AUDIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdEqualTo(String value) {
            addCriterion("AUDIT_ID =", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotEqualTo(String value) {
            addCriterion("AUDIT_ID <>", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThan(String value) {
            addCriterion("AUDIT_ID >", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_ID >=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThan(String value) {
            addCriterion("AUDIT_ID <", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_ID <=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLike(String value) {
            addCriterion("AUDIT_ID like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotLike(String value) {
            addCriterion("AUDIT_ID not like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdIn(List<String> values) {
            addCriterion("AUDIT_ID in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotIn(List<String> values) {
            addCriterion("AUDIT_ID not in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdBetween(String value1, String value2) {
            addCriterion("AUDIT_ID between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotBetween(String value1, String value2) {
            addCriterion("AUDIT_ID not between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("DEALER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("DEALER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(String value) {
            addCriterion("DEALER_ID =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(String value) {
            addCriterion("DEALER_ID <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(String value) {
            addCriterion("DEALER_ID >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEALER_ID >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(String value) {
            addCriterion("DEALER_ID <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(String value) {
            addCriterion("DEALER_ID <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLike(String value) {
            addCriterion("DEALER_ID like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotLike(String value) {
            addCriterion("DEALER_ID not like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<String> values) {
            addCriterion("DEALER_ID in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<String> values) {
            addCriterion("DEALER_ID not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(String value1, String value2) {
            addCriterion("DEALER_ID between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(String value1, String value2) {
            addCriterion("DEALER_ID not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldIsNull() {
            addCriterion("FIRM_TYPE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldIsNotNull() {
            addCriterion("FIRM_TYPE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldEqualTo(Short value) {
            addCriterion("FIRM_TYPE_OLD =", value, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldNotEqualTo(Short value) {
            addCriterion("FIRM_TYPE_OLD <>", value, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldGreaterThan(Short value) {
            addCriterion("FIRM_TYPE_OLD >", value, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldGreaterThanOrEqualTo(Short value) {
            addCriterion("FIRM_TYPE_OLD >=", value, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldLessThan(Short value) {
            addCriterion("FIRM_TYPE_OLD <", value, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldLessThanOrEqualTo(Short value) {
            addCriterion("FIRM_TYPE_OLD <=", value, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldIn(List<Short> values) {
            addCriterion("FIRM_TYPE_OLD in", values, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldNotIn(List<Short> values) {
            addCriterion("FIRM_TYPE_OLD not in", values, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldBetween(Short value1, Short value2) {
            addCriterion("FIRM_TYPE_OLD between", value1, value2, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeOldNotBetween(Short value1, Short value2) {
            addCriterion("FIRM_TYPE_OLD not between", value1, value2, "firmTypeOld");
            return (Criteria) this;
        }

        public Criteria andFirmTypeIsNull() {
            addCriterion("FIRM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFirmTypeIsNotNull() {
            addCriterion("FIRM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFirmTypeEqualTo(Short value) {
            addCriterion("FIRM_TYPE =", value, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeNotEqualTo(Short value) {
            addCriterion("FIRM_TYPE <>", value, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeGreaterThan(Short value) {
            addCriterion("FIRM_TYPE >", value, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("FIRM_TYPE >=", value, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeLessThan(Short value) {
            addCriterion("FIRM_TYPE <", value, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeLessThanOrEqualTo(Short value) {
            addCriterion("FIRM_TYPE <=", value, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeIn(List<Short> values) {
            addCriterion("FIRM_TYPE in", values, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeNotIn(List<Short> values) {
            addCriterion("FIRM_TYPE not in", values, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeBetween(Short value1, Short value2) {
            addCriterion("FIRM_TYPE between", value1, value2, "firmType");
            return (Criteria) this;
        }

        public Criteria andFirmTypeNotBetween(Short value1, Short value2) {
            addCriterion("FIRM_TYPE not between", value1, value2, "firmType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldIsNull() {
            addCriterion("ACCOUNT_TYPE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldIsNotNull() {
            addCriterion("ACCOUNT_TYPE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE_OLD =", value, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldNotEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE_OLD <>", value, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldGreaterThan(Short value) {
            addCriterion("ACCOUNT_TYPE_OLD >", value, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldGreaterThanOrEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE_OLD >=", value, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldLessThan(Short value) {
            addCriterion("ACCOUNT_TYPE_OLD <", value, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldLessThanOrEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE_OLD <=", value, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldIn(List<Short> values) {
            addCriterion("ACCOUNT_TYPE_OLD in", values, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldNotIn(List<Short> values) {
            addCriterion("ACCOUNT_TYPE_OLD not in", values, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldBetween(Short value1, Short value2) {
            addCriterion("ACCOUNT_TYPE_OLD between", value1, value2, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeOldNotBetween(Short value1, Short value2) {
            addCriterion("ACCOUNT_TYPE_OLD not between", value1, value2, "accountTypeOld");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Short value) {
            addCriterion("ACCOUNT_TYPE >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Short value) {
            addCriterion("ACCOUNT_TYPE <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Short value) {
            addCriterion("ACCOUNT_TYPE <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Short> values) {
            addCriterion("ACCOUNT_TYPE in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Short> values) {
            addCriterion("ACCOUNT_TYPE not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Short value1, Short value2) {
            addCriterion("ACCOUNT_TYPE between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Short value1, Short value2) {
            addCriterion("ACCOUNT_TYPE not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldIsNull() {
            addCriterion("ENTP_TYPE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldIsNotNull() {
            addCriterion("ENTP_TYPE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldEqualTo(Short value) {
            addCriterion("ENTP_TYPE_OLD =", value, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldNotEqualTo(Short value) {
            addCriterion("ENTP_TYPE_OLD <>", value, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldGreaterThan(Short value) {
            addCriterion("ENTP_TYPE_OLD >", value, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldGreaterThanOrEqualTo(Short value) {
            addCriterion("ENTP_TYPE_OLD >=", value, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldLessThan(Short value) {
            addCriterion("ENTP_TYPE_OLD <", value, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldLessThanOrEqualTo(Short value) {
            addCriterion("ENTP_TYPE_OLD <=", value, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldIn(List<Short> values) {
            addCriterion("ENTP_TYPE_OLD in", values, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldNotIn(List<Short> values) {
            addCriterion("ENTP_TYPE_OLD not in", values, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldBetween(Short value1, Short value2) {
            addCriterion("ENTP_TYPE_OLD between", value1, value2, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeOldNotBetween(Short value1, Short value2) {
            addCriterion("ENTP_TYPE_OLD not between", value1, value2, "entpTypeOld");
            return (Criteria) this;
        }

        public Criteria andEntpTypeIsNull() {
            addCriterion("ENTP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntpTypeIsNotNull() {
            addCriterion("ENTP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntpTypeEqualTo(Short value) {
            addCriterion("ENTP_TYPE =", value, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeNotEqualTo(Short value) {
            addCriterion("ENTP_TYPE <>", value, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeGreaterThan(Short value) {
            addCriterion("ENTP_TYPE >", value, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ENTP_TYPE >=", value, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeLessThan(Short value) {
            addCriterion("ENTP_TYPE <", value, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeLessThanOrEqualTo(Short value) {
            addCriterion("ENTP_TYPE <=", value, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeIn(List<Short> values) {
            addCriterion("ENTP_TYPE in", values, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeNotIn(List<Short> values) {
            addCriterion("ENTP_TYPE not in", values, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeBetween(Short value1, Short value2) {
            addCriterion("ENTP_TYPE between", value1, value2, "entpType");
            return (Criteria) this;
        }

        public Criteria andEntpTypeNotBetween(Short value1, Short value2) {
            addCriterion("ENTP_TYPE not between", value1, value2, "entpType");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldIsNull() {
            addCriterion("MARKET_AGR_OLD is null");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldIsNotNull() {
            addCriterion("MARKET_AGR_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldEqualTo(Short value) {
            addCriterion("MARKET_AGR_OLD =", value, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldNotEqualTo(Short value) {
            addCriterion("MARKET_AGR_OLD <>", value, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldGreaterThan(Short value) {
            addCriterion("MARKET_AGR_OLD >", value, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldGreaterThanOrEqualTo(Short value) {
            addCriterion("MARKET_AGR_OLD >=", value, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldLessThan(Short value) {
            addCriterion("MARKET_AGR_OLD <", value, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldLessThanOrEqualTo(Short value) {
            addCriterion("MARKET_AGR_OLD <=", value, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldIn(List<Short> values) {
            addCriterion("MARKET_AGR_OLD in", values, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldNotIn(List<Short> values) {
            addCriterion("MARKET_AGR_OLD not in", values, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldBetween(Short value1, Short value2) {
            addCriterion("MARKET_AGR_OLD between", value1, value2, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrOldNotBetween(Short value1, Short value2) {
            addCriterion("MARKET_AGR_OLD not between", value1, value2, "marketAgrOld");
            return (Criteria) this;
        }

        public Criteria andMarketAgrIsNull() {
            addCriterion("MARKET_AGR is null");
            return (Criteria) this;
        }

        public Criteria andMarketAgrIsNotNull() {
            addCriterion("MARKET_AGR is not null");
            return (Criteria) this;
        }

        public Criteria andMarketAgrEqualTo(Short value) {
            addCriterion("MARKET_AGR =", value, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrNotEqualTo(Short value) {
            addCriterion("MARKET_AGR <>", value, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrGreaterThan(Short value) {
            addCriterion("MARKET_AGR >", value, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrGreaterThanOrEqualTo(Short value) {
            addCriterion("MARKET_AGR >=", value, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrLessThan(Short value) {
            addCriterion("MARKET_AGR <", value, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrLessThanOrEqualTo(Short value) {
            addCriterion("MARKET_AGR <=", value, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrIn(List<Short> values) {
            addCriterion("MARKET_AGR in", values, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrNotIn(List<Short> values) {
            addCriterion("MARKET_AGR not in", values, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrBetween(Short value1, Short value2) {
            addCriterion("MARKET_AGR between", value1, value2, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andMarketAgrNotBetween(Short value1, Short value2) {
            addCriterion("MARKET_AGR not between", value1, value2, "marketAgr");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldIsNull() {
            addCriterion("FIRM_CODE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldIsNotNull() {
            addCriterion("FIRM_CODE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldEqualTo(String value) {
            addCriterion("FIRM_CODE_OLD =", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldNotEqualTo(String value) {
            addCriterion("FIRM_CODE_OLD <>", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldGreaterThan(String value) {
            addCriterion("FIRM_CODE_OLD >", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldGreaterThanOrEqualTo(String value) {
            addCriterion("FIRM_CODE_OLD >=", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldLessThan(String value) {
            addCriterion("FIRM_CODE_OLD <", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldLessThanOrEqualTo(String value) {
            addCriterion("FIRM_CODE_OLD <=", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldLike(String value) {
            addCriterion("FIRM_CODE_OLD like", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldNotLike(String value) {
            addCriterion("FIRM_CODE_OLD not like", value, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldIn(List<String> values) {
            addCriterion("FIRM_CODE_OLD in", values, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldNotIn(List<String> values) {
            addCriterion("FIRM_CODE_OLD not in", values, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldBetween(String value1, String value2) {
            addCriterion("FIRM_CODE_OLD between", value1, value2, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldNotBetween(String value1, String value2) {
            addCriterion("FIRM_CODE_OLD not between", value1, value2, "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeIsNull() {
            addCriterion("FIRM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFirmCodeIsNotNull() {
            addCriterion("FIRM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFirmCodeEqualTo(String value) {
            addCriterion("FIRM_CODE =", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeNotEqualTo(String value) {
            addCriterion("FIRM_CODE <>", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeGreaterThan(String value) {
            addCriterion("FIRM_CODE >", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FIRM_CODE >=", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeLessThan(String value) {
            addCriterion("FIRM_CODE <", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeLessThanOrEqualTo(String value) {
            addCriterion("FIRM_CODE <=", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeLike(String value) {
            addCriterion("FIRM_CODE like", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeNotLike(String value) {
            addCriterion("FIRM_CODE not like", value, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeIn(List<String> values) {
            addCriterion("FIRM_CODE in", values, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeNotIn(List<String> values) {
            addCriterion("FIRM_CODE not in", values, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeBetween(String value1, String value2) {
            addCriterion("FIRM_CODE between", value1, value2, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmCodeNotBetween(String value1, String value2) {
            addCriterion("FIRM_CODE not between", value1, value2, "firmCode");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldIsNull() {
            addCriterion("FIRM_SHORT_NAME_OLD is null");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldIsNotNull() {
            addCriterion("FIRM_SHORT_NAME_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME_OLD =", value, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldNotEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME_OLD <>", value, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldGreaterThan(Short value) {
            addCriterion("FIRM_SHORT_NAME_OLD >", value, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldGreaterThanOrEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME_OLD >=", value, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldLessThan(Short value) {
            addCriterion("FIRM_SHORT_NAME_OLD <", value, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldLessThanOrEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME_OLD <=", value, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldIn(List<Short> values) {
            addCriterion("FIRM_SHORT_NAME_OLD in", values, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldNotIn(List<Short> values) {
            addCriterion("FIRM_SHORT_NAME_OLD not in", values, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldBetween(Short value1, Short value2) {
            addCriterion("FIRM_SHORT_NAME_OLD between", value1, value2, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameOldNotBetween(Short value1, Short value2) {
            addCriterion("FIRM_SHORT_NAME_OLD not between", value1, value2, "firmShortNameOld");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameIsNull() {
            addCriterion("FIRM_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameIsNotNull() {
            addCriterion("FIRM_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME =", value, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameNotEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME <>", value, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameGreaterThan(Short value) {
            addCriterion("FIRM_SHORT_NAME >", value, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameGreaterThanOrEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME >=", value, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameLessThan(Short value) {
            addCriterion("FIRM_SHORT_NAME <", value, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameLessThanOrEqualTo(Short value) {
            addCriterion("FIRM_SHORT_NAME <=", value, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameIn(List<Short> values) {
            addCriterion("FIRM_SHORT_NAME in", values, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameNotIn(List<Short> values) {
            addCriterion("FIRM_SHORT_NAME not in", values, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameBetween(Short value1, Short value2) {
            addCriterion("FIRM_SHORT_NAME between", value1, value2, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andFirmShortNameNotBetween(Short value1, Short value2) {
            addCriterion("FIRM_SHORT_NAME not between", value1, value2, "firmShortName");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldIsNull() {
            addCriterion("JOIN_DATE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldIsNotNull() {
            addCriterion("JOIN_DATE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldEqualTo(Date value) {
            addCriterion("JOIN_DATE_OLD =", value, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldNotEqualTo(Date value) {
            addCriterion("JOIN_DATE_OLD <>", value, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldGreaterThan(Date value) {
            addCriterion("JOIN_DATE_OLD >", value, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldGreaterThanOrEqualTo(Date value) {
            addCriterion("JOIN_DATE_OLD >=", value, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldLessThan(Date value) {
            addCriterion("JOIN_DATE_OLD <", value, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldLessThanOrEqualTo(Date value) {
            addCriterion("JOIN_DATE_OLD <=", value, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldIn(List<Date> values) {
            addCriterion("JOIN_DATE_OLD in", values, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldNotIn(List<Date> values) {
            addCriterion("JOIN_DATE_OLD not in", values, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldBetween(Date value1, Date value2) {
            addCriterion("JOIN_DATE_OLD between", value1, value2, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateOldNotBetween(Date value1, Date value2) {
            addCriterion("JOIN_DATE_OLD not between", value1, value2, "joinDateOld");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNull() {
            addCriterion("JOIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNotNull() {
            addCriterion("JOIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andJoinDateEqualTo(Date value) {
            addCriterion("JOIN_DATE =", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotEqualTo(Date value) {
            addCriterion("JOIN_DATE <>", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThan(Date value) {
            addCriterion("JOIN_DATE >", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("JOIN_DATE >=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThan(Date value) {
            addCriterion("JOIN_DATE <", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThanOrEqualTo(Date value) {
            addCriterion("JOIN_DATE <=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateIn(List<Date> values) {
            addCriterion("JOIN_DATE in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotIn(List<Date> values) {
            addCriterion("JOIN_DATE not in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateBetween(Date value1, Date value2) {
            addCriterion("JOIN_DATE between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotBetween(Date value1, Date value2) {
            addCriterion("JOIN_DATE not between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldIsNull() {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldIsNotNull() {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD =", value, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldNotEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD <>", value, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldGreaterThan(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD >", value, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldGreaterThanOrEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD >=", value, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldLessThan(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD <", value, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldLessThanOrEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD <=", value, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldIn(List<Short> values) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD in", values, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldNotIn(List<Short> values) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD not in", values, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldBetween(Short value1, Short value2) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD between", value1, value2, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeOldNotBetween(Short value1, Short value2) {
            addCriterion("VAT_INVOICE_ENTP_TYPE_OLD not between", value1, value2, "vatInvoiceEntpTypeOld");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeIsNull() {
            addCriterion("VAT_INVOICE_ENTP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeIsNotNull() {
            addCriterion("VAT_INVOICE_ENTP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE =", value, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeNotEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE <>", value, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeGreaterThan(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE >", value, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE >=", value, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeLessThan(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE <", value, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeLessThanOrEqualTo(Short value) {
            addCriterion("VAT_INVOICE_ENTP_TYPE <=", value, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeIn(List<Short> values) {
            addCriterion("VAT_INVOICE_ENTP_TYPE in", values, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeNotIn(List<Short> values) {
            addCriterion("VAT_INVOICE_ENTP_TYPE not in", values, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeBetween(Short value1, Short value2) {
            addCriterion("VAT_INVOICE_ENTP_TYPE between", value1, value2, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceEntpTypeNotBetween(Short value1, Short value2) {
            addCriterion("VAT_INVOICE_ENTP_TYPE not between", value1, value2, "vatInvoiceEntpType");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldIsNull() {
            addCriterion("QUAL_FEE_URL_OLD is null");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldIsNotNull() {
            addCriterion("QUAL_FEE_URL_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldEqualTo(String value) {
            addCriterion("QUAL_FEE_URL_OLD =", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldNotEqualTo(String value) {
            addCriterion("QUAL_FEE_URL_OLD <>", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldGreaterThan(String value) {
            addCriterion("QUAL_FEE_URL_OLD >", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldGreaterThanOrEqualTo(String value) {
            addCriterion("QUAL_FEE_URL_OLD >=", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldLessThan(String value) {
            addCriterion("QUAL_FEE_URL_OLD <", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldLessThanOrEqualTo(String value) {
            addCriterion("QUAL_FEE_URL_OLD <=", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldLike(String value) {
            addCriterion("QUAL_FEE_URL_OLD like", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldNotLike(String value) {
            addCriterion("QUAL_FEE_URL_OLD not like", value, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldIn(List<String> values) {
            addCriterion("QUAL_FEE_URL_OLD in", values, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldNotIn(List<String> values) {
            addCriterion("QUAL_FEE_URL_OLD not in", values, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldBetween(String value1, String value2) {
            addCriterion("QUAL_FEE_URL_OLD between", value1, value2, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldNotBetween(String value1, String value2) {
            addCriterion("QUAL_FEE_URL_OLD not between", value1, value2, "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlIsNull() {
            addCriterion("QUAL_FEE_URL is null");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlIsNotNull() {
            addCriterion("QUAL_FEE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlEqualTo(String value) {
            addCriterion("QUAL_FEE_URL =", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlNotEqualTo(String value) {
            addCriterion("QUAL_FEE_URL <>", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlGreaterThan(String value) {
            addCriterion("QUAL_FEE_URL >", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("QUAL_FEE_URL >=", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlLessThan(String value) {
            addCriterion("QUAL_FEE_URL <", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlLessThanOrEqualTo(String value) {
            addCriterion("QUAL_FEE_URL <=", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlLike(String value) {
            addCriterion("QUAL_FEE_URL like", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlNotLike(String value) {
            addCriterion("QUAL_FEE_URL not like", value, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlIn(List<String> values) {
            addCriterion("QUAL_FEE_URL in", values, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlNotIn(List<String> values) {
            addCriterion("QUAL_FEE_URL not in", values, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlBetween(String value1, String value2) {
            addCriterion("QUAL_FEE_URL between", value1, value2, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlNotBetween(String value1, String value2) {
            addCriterion("QUAL_FEE_URL not between", value1, value2, "qualFeeUrl");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldIsNull() {
            addCriterion("CUSTOM_REGION_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldIsNotNull() {
            addCriterion("CUSTOM_REGION_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldEqualTo(Short value) {
            addCriterion("CUSTOM_REGION_OLD =", value, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldNotEqualTo(Short value) {
            addCriterion("CUSTOM_REGION_OLD <>", value, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldGreaterThan(Short value) {
            addCriterion("CUSTOM_REGION_OLD >", value, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOM_REGION_OLD >=", value, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldLessThan(Short value) {
            addCriterion("CUSTOM_REGION_OLD <", value, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOM_REGION_OLD <=", value, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldIn(List<Short> values) {
            addCriterion("CUSTOM_REGION_OLD in", values, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldNotIn(List<Short> values) {
            addCriterion("CUSTOM_REGION_OLD not in", values, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldBetween(Short value1, Short value2) {
            addCriterion("CUSTOM_REGION_OLD between", value1, value2, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionOldNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOM_REGION_OLD not between", value1, value2, "customRegionOld");
            return (Criteria) this;
        }

        public Criteria andCustomRegionIsNull() {
            addCriterion("CUSTOM_REGION is null");
            return (Criteria) this;
        }

        public Criteria andCustomRegionIsNotNull() {
            addCriterion("CUSTOM_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andCustomRegionEqualTo(Short value) {
            addCriterion("CUSTOM_REGION =", value, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionNotEqualTo(Short value) {
            addCriterion("CUSTOM_REGION <>", value, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionGreaterThan(Short value) {
            addCriterion("CUSTOM_REGION >", value, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOM_REGION >=", value, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionLessThan(Short value) {
            addCriterion("CUSTOM_REGION <", value, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOM_REGION <=", value, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionIn(List<Short> values) {
            addCriterion("CUSTOM_REGION in", values, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionNotIn(List<Short> values) {
            addCriterion("CUSTOM_REGION not in", values, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionBetween(Short value1, Short value2) {
            addCriterion("CUSTOM_REGION between", value1, value2, "customRegion");
            return (Criteria) this;
        }

        public Criteria andCustomRegionNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOM_REGION not between", value1, value2, "customRegion");
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

        public Criteria andAuditIdLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_ID) like", value.toUpperCase(), "auditId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLikeInsensitive(String value) {
            addCriterion("upper(DEALER_ID) like", value.toUpperCase(), "dealerId");
            return (Criteria) this;
        }

        public Criteria andFirmCodeOldLikeInsensitive(String value) {
            addCriterion("upper(FIRM_CODE_OLD) like", value.toUpperCase(), "firmCodeOld");
            return (Criteria) this;
        }

        public Criteria andFirmCodeLikeInsensitive(String value) {
            addCriterion("upper(FIRM_CODE) like", value.toUpperCase(), "firmCode");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlOldLikeInsensitive(String value) {
            addCriterion("upper(QUAL_FEE_URL_OLD) like", value.toUpperCase(), "qualFeeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQualFeeUrlLikeInsensitive(String value) {
            addCriterion("upper(QUAL_FEE_URL) like", value.toUpperCase(), "qualFeeUrl");
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
     * D_UC_DEALER_AUDIT_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_DEALER_AUDIT_INFO null
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