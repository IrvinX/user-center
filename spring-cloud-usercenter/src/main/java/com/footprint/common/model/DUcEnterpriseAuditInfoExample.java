package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcEnterpriseAuditInfoExample {
    /**
     * D_UC_ENTERPRISE_AUDIT_INFO
     */
    protected String orderByClause;

    /**
     * D_UC_ENTERPRISE_AUDIT_INFO
     */
    protected boolean distinct;

    /**
     * D_UC_ENTERPRISE_AUDIT_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_ENTERPRISE_AUDIT_INFO
     */
    protected Page page;

    public DUcEnterpriseAuditInfoExample() {
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
     * D_UC_ENTERPRISE_AUDIT_INFO null
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

        public Criteria andEntpIdIsNull() {
            addCriterion("ENTP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntpIdIsNotNull() {
            addCriterion("ENTP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntpIdEqualTo(String value) {
            addCriterion("ENTP_ID =", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotEqualTo(String value) {
            addCriterion("ENTP_ID <>", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdGreaterThan(String value) {
            addCriterion("ENTP_ID >", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENTP_ID >=", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdLessThan(String value) {
            addCriterion("ENTP_ID <", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdLessThanOrEqualTo(String value) {
            addCriterion("ENTP_ID <=", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdLike(String value) {
            addCriterion("ENTP_ID like", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotLike(String value) {
            addCriterion("ENTP_ID not like", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdIn(List<String> values) {
            addCriterion("ENTP_ID in", values, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotIn(List<String> values) {
            addCriterion("ENTP_ID not in", values, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdBetween(String value1, String value2) {
            addCriterion("ENTP_ID between", value1, value2, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotBetween(String value1, String value2) {
            addCriterion("ENTP_ID not between", value1, value2, "entpId");
            return (Criteria) this;
        }

        public Criteria andFullnameOldIsNull() {
            addCriterion("FULLNAME_OLD is null");
            return (Criteria) this;
        }

        public Criteria andFullnameOldIsNotNull() {
            addCriterion("FULLNAME_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameOldEqualTo(String value) {
            addCriterion("FULLNAME_OLD =", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldNotEqualTo(String value) {
            addCriterion("FULLNAME_OLD <>", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldGreaterThan(String value) {
            addCriterion("FULLNAME_OLD >", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldGreaterThanOrEqualTo(String value) {
            addCriterion("FULLNAME_OLD >=", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldLessThan(String value) {
            addCriterion("FULLNAME_OLD <", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldLessThanOrEqualTo(String value) {
            addCriterion("FULLNAME_OLD <=", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldLike(String value) {
            addCriterion("FULLNAME_OLD like", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldNotLike(String value) {
            addCriterion("FULLNAME_OLD not like", value, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldIn(List<String> values) {
            addCriterion("FULLNAME_OLD in", values, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldNotIn(List<String> values) {
            addCriterion("FULLNAME_OLD not in", values, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldBetween(String value1, String value2) {
            addCriterion("FULLNAME_OLD between", value1, value2, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameOldNotBetween(String value1, String value2) {
            addCriterion("FULLNAME_OLD not between", value1, value2, "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("FULLNAME is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("FULLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("FULLNAME =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("FULLNAME <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("FULLNAME >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FULLNAME >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("FULLNAME <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("FULLNAME <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("FULLNAME like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("FULLNAME not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("FULLNAME in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("FULLNAME not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("FULLNAME between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("FULLNAME not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andShortnameOldIsNull() {
            addCriterion("SHORTNAME_OLD is null");
            return (Criteria) this;
        }

        public Criteria andShortnameOldIsNotNull() {
            addCriterion("SHORTNAME_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameOldEqualTo(String value) {
            addCriterion("SHORTNAME_OLD =", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldNotEqualTo(String value) {
            addCriterion("SHORTNAME_OLD <>", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldGreaterThan(String value) {
            addCriterion("SHORTNAME_OLD >", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME_OLD >=", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldLessThan(String value) {
            addCriterion("SHORTNAME_OLD <", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME_OLD <=", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldLike(String value) {
            addCriterion("SHORTNAME_OLD like", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldNotLike(String value) {
            addCriterion("SHORTNAME_OLD not like", value, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldIn(List<String> values) {
            addCriterion("SHORTNAME_OLD in", values, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldNotIn(List<String> values) {
            addCriterion("SHORTNAME_OLD not in", values, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldBetween(String value1, String value2) {
            addCriterion("SHORTNAME_OLD between", value1, value2, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameOldNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME_OLD not between", value1, value2, "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldIsNull() {
            addCriterion("FULLNAME_PINYIN_OLD is null");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldIsNotNull() {
            addCriterion("FULLNAME_PINYIN_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN_OLD =", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldNotEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN_OLD <>", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldGreaterThan(String value) {
            addCriterion("FULLNAME_PINYIN_OLD >", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldGreaterThanOrEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN_OLD >=", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldLessThan(String value) {
            addCriterion("FULLNAME_PINYIN_OLD <", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldLessThanOrEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN_OLD <=", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldLike(String value) {
            addCriterion("FULLNAME_PINYIN_OLD like", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldNotLike(String value) {
            addCriterion("FULLNAME_PINYIN_OLD not like", value, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldIn(List<String> values) {
            addCriterion("FULLNAME_PINYIN_OLD in", values, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldNotIn(List<String> values) {
            addCriterion("FULLNAME_PINYIN_OLD not in", values, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldBetween(String value1, String value2) {
            addCriterion("FULLNAME_PINYIN_OLD between", value1, value2, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldNotBetween(String value1, String value2) {
            addCriterion("FULLNAME_PINYIN_OLD not between", value1, value2, "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinIsNull() {
            addCriterion("FULLNAME_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinIsNotNull() {
            addCriterion("FULLNAME_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN =", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinNotEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN <>", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinGreaterThan(String value) {
            addCriterion("FULLNAME_PINYIN >", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN >=", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinLessThan(String value) {
            addCriterion("FULLNAME_PINYIN <", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinLessThanOrEqualTo(String value) {
            addCriterion("FULLNAME_PINYIN <=", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinLike(String value) {
            addCriterion("FULLNAME_PINYIN like", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinNotLike(String value) {
            addCriterion("FULLNAME_PINYIN not like", value, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinIn(List<String> values) {
            addCriterion("FULLNAME_PINYIN in", values, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinNotIn(List<String> values) {
            addCriterion("FULLNAME_PINYIN not in", values, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinBetween(String value1, String value2) {
            addCriterion("FULLNAME_PINYIN between", value1, value2, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinNotBetween(String value1, String value2) {
            addCriterion("FULLNAME_PINYIN not between", value1, value2, "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andLpNameOldIsNull() {
            addCriterion("LP_NAME_OLD is null");
            return (Criteria) this;
        }

        public Criteria andLpNameOldIsNotNull() {
            addCriterion("LP_NAME_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andLpNameOldEqualTo(String value) {
            addCriterion("LP_NAME_OLD =", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldNotEqualTo(String value) {
            addCriterion("LP_NAME_OLD <>", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldGreaterThan(String value) {
            addCriterion("LP_NAME_OLD >", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldGreaterThanOrEqualTo(String value) {
            addCriterion("LP_NAME_OLD >=", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldLessThan(String value) {
            addCriterion("LP_NAME_OLD <", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldLessThanOrEqualTo(String value) {
            addCriterion("LP_NAME_OLD <=", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldLike(String value) {
            addCriterion("LP_NAME_OLD like", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldNotLike(String value) {
            addCriterion("LP_NAME_OLD not like", value, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldIn(List<String> values) {
            addCriterion("LP_NAME_OLD in", values, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldNotIn(List<String> values) {
            addCriterion("LP_NAME_OLD not in", values, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldBetween(String value1, String value2) {
            addCriterion("LP_NAME_OLD between", value1, value2, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameOldNotBetween(String value1, String value2) {
            addCriterion("LP_NAME_OLD not between", value1, value2, "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameIsNull() {
            addCriterion("LP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLpNameIsNotNull() {
            addCriterion("LP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLpNameEqualTo(String value) {
            addCriterion("LP_NAME =", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameNotEqualTo(String value) {
            addCriterion("LP_NAME <>", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameGreaterThan(String value) {
            addCriterion("LP_NAME >", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameGreaterThanOrEqualTo(String value) {
            addCriterion("LP_NAME >=", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameLessThan(String value) {
            addCriterion("LP_NAME <", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameLessThanOrEqualTo(String value) {
            addCriterion("LP_NAME <=", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameLike(String value) {
            addCriterion("LP_NAME like", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameNotLike(String value) {
            addCriterion("LP_NAME not like", value, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameIn(List<String> values) {
            addCriterion("LP_NAME in", values, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameNotIn(List<String> values) {
            addCriterion("LP_NAME not in", values, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameBetween(String value1, String value2) {
            addCriterion("LP_NAME between", value1, value2, "lpName");
            return (Criteria) this;
        }

        public Criteria andLpNameNotBetween(String value1, String value2) {
            addCriterion("LP_NAME not between", value1, value2, "lpName");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldIsNull() {
            addCriterion("IDENTITY_TYPE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldIsNotNull() {
            addCriterion("IDENTITY_TYPE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE_OLD =", value, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldNotEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE_OLD <>", value, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldGreaterThan(Short value) {
            addCriterion("IDENTITY_TYPE_OLD >", value, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldGreaterThanOrEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE_OLD >=", value, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldLessThan(Short value) {
            addCriterion("IDENTITY_TYPE_OLD <", value, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldLessThanOrEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE_OLD <=", value, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldIn(List<Short> values) {
            addCriterion("IDENTITY_TYPE_OLD in", values, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldNotIn(List<Short> values) {
            addCriterion("IDENTITY_TYPE_OLD not in", values, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldBetween(Short value1, Short value2) {
            addCriterion("IDENTITY_TYPE_OLD between", value1, value2, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeOldNotBetween(Short value1, Short value2) {
            addCriterion("IDENTITY_TYPE_OLD not between", value1, value2, "identityTypeOld");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNull() {
            addCriterion("IDENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNotNull() {
            addCriterion("IDENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE =", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE <>", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThan(Short value) {
            addCriterion("IDENTITY_TYPE >", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE >=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThan(Short value) {
            addCriterion("IDENTITY_TYPE <", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThanOrEqualTo(Short value) {
            addCriterion("IDENTITY_TYPE <=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIn(List<Short> values) {
            addCriterion("IDENTITY_TYPE in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotIn(List<Short> values) {
            addCriterion("IDENTITY_TYPE not in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeBetween(Short value1, Short value2) {
            addCriterion("IDENTITY_TYPE between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotBetween(Short value1, Short value2) {
            addCriterion("IDENTITY_TYPE not between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldIsNull() {
            addCriterion("IDENTITY_ID_OLD is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldIsNotNull() {
            addCriterion("IDENTITY_ID_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldEqualTo(String value) {
            addCriterion("IDENTITY_ID_OLD =", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldNotEqualTo(String value) {
            addCriterion("IDENTITY_ID_OLD <>", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldGreaterThan(String value) {
            addCriterion("IDENTITY_ID_OLD >", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_ID_OLD >=", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldLessThan(String value) {
            addCriterion("IDENTITY_ID_OLD <", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_ID_OLD <=", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldLike(String value) {
            addCriterion("IDENTITY_ID_OLD like", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldNotLike(String value) {
            addCriterion("IDENTITY_ID_OLD not like", value, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldIn(List<String> values) {
            addCriterion("IDENTITY_ID_OLD in", values, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldNotIn(List<String> values) {
            addCriterion("IDENTITY_ID_OLD not in", values, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldBetween(String value1, String value2) {
            addCriterion("IDENTITY_ID_OLD between", value1, value2, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_ID_OLD not between", value1, value2, "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIsNull() {
            addCriterion("IDENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIsNotNull() {
            addCriterion("IDENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdEqualTo(String value) {
            addCriterion("IDENTITY_ID =", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotEqualTo(String value) {
            addCriterion("IDENTITY_ID <>", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdGreaterThan(String value) {
            addCriterion("IDENTITY_ID >", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_ID >=", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLessThan(String value) {
            addCriterion("IDENTITY_ID <", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_ID <=", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLike(String value) {
            addCriterion("IDENTITY_ID like", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotLike(String value) {
            addCriterion("IDENTITY_ID not like", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIn(List<String> values) {
            addCriterion("IDENTITY_ID in", values, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotIn(List<String> values) {
            addCriterion("IDENTITY_ID not in", values, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdBetween(String value1, String value2) {
            addCriterion("IDENTITY_ID between", value1, value2, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_ID not between", value1, value2, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldIsNull() {
            addCriterion("IDENTITY_URL_OLD is null");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldIsNotNull() {
            addCriterion("IDENTITY_URL_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldEqualTo(String value) {
            addCriterion("IDENTITY_URL_OLD =", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldNotEqualTo(String value) {
            addCriterion("IDENTITY_URL_OLD <>", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldGreaterThan(String value) {
            addCriterion("IDENTITY_URL_OLD >", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_URL_OLD >=", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldLessThan(String value) {
            addCriterion("IDENTITY_URL_OLD <", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_URL_OLD <=", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldLike(String value) {
            addCriterion("IDENTITY_URL_OLD like", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldNotLike(String value) {
            addCriterion("IDENTITY_URL_OLD not like", value, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldIn(List<String> values) {
            addCriterion("IDENTITY_URL_OLD in", values, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldNotIn(List<String> values) {
            addCriterion("IDENTITY_URL_OLD not in", values, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldBetween(String value1, String value2) {
            addCriterion("IDENTITY_URL_OLD between", value1, value2, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_URL_OLD not between", value1, value2, "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlIsNull() {
            addCriterion("IDENTITY_URL is null");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlIsNotNull() {
            addCriterion("IDENTITY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlEqualTo(String value) {
            addCriterion("IDENTITY_URL =", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlNotEqualTo(String value) {
            addCriterion("IDENTITY_URL <>", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlGreaterThan(String value) {
            addCriterion("IDENTITY_URL >", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_URL >=", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlLessThan(String value) {
            addCriterion("IDENTITY_URL <", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_URL <=", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlLike(String value) {
            addCriterion("IDENTITY_URL like", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlNotLike(String value) {
            addCriterion("IDENTITY_URL not like", value, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlIn(List<String> values) {
            addCriterion("IDENTITY_URL in", values, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlNotIn(List<String> values) {
            addCriterion("IDENTITY_URL not in", values, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlBetween(String value1, String value2) {
            addCriterion("IDENTITY_URL between", value1, value2, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_URL not between", value1, value2, "identityUrl");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldIsNull() {
            addCriterion("ORG_TYPE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldIsNotNull() {
            addCriterion("ORG_TYPE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldEqualTo(Short value) {
            addCriterion("ORG_TYPE_OLD =", value, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldNotEqualTo(Short value) {
            addCriterion("ORG_TYPE_OLD <>", value, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldGreaterThan(Short value) {
            addCriterion("ORG_TYPE_OLD >", value, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldGreaterThanOrEqualTo(Short value) {
            addCriterion("ORG_TYPE_OLD >=", value, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldLessThan(Short value) {
            addCriterion("ORG_TYPE_OLD <", value, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldLessThanOrEqualTo(Short value) {
            addCriterion("ORG_TYPE_OLD <=", value, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldIn(List<Short> values) {
            addCriterion("ORG_TYPE_OLD in", values, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldNotIn(List<Short> values) {
            addCriterion("ORG_TYPE_OLD not in", values, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldBetween(Short value1, Short value2) {
            addCriterion("ORG_TYPE_OLD between", value1, value2, "orgTypeOld");
            return (Criteria) this;
        }

        public Criteria andOrgTypeOldNotBetween(Short value1, Short value2) {
            addCriterion("ORG_TYPE_OLD not between", value1, value2, "orgTypeOld");
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

        public Criteria andCompOrgnNumOldIsNull() {
            addCriterion("COMP_ORGN_NUM_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldIsNotNull() {
            addCriterion("COMP_ORGN_NUM_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM_OLD =", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldNotEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM_OLD <>", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldGreaterThan(String value) {
            addCriterion("COMP_ORGN_NUM_OLD >", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM_OLD >=", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldLessThan(String value) {
            addCriterion("COMP_ORGN_NUM_OLD <", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldLessThanOrEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM_OLD <=", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldLike(String value) {
            addCriterion("COMP_ORGN_NUM_OLD like", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldNotLike(String value) {
            addCriterion("COMP_ORGN_NUM_OLD not like", value, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldIn(List<String> values) {
            addCriterion("COMP_ORGN_NUM_OLD in", values, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldNotIn(List<String> values) {
            addCriterion("COMP_ORGN_NUM_OLD not in", values, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldBetween(String value1, String value2) {
            addCriterion("COMP_ORGN_NUM_OLD between", value1, value2, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldNotBetween(String value1, String value2) {
            addCriterion("COMP_ORGN_NUM_OLD not between", value1, value2, "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumIsNull() {
            addCriterion("COMP_ORGN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumIsNotNull() {
            addCriterion("COMP_ORGN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM =", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumNotEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM <>", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumGreaterThan(String value) {
            addCriterion("COMP_ORGN_NUM >", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM >=", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumLessThan(String value) {
            addCriterion("COMP_ORGN_NUM <", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumLessThanOrEqualTo(String value) {
            addCriterion("COMP_ORGN_NUM <=", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumLike(String value) {
            addCriterion("COMP_ORGN_NUM like", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumNotLike(String value) {
            addCriterion("COMP_ORGN_NUM not like", value, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumIn(List<String> values) {
            addCriterion("COMP_ORGN_NUM in", values, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumNotIn(List<String> values) {
            addCriterion("COMP_ORGN_NUM not in", values, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumBetween(String value1, String value2) {
            addCriterion("COMP_ORGN_NUM between", value1, value2, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumNotBetween(String value1, String value2) {
            addCriterion("COMP_ORGN_NUM not between", value1, value2, "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldIsNull() {
            addCriterion("COMP_TYPE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldIsNotNull() {
            addCriterion("COMP_TYPE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldEqualTo(Short value) {
            addCriterion("COMP_TYPE_OLD =", value, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldNotEqualTo(Short value) {
            addCriterion("COMP_TYPE_OLD <>", value, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldGreaterThan(Short value) {
            addCriterion("COMP_TYPE_OLD >", value, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldGreaterThanOrEqualTo(Short value) {
            addCriterion("COMP_TYPE_OLD >=", value, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldLessThan(Short value) {
            addCriterion("COMP_TYPE_OLD <", value, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldLessThanOrEqualTo(Short value) {
            addCriterion("COMP_TYPE_OLD <=", value, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldIn(List<Short> values) {
            addCriterion("COMP_TYPE_OLD in", values, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldNotIn(List<Short> values) {
            addCriterion("COMP_TYPE_OLD not in", values, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldBetween(Short value1, Short value2) {
            addCriterion("COMP_TYPE_OLD between", value1, value2, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeOldNotBetween(Short value1, Short value2) {
            addCriterion("COMP_TYPE_OLD not between", value1, value2, "compTypeOld");
            return (Criteria) this;
        }

        public Criteria andCompTypeIsNull() {
            addCriterion("COMP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompTypeIsNotNull() {
            addCriterion("COMP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompTypeEqualTo(Short value) {
            addCriterion("COMP_TYPE =", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotEqualTo(Short value) {
            addCriterion("COMP_TYPE <>", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeGreaterThan(Short value) {
            addCriterion("COMP_TYPE >", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("COMP_TYPE >=", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLessThan(Short value) {
            addCriterion("COMP_TYPE <", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLessThanOrEqualTo(Short value) {
            addCriterion("COMP_TYPE <=", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeIn(List<Short> values) {
            addCriterion("COMP_TYPE in", values, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotIn(List<Short> values) {
            addCriterion("COMP_TYPE not in", values, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeBetween(Short value1, Short value2) {
            addCriterion("COMP_TYPE between", value1, value2, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotBetween(Short value1, Short value2) {
            addCriterion("COMP_TYPE not between", value1, value2, "compType");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldIsNull() {
            addCriterion("COMP_PROVINCE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldIsNotNull() {
            addCriterion("COMP_PROVINCE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldEqualTo(String value) {
            addCriterion("COMP_PROVINCE_OLD =", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldNotEqualTo(String value) {
            addCriterion("COMP_PROVINCE_OLD <>", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldGreaterThan(String value) {
            addCriterion("COMP_PROVINCE_OLD >", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_PROVINCE_OLD >=", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldLessThan(String value) {
            addCriterion("COMP_PROVINCE_OLD <", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldLessThanOrEqualTo(String value) {
            addCriterion("COMP_PROVINCE_OLD <=", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldLike(String value) {
            addCriterion("COMP_PROVINCE_OLD like", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldNotLike(String value) {
            addCriterion("COMP_PROVINCE_OLD not like", value, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldIn(List<String> values) {
            addCriterion("COMP_PROVINCE_OLD in", values, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldNotIn(List<String> values) {
            addCriterion("COMP_PROVINCE_OLD not in", values, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldBetween(String value1, String value2) {
            addCriterion("COMP_PROVINCE_OLD between", value1, value2, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldNotBetween(String value1, String value2) {
            addCriterion("COMP_PROVINCE_OLD not between", value1, value2, "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceIsNull() {
            addCriterion("COMP_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceIsNotNull() {
            addCriterion("COMP_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceEqualTo(String value) {
            addCriterion("COMP_PROVINCE =", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceNotEqualTo(String value) {
            addCriterion("COMP_PROVINCE <>", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceGreaterThan(String value) {
            addCriterion("COMP_PROVINCE >", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_PROVINCE >=", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceLessThan(String value) {
            addCriterion("COMP_PROVINCE <", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceLessThanOrEqualTo(String value) {
            addCriterion("COMP_PROVINCE <=", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceLike(String value) {
            addCriterion("COMP_PROVINCE like", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceNotLike(String value) {
            addCriterion("COMP_PROVINCE not like", value, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceIn(List<String> values) {
            addCriterion("COMP_PROVINCE in", values, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceNotIn(List<String> values) {
            addCriterion("COMP_PROVINCE not in", values, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceBetween(String value1, String value2) {
            addCriterion("COMP_PROVINCE between", value1, value2, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompProvinceNotBetween(String value1, String value2) {
            addCriterion("COMP_PROVINCE not between", value1, value2, "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompCityOldIsNull() {
            addCriterion("COMP_CITY_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCompCityOldIsNotNull() {
            addCriterion("COMP_CITY_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCompCityOldEqualTo(String value) {
            addCriterion("COMP_CITY_OLD =", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldNotEqualTo(String value) {
            addCriterion("COMP_CITY_OLD <>", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldGreaterThan(String value) {
            addCriterion("COMP_CITY_OLD >", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_CITY_OLD >=", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldLessThan(String value) {
            addCriterion("COMP_CITY_OLD <", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldLessThanOrEqualTo(String value) {
            addCriterion("COMP_CITY_OLD <=", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldLike(String value) {
            addCriterion("COMP_CITY_OLD like", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldNotLike(String value) {
            addCriterion("COMP_CITY_OLD not like", value, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldIn(List<String> values) {
            addCriterion("COMP_CITY_OLD in", values, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldNotIn(List<String> values) {
            addCriterion("COMP_CITY_OLD not in", values, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldBetween(String value1, String value2) {
            addCriterion("COMP_CITY_OLD between", value1, value2, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityOldNotBetween(String value1, String value2) {
            addCriterion("COMP_CITY_OLD not between", value1, value2, "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityIsNull() {
            addCriterion("COMP_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCompCityIsNotNull() {
            addCriterion("COMP_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCompCityEqualTo(String value) {
            addCriterion("COMP_CITY =", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityNotEqualTo(String value) {
            addCriterion("COMP_CITY <>", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityGreaterThan(String value) {
            addCriterion("COMP_CITY >", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_CITY >=", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityLessThan(String value) {
            addCriterion("COMP_CITY <", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityLessThanOrEqualTo(String value) {
            addCriterion("COMP_CITY <=", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityLike(String value) {
            addCriterion("COMP_CITY like", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityNotLike(String value) {
            addCriterion("COMP_CITY not like", value, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityIn(List<String> values) {
            addCriterion("COMP_CITY in", values, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityNotIn(List<String> values) {
            addCriterion("COMP_CITY not in", values, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityBetween(String value1, String value2) {
            addCriterion("COMP_CITY between", value1, value2, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompCityNotBetween(String value1, String value2) {
            addCriterion("COMP_CITY not between", value1, value2, "compCity");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldIsNull() {
            addCriterion("COMP_DISTRICT_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldIsNotNull() {
            addCriterion("COMP_DISTRICT_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldEqualTo(String value) {
            addCriterion("COMP_DISTRICT_OLD =", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldNotEqualTo(String value) {
            addCriterion("COMP_DISTRICT_OLD <>", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldGreaterThan(String value) {
            addCriterion("COMP_DISTRICT_OLD >", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_DISTRICT_OLD >=", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldLessThan(String value) {
            addCriterion("COMP_DISTRICT_OLD <", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldLessThanOrEqualTo(String value) {
            addCriterion("COMP_DISTRICT_OLD <=", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldLike(String value) {
            addCriterion("COMP_DISTRICT_OLD like", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldNotLike(String value) {
            addCriterion("COMP_DISTRICT_OLD not like", value, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldIn(List<String> values) {
            addCriterion("COMP_DISTRICT_OLD in", values, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldNotIn(List<String> values) {
            addCriterion("COMP_DISTRICT_OLD not in", values, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldBetween(String value1, String value2) {
            addCriterion("COMP_DISTRICT_OLD between", value1, value2, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldNotBetween(String value1, String value2) {
            addCriterion("COMP_DISTRICT_OLD not between", value1, value2, "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictIsNull() {
            addCriterion("COMP_DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictIsNotNull() {
            addCriterion("COMP_DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictEqualTo(String value) {
            addCriterion("COMP_DISTRICT =", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictNotEqualTo(String value) {
            addCriterion("COMP_DISTRICT <>", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictGreaterThan(String value) {
            addCriterion("COMP_DISTRICT >", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_DISTRICT >=", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictLessThan(String value) {
            addCriterion("COMP_DISTRICT <", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictLessThanOrEqualTo(String value) {
            addCriterion("COMP_DISTRICT <=", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictLike(String value) {
            addCriterion("COMP_DISTRICT like", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictNotLike(String value) {
            addCriterion("COMP_DISTRICT not like", value, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictIn(List<String> values) {
            addCriterion("COMP_DISTRICT in", values, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictNotIn(List<String> values) {
            addCriterion("COMP_DISTRICT not in", values, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictBetween(String value1, String value2) {
            addCriterion("COMP_DISTRICT between", value1, value2, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDistrictNotBetween(String value1, String value2) {
            addCriterion("COMP_DISTRICT not between", value1, value2, "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldIsNull() {
            addCriterion("COMP_ADDR_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldIsNotNull() {
            addCriterion("COMP_ADDR_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldEqualTo(String value) {
            addCriterion("COMP_ADDR_OLD =", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldNotEqualTo(String value) {
            addCriterion("COMP_ADDR_OLD <>", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldGreaterThan(String value) {
            addCriterion("COMP_ADDR_OLD >", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_OLD >=", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldLessThan(String value) {
            addCriterion("COMP_ADDR_OLD <", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_OLD <=", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldLike(String value) {
            addCriterion("COMP_ADDR_OLD like", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldNotLike(String value) {
            addCriterion("COMP_ADDR_OLD not like", value, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldIn(List<String> values) {
            addCriterion("COMP_ADDR_OLD in", values, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldNotIn(List<String> values) {
            addCriterion("COMP_ADDR_OLD not in", values, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_OLD between", value1, value2, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_OLD not between", value1, value2, "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrIsNull() {
            addCriterion("COMP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrIsNotNull() {
            addCriterion("COMP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrEqualTo(String value) {
            addCriterion("COMP_ADDR =", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotEqualTo(String value) {
            addCriterion("COMP_ADDR <>", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrGreaterThan(String value) {
            addCriterion("COMP_ADDR >", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR >=", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrLessThan(String value) {
            addCriterion("COMP_ADDR <", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR <=", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrLike(String value) {
            addCriterion("COMP_ADDR like", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotLike(String value) {
            addCriterion("COMP_ADDR not like", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrIn(List<String> values) {
            addCriterion("COMP_ADDR in", values, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotIn(List<String> values) {
            addCriterion("COMP_ADDR not in", values, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrBetween(String value1, String value2) {
            addCriterion("COMP_ADDR between", value1, value2, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDR not between", value1, value2, "compAddr");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldIsNull() {
            addCriterion("BUSINESS_LICENSE_URL_OLD is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldIsNotNull() {
            addCriterion("BUSINESS_LICENSE_URL_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD =", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD <>", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD >", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD >=", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldLessThan(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD <", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD <=", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldLike(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD like", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldNotLike(String value) {
            addCriterion("BUSINESS_LICENSE_URL_OLD not like", value, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_URL_OLD in", values, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_URL_OLD not in", values, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_URL_OLD between", value1, value2, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_URL_OLD not between", value1, value2, "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNull() {
            addCriterion("BUSINESS_LICENSE_URL is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNotNull() {
            addCriterion("BUSINESS_LICENSE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL =", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL <>", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE_URL >", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL >=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThan(String value) {
            addCriterion("BUSINESS_LICENSE_URL <", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_URL <=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLike(String value) {
            addCriterion("BUSINESS_LICENSE_URL like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotLike(String value) {
            addCriterion("BUSINESS_LICENSE_URL not like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_URL in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_URL not in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_URL between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_URL not between", value1, value2, "businessLicenseUrl");
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

        public Criteria andEntpIdLikeInsensitive(String value) {
            addCriterion("upper(ENTP_ID) like", value.toUpperCase(), "entpId");
            return (Criteria) this;
        }

        public Criteria andFullnameOldLikeInsensitive(String value) {
            addCriterion("upper(FULLNAME_OLD) like", value.toUpperCase(), "fullnameOld");
            return (Criteria) this;
        }

        public Criteria andFullnameLikeInsensitive(String value) {
            addCriterion("upper(FULLNAME) like", value.toUpperCase(), "fullname");
            return (Criteria) this;
        }

        public Criteria andShortnameOldLikeInsensitive(String value) {
            addCriterion("upper(SHORTNAME_OLD) like", value.toUpperCase(), "shortnameOld");
            return (Criteria) this;
        }

        public Criteria andShortnameLikeInsensitive(String value) {
            addCriterion("upper(SHORTNAME) like", value.toUpperCase(), "shortname");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinOldLikeInsensitive(String value) {
            addCriterion("upper(FULLNAME_PINYIN_OLD) like", value.toUpperCase(), "fullnamePinyinOld");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinLikeInsensitive(String value) {
            addCriterion("upper(FULLNAME_PINYIN) like", value.toUpperCase(), "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andLpNameOldLikeInsensitive(String value) {
            addCriterion("upper(LP_NAME_OLD) like", value.toUpperCase(), "lpNameOld");
            return (Criteria) this;
        }

        public Criteria andLpNameLikeInsensitive(String value) {
            addCriterion("upper(LP_NAME) like", value.toUpperCase(), "lpName");
            return (Criteria) this;
        }

        public Criteria andIdentityIdOldLikeInsensitive(String value) {
            addCriterion("upper(IDENTITY_ID_OLD) like", value.toUpperCase(), "identityIdOld");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLikeInsensitive(String value) {
            addCriterion("upper(IDENTITY_ID) like", value.toUpperCase(), "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlOldLikeInsensitive(String value) {
            addCriterion("upper(IDENTITY_URL_OLD) like", value.toUpperCase(), "identityUrlOld");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlLikeInsensitive(String value) {
            addCriterion("upper(IDENTITY_URL) like", value.toUpperCase(), "identityUrl");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumOldLikeInsensitive(String value) {
            addCriterion("upper(COMP_ORGN_NUM_OLD) like", value.toUpperCase(), "compOrgnNumOld");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumLikeInsensitive(String value) {
            addCriterion("upper(COMP_ORGN_NUM) like", value.toUpperCase(), "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompProvinceOldLikeInsensitive(String value) {
            addCriterion("upper(COMP_PROVINCE_OLD) like", value.toUpperCase(), "compProvinceOld");
            return (Criteria) this;
        }

        public Criteria andCompProvinceLikeInsensitive(String value) {
            addCriterion("upper(COMP_PROVINCE) like", value.toUpperCase(), "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompCityOldLikeInsensitive(String value) {
            addCriterion("upper(COMP_CITY_OLD) like", value.toUpperCase(), "compCityOld");
            return (Criteria) this;
        }

        public Criteria andCompCityLikeInsensitive(String value) {
            addCriterion("upper(COMP_CITY) like", value.toUpperCase(), "compCity");
            return (Criteria) this;
        }

        public Criteria andCompDistrictOldLikeInsensitive(String value) {
            addCriterion("upper(COMP_DISTRICT_OLD) like", value.toUpperCase(), "compDistrictOld");
            return (Criteria) this;
        }

        public Criteria andCompDistrictLikeInsensitive(String value) {
            addCriterion("upper(COMP_DISTRICT) like", value.toUpperCase(), "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrOldLikeInsensitive(String value) {
            addCriterion("upper(COMP_ADDR_OLD) like", value.toUpperCase(), "compAddrOld");
            return (Criteria) this;
        }

        public Criteria andCompAddrLikeInsensitive(String value) {
            addCriterion("upper(COMP_ADDR) like", value.toUpperCase(), "compAddr");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlOldLikeInsensitive(String value) {
            addCriterion("upper(BUSINESS_LICENSE_URL_OLD) like", value.toUpperCase(), "businessLicenseUrlOld");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLikeInsensitive(String value) {
            addCriterion("upper(BUSINESS_LICENSE_URL) like", value.toUpperCase(), "businessLicenseUrl");
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
     * D_UC_ENTERPRISE_AUDIT_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_ENTERPRISE_AUDIT_INFO null
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