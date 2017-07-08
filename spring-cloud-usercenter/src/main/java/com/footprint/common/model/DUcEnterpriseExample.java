package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcEnterpriseExample {
    /**
     * D_UC_ENTERPRISE
     */
    protected String orderByClause;

    /**
     * D_UC_ENTERPRISE
     */
    protected boolean distinct;

    /**
     * D_UC_ENTERPRISE
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_ENTERPRISE
     */
    protected Page page;

    public DUcEnterpriseExample() {
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
     * D_UC_ENTERPRISE null
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

        public Criteria andEntpStatusIsNull() {
            addCriterion("ENTP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEntpStatusIsNotNull() {
            addCriterion("ENTP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEntpStatusEqualTo(Short value) {
            addCriterion("ENTP_STATUS =", value, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusNotEqualTo(Short value) {
            addCriterion("ENTP_STATUS <>", value, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusGreaterThan(Short value) {
            addCriterion("ENTP_STATUS >", value, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("ENTP_STATUS >=", value, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusLessThan(Short value) {
            addCriterion("ENTP_STATUS <", value, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusLessThanOrEqualTo(Short value) {
            addCriterion("ENTP_STATUS <=", value, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusIn(List<Short> values) {
            addCriterion("ENTP_STATUS in", values, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusNotIn(List<Short> values) {
            addCriterion("ENTP_STATUS not in", values, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusBetween(Short value1, Short value2) {
            addCriterion("ENTP_STATUS between", value1, value2, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andEntpStatusNotBetween(Short value1, Short value2) {
            addCriterion("ENTP_STATUS not between", value1, value2, "entpStatus");
            return (Criteria) this;
        }

        public Criteria andFullnameEngIsNull() {
            addCriterion("FULLNAME_ENG is null");
            return (Criteria) this;
        }

        public Criteria andFullnameEngIsNotNull() {
            addCriterion("FULLNAME_ENG is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEngEqualTo(String value) {
            addCriterion("FULLNAME_ENG =", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngNotEqualTo(String value) {
            addCriterion("FULLNAME_ENG <>", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngGreaterThan(String value) {
            addCriterion("FULLNAME_ENG >", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngGreaterThanOrEqualTo(String value) {
            addCriterion("FULLNAME_ENG >=", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngLessThan(String value) {
            addCriterion("FULLNAME_ENG <", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngLessThanOrEqualTo(String value) {
            addCriterion("FULLNAME_ENG <=", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngLike(String value) {
            addCriterion("FULLNAME_ENG like", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngNotLike(String value) {
            addCriterion("FULLNAME_ENG not like", value, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngIn(List<String> values) {
            addCriterion("FULLNAME_ENG in", values, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngNotIn(List<String> values) {
            addCriterion("FULLNAME_ENG not in", values, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngBetween(String value1, String value2) {
            addCriterion("FULLNAME_ENG between", value1, value2, "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameEngNotBetween(String value1, String value2) {
            addCriterion("FULLNAME_ENG not between", value1, value2, "fullnameEng");
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

        public Criteria andLpMbphoneIsNull() {
            addCriterion("LP_MBPHONE is null");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneIsNotNull() {
            addCriterion("LP_MBPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneEqualTo(String value) {
            addCriterion("LP_MBPHONE =", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneNotEqualTo(String value) {
            addCriterion("LP_MBPHONE <>", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneGreaterThan(String value) {
            addCriterion("LP_MBPHONE >", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneGreaterThanOrEqualTo(String value) {
            addCriterion("LP_MBPHONE >=", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneLessThan(String value) {
            addCriterion("LP_MBPHONE <", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneLessThanOrEqualTo(String value) {
            addCriterion("LP_MBPHONE <=", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneLike(String value) {
            addCriterion("LP_MBPHONE like", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneNotLike(String value) {
            addCriterion("LP_MBPHONE not like", value, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneIn(List<String> values) {
            addCriterion("LP_MBPHONE in", values, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneNotIn(List<String> values) {
            addCriterion("LP_MBPHONE not in", values, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneBetween(String value1, String value2) {
            addCriterion("LP_MBPHONE between", value1, value2, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneNotBetween(String value1, String value2) {
            addCriterion("LP_MBPHONE not between", value1, value2, "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpTelIsNull() {
            addCriterion("LP_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLpTelIsNotNull() {
            addCriterion("LP_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLpTelEqualTo(String value) {
            addCriterion("LP_TEL =", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelNotEqualTo(String value) {
            addCriterion("LP_TEL <>", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelGreaterThan(String value) {
            addCriterion("LP_TEL >", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelGreaterThanOrEqualTo(String value) {
            addCriterion("LP_TEL >=", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelLessThan(String value) {
            addCriterion("LP_TEL <", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelLessThanOrEqualTo(String value) {
            addCriterion("LP_TEL <=", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelLike(String value) {
            addCriterion("LP_TEL like", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelNotLike(String value) {
            addCriterion("LP_TEL not like", value, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelIn(List<String> values) {
            addCriterion("LP_TEL in", values, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelNotIn(List<String> values) {
            addCriterion("LP_TEL not in", values, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelBetween(String value1, String value2) {
            addCriterion("LP_TEL between", value1, value2, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpTelNotBetween(String value1, String value2) {
            addCriterion("LP_TEL not between", value1, value2, "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpEmalIsNull() {
            addCriterion("LP_EMAL is null");
            return (Criteria) this;
        }

        public Criteria andLpEmalIsNotNull() {
            addCriterion("LP_EMAL is not null");
            return (Criteria) this;
        }

        public Criteria andLpEmalEqualTo(String value) {
            addCriterion("LP_EMAL =", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalNotEqualTo(String value) {
            addCriterion("LP_EMAL <>", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalGreaterThan(String value) {
            addCriterion("LP_EMAL >", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalGreaterThanOrEqualTo(String value) {
            addCriterion("LP_EMAL >=", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalLessThan(String value) {
            addCriterion("LP_EMAL <", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalLessThanOrEqualTo(String value) {
            addCriterion("LP_EMAL <=", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalLike(String value) {
            addCriterion("LP_EMAL like", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalNotLike(String value) {
            addCriterion("LP_EMAL not like", value, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalIn(List<String> values) {
            addCriterion("LP_EMAL in", values, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalNotIn(List<String> values) {
            addCriterion("LP_EMAL not in", values, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalBetween(String value1, String value2) {
            addCriterion("LP_EMAL between", value1, value2, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpEmalNotBetween(String value1, String value2) {
            addCriterion("LP_EMAL not between", value1, value2, "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpFaxIsNull() {
            addCriterion("LP_FAX is null");
            return (Criteria) this;
        }

        public Criteria andLpFaxIsNotNull() {
            addCriterion("LP_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andLpFaxEqualTo(String value) {
            addCriterion("LP_FAX =", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxNotEqualTo(String value) {
            addCriterion("LP_FAX <>", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxGreaterThan(String value) {
            addCriterion("LP_FAX >", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxGreaterThanOrEqualTo(String value) {
            addCriterion("LP_FAX >=", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxLessThan(String value) {
            addCriterion("LP_FAX <", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxLessThanOrEqualTo(String value) {
            addCriterion("LP_FAX <=", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxLike(String value) {
            addCriterion("LP_FAX like", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxNotLike(String value) {
            addCriterion("LP_FAX not like", value, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxIn(List<String> values) {
            addCriterion("LP_FAX in", values, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxNotIn(List<String> values) {
            addCriterion("LP_FAX not in", values, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxBetween(String value1, String value2) {
            addCriterion("LP_FAX between", value1, value2, "lpFax");
            return (Criteria) this;
        }

        public Criteria andLpFaxNotBetween(String value1, String value2) {
            addCriterion("LP_FAX not between", value1, value2, "lpFax");
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

        public Criteria andCompRegfundIsNull() {
            addCriterion("COMP_REGFUND is null");
            return (Criteria) this;
        }

        public Criteria andCompRegfundIsNotNull() {
            addCriterion("COMP_REGFUND is not null");
            return (Criteria) this;
        }

        public Criteria andCompRegfundEqualTo(String value) {
            addCriterion("COMP_REGFUND =", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundNotEqualTo(String value) {
            addCriterion("COMP_REGFUND <>", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundGreaterThan(String value) {
            addCriterion("COMP_REGFUND >", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_REGFUND >=", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundLessThan(String value) {
            addCriterion("COMP_REGFUND <", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundLessThanOrEqualTo(String value) {
            addCriterion("COMP_REGFUND <=", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundLike(String value) {
            addCriterion("COMP_REGFUND like", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundNotLike(String value) {
            addCriterion("COMP_REGFUND not like", value, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundIn(List<String> values) {
            addCriterion("COMP_REGFUND in", values, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundNotIn(List<String> values) {
            addCriterion("COMP_REGFUND not in", values, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundBetween(String value1, String value2) {
            addCriterion("COMP_REGFUND between", value1, value2, "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompRegfundNotBetween(String value1, String value2) {
            addCriterion("COMP_REGFUND not between", value1, value2, "compRegfund");
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

        public Criteria andCompTaxregcertIsNull() {
            addCriterion("COMP_TAXREGCERT is null");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertIsNotNull() {
            addCriterion("COMP_TAXREGCERT is not null");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertEqualTo(String value) {
            addCriterion("COMP_TAXREGCERT =", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertNotEqualTo(String value) {
            addCriterion("COMP_TAXREGCERT <>", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertGreaterThan(String value) {
            addCriterion("COMP_TAXREGCERT >", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_TAXREGCERT >=", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertLessThan(String value) {
            addCriterion("COMP_TAXREGCERT <", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertLessThanOrEqualTo(String value) {
            addCriterion("COMP_TAXREGCERT <=", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertLike(String value) {
            addCriterion("COMP_TAXREGCERT like", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertNotLike(String value) {
            addCriterion("COMP_TAXREGCERT not like", value, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertIn(List<String> values) {
            addCriterion("COMP_TAXREGCERT in", values, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertNotIn(List<String> values) {
            addCriterion("COMP_TAXREGCERT not in", values, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertBetween(String value1, String value2) {
            addCriterion("COMP_TAXREGCERT between", value1, value2, "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertNotBetween(String value1, String value2) {
            addCriterion("COMP_TAXREGCERT not between", value1, value2, "compTaxregcert");
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

        public Criteria andCompAddrEngIsNull() {
            addCriterion("COMP_ADDR_ENG is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngIsNotNull() {
            addCriterion("COMP_ADDR_ENG is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngEqualTo(String value) {
            addCriterion("COMP_ADDR_ENG =", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngNotEqualTo(String value) {
            addCriterion("COMP_ADDR_ENG <>", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngGreaterThan(String value) {
            addCriterion("COMP_ADDR_ENG >", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_ENG >=", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngLessThan(String value) {
            addCriterion("COMP_ADDR_ENG <", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_ENG <=", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngLike(String value) {
            addCriterion("COMP_ADDR_ENG like", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngNotLike(String value) {
            addCriterion("COMP_ADDR_ENG not like", value, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngIn(List<String> values) {
            addCriterion("COMP_ADDR_ENG in", values, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngNotIn(List<String> values) {
            addCriterion("COMP_ADDR_ENG not in", values, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_ENG between", value1, value2, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_ENG not between", value1, value2, "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommIsNull() {
            addCriterion("COMP_PROVINCE_COMM is null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommIsNotNull() {
            addCriterion("COMP_PROVINCE_COMM is not null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommEqualTo(String value) {
            addCriterion("COMP_PROVINCE_COMM =", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommNotEqualTo(String value) {
            addCriterion("COMP_PROVINCE_COMM <>", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommGreaterThan(String value) {
            addCriterion("COMP_PROVINCE_COMM >", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_PROVINCE_COMM >=", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommLessThan(String value) {
            addCriterion("COMP_PROVINCE_COMM <", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommLessThanOrEqualTo(String value) {
            addCriterion("COMP_PROVINCE_COMM <=", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommLike(String value) {
            addCriterion("COMP_PROVINCE_COMM like", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommNotLike(String value) {
            addCriterion("COMP_PROVINCE_COMM not like", value, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommIn(List<String> values) {
            addCriterion("COMP_PROVINCE_COMM in", values, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommNotIn(List<String> values) {
            addCriterion("COMP_PROVINCE_COMM not in", values, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommBetween(String value1, String value2) {
            addCriterion("COMP_PROVINCE_COMM between", value1, value2, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommNotBetween(String value1, String value2) {
            addCriterion("COMP_PROVINCE_COMM not between", value1, value2, "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommIsNull() {
            addCriterion("COMP_CITY_COMM is null");
            return (Criteria) this;
        }

        public Criteria andCompCityCommIsNotNull() {
            addCriterion("COMP_CITY_COMM is not null");
            return (Criteria) this;
        }

        public Criteria andCompCityCommEqualTo(String value) {
            addCriterion("COMP_CITY_COMM =", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommNotEqualTo(String value) {
            addCriterion("COMP_CITY_COMM <>", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommGreaterThan(String value) {
            addCriterion("COMP_CITY_COMM >", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_CITY_COMM >=", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommLessThan(String value) {
            addCriterion("COMP_CITY_COMM <", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommLessThanOrEqualTo(String value) {
            addCriterion("COMP_CITY_COMM <=", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommLike(String value) {
            addCriterion("COMP_CITY_COMM like", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommNotLike(String value) {
            addCriterion("COMP_CITY_COMM not like", value, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommIn(List<String> values) {
            addCriterion("COMP_CITY_COMM in", values, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommNotIn(List<String> values) {
            addCriterion("COMP_CITY_COMM not in", values, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommBetween(String value1, String value2) {
            addCriterion("COMP_CITY_COMM between", value1, value2, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommNotBetween(String value1, String value2) {
            addCriterion("COMP_CITY_COMM not between", value1, value2, "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommIsNull() {
            addCriterion("COMP_DISTRICT_COMM is null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommIsNotNull() {
            addCriterion("COMP_DISTRICT_COMM is not null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommEqualTo(String value) {
            addCriterion("COMP_DISTRICT_COMM =", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommNotEqualTo(String value) {
            addCriterion("COMP_DISTRICT_COMM <>", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommGreaterThan(String value) {
            addCriterion("COMP_DISTRICT_COMM >", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_DISTRICT_COMM >=", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommLessThan(String value) {
            addCriterion("COMP_DISTRICT_COMM <", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommLessThanOrEqualTo(String value) {
            addCriterion("COMP_DISTRICT_COMM <=", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommLike(String value) {
            addCriterion("COMP_DISTRICT_COMM like", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommNotLike(String value) {
            addCriterion("COMP_DISTRICT_COMM not like", value, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommIn(List<String> values) {
            addCriterion("COMP_DISTRICT_COMM in", values, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommNotIn(List<String> values) {
            addCriterion("COMP_DISTRICT_COMM not in", values, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommBetween(String value1, String value2) {
            addCriterion("COMP_DISTRICT_COMM between", value1, value2, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommNotBetween(String value1, String value2) {
            addCriterion("COMP_DISTRICT_COMM not between", value1, value2, "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommIsNull() {
            addCriterion("COMP_ADDR_COMM is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommIsNotNull() {
            addCriterion("COMP_ADDR_COMM is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommEqualTo(String value) {
            addCriterion("COMP_ADDR_COMM =", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommNotEqualTo(String value) {
            addCriterion("COMP_ADDR_COMM <>", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommGreaterThan(String value) {
            addCriterion("COMP_ADDR_COMM >", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_COMM >=", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommLessThan(String value) {
            addCriterion("COMP_ADDR_COMM <", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_COMM <=", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommLike(String value) {
            addCriterion("COMP_ADDR_COMM like", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommNotLike(String value) {
            addCriterion("COMP_ADDR_COMM not like", value, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommIn(List<String> values) {
            addCriterion("COMP_ADDR_COMM in", values, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommNotIn(List<String> values) {
            addCriterion("COMP_ADDR_COMM not in", values, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_COMM between", value1, value2, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_COMM not between", value1, value2, "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeIsNull() {
            addCriterion("COMP_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeIsNotNull() {
            addCriterion("COMP_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeEqualTo(String value) {
            addCriterion("COMP_POSTCODE =", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeNotEqualTo(String value) {
            addCriterion("COMP_POSTCODE <>", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeGreaterThan(String value) {
            addCriterion("COMP_POSTCODE >", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_POSTCODE >=", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeLessThan(String value) {
            addCriterion("COMP_POSTCODE <", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeLessThanOrEqualTo(String value) {
            addCriterion("COMP_POSTCODE <=", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeLike(String value) {
            addCriterion("COMP_POSTCODE like", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeNotLike(String value) {
            addCriterion("COMP_POSTCODE not like", value, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeIn(List<String> values) {
            addCriterion("COMP_POSTCODE in", values, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeNotIn(List<String> values) {
            addCriterion("COMP_POSTCODE not in", values, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeBetween(String value1, String value2) {
            addCriterion("COMP_POSTCODE between", value1, value2, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeNotBetween(String value1, String value2) {
            addCriterion("COMP_POSTCODE not between", value1, value2, "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompTelIsNull() {
            addCriterion("COMP_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCompTelIsNotNull() {
            addCriterion("COMP_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCompTelEqualTo(String value) {
            addCriterion("COMP_TEL =", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelNotEqualTo(String value) {
            addCriterion("COMP_TEL <>", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelGreaterThan(String value) {
            addCriterion("COMP_TEL >", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_TEL >=", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelLessThan(String value) {
            addCriterion("COMP_TEL <", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelLessThanOrEqualTo(String value) {
            addCriterion("COMP_TEL <=", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelLike(String value) {
            addCriterion("COMP_TEL like", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelNotLike(String value) {
            addCriterion("COMP_TEL not like", value, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelIn(List<String> values) {
            addCriterion("COMP_TEL in", values, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelNotIn(List<String> values) {
            addCriterion("COMP_TEL not in", values, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelBetween(String value1, String value2) {
            addCriterion("COMP_TEL between", value1, value2, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompTelNotBetween(String value1, String value2) {
            addCriterion("COMP_TEL not between", value1, value2, "compTel");
            return (Criteria) this;
        }

        public Criteria andCompFaxIsNull() {
            addCriterion("COMP_FAX is null");
            return (Criteria) this;
        }

        public Criteria andCompFaxIsNotNull() {
            addCriterion("COMP_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andCompFaxEqualTo(String value) {
            addCriterion("COMP_FAX =", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxNotEqualTo(String value) {
            addCriterion("COMP_FAX <>", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxGreaterThan(String value) {
            addCriterion("COMP_FAX >", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_FAX >=", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxLessThan(String value) {
            addCriterion("COMP_FAX <", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxLessThanOrEqualTo(String value) {
            addCriterion("COMP_FAX <=", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxLike(String value) {
            addCriterion("COMP_FAX like", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxNotLike(String value) {
            addCriterion("COMP_FAX not like", value, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxIn(List<String> values) {
            addCriterion("COMP_FAX in", values, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxNotIn(List<String> values) {
            addCriterion("COMP_FAX not in", values, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxBetween(String value1, String value2) {
            addCriterion("COMP_FAX between", value1, value2, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompFaxNotBetween(String value1, String value2) {
            addCriterion("COMP_FAX not between", value1, value2, "compFax");
            return (Criteria) this;
        }

        public Criteria andCompMailIsNull() {
            addCriterion("COMP_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andCompMailIsNotNull() {
            addCriterion("COMP_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCompMailEqualTo(String value) {
            addCriterion("COMP_MAIL =", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailNotEqualTo(String value) {
            addCriterion("COMP_MAIL <>", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailGreaterThan(String value) {
            addCriterion("COMP_MAIL >", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_MAIL >=", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailLessThan(String value) {
            addCriterion("COMP_MAIL <", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailLessThanOrEqualTo(String value) {
            addCriterion("COMP_MAIL <=", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailLike(String value) {
            addCriterion("COMP_MAIL like", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailNotLike(String value) {
            addCriterion("COMP_MAIL not like", value, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailIn(List<String> values) {
            addCriterion("COMP_MAIL in", values, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailNotIn(List<String> values) {
            addCriterion("COMP_MAIL not in", values, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailBetween(String value1, String value2) {
            addCriterion("COMP_MAIL between", value1, value2, "compMail");
            return (Criteria) this;
        }

        public Criteria andCompMailNotBetween(String value1, String value2) {
            addCriterion("COMP_MAIL not between", value1, value2, "compMail");
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

        public Criteria andTaxLicenseUrlIsNull() {
            addCriterion("TAX_LICENSE_URL is null");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlIsNotNull() {
            addCriterion("TAX_LICENSE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlEqualTo(String value) {
            addCriterion("TAX_LICENSE_URL =", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlNotEqualTo(String value) {
            addCriterion("TAX_LICENSE_URL <>", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlGreaterThan(String value) {
            addCriterion("TAX_LICENSE_URL >", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_LICENSE_URL >=", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlLessThan(String value) {
            addCriterion("TAX_LICENSE_URL <", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("TAX_LICENSE_URL <=", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlLike(String value) {
            addCriterion("TAX_LICENSE_URL like", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlNotLike(String value) {
            addCriterion("TAX_LICENSE_URL not like", value, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlIn(List<String> values) {
            addCriterion("TAX_LICENSE_URL in", values, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlNotIn(List<String> values) {
            addCriterion("TAX_LICENSE_URL not in", values, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlBetween(String value1, String value2) {
            addCriterion("TAX_LICENSE_URL between", value1, value2, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("TAX_LICENSE_URL not between", value1, value2, "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlIsNull() {
            addCriterion("ORG_CODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlIsNotNull() {
            addCriterion("ORG_CODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlEqualTo(String value) {
            addCriterion("ORG_CODE_URL =", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlNotEqualTo(String value) {
            addCriterion("ORG_CODE_URL <>", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlGreaterThan(String value) {
            addCriterion("ORG_CODE_URL >", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE_URL >=", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlLessThan(String value) {
            addCriterion("ORG_CODE_URL <", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE_URL <=", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlLike(String value) {
            addCriterion("ORG_CODE_URL like", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlNotLike(String value) {
            addCriterion("ORG_CODE_URL not like", value, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlIn(List<String> values) {
            addCriterion("ORG_CODE_URL in", values, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlNotIn(List<String> values) {
            addCriterion("ORG_CODE_URL not in", values, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlBetween(String value1, String value2) {
            addCriterion("ORG_CODE_URL between", value1, value2, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE_URL not between", value1, value2, "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andMaininComeIsNull() {
            addCriterion("MAININ_COME is null");
            return (Criteria) this;
        }

        public Criteria andMaininComeIsNotNull() {
            addCriterion("MAININ_COME is not null");
            return (Criteria) this;
        }

        public Criteria andMaininComeEqualTo(String value) {
            addCriterion("MAININ_COME =", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeNotEqualTo(String value) {
            addCriterion("MAININ_COME <>", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeGreaterThan(String value) {
            addCriterion("MAININ_COME >", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeGreaterThanOrEqualTo(String value) {
            addCriterion("MAININ_COME >=", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeLessThan(String value) {
            addCriterion("MAININ_COME <", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeLessThanOrEqualTo(String value) {
            addCriterion("MAININ_COME <=", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeLike(String value) {
            addCriterion("MAININ_COME like", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeNotLike(String value) {
            addCriterion("MAININ_COME not like", value, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeIn(List<String> values) {
            addCriterion("MAININ_COME in", values, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeNotIn(List<String> values) {
            addCriterion("MAININ_COME not in", values, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeBetween(String value1, String value2) {
            addCriterion("MAININ_COME between", value1, value2, "maininCome");
            return (Criteria) this;
        }

        public Criteria andMaininComeNotBetween(String value1, String value2) {
            addCriterion("MAININ_COME not between", value1, value2, "maininCome");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateIsNull() {
            addCriterion("ESTABLISHMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateIsNotNull() {
            addCriterion("ESTABLISHMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateEqualTo(Date value) {
            addCriterion("ESTABLISHMENT_DATE =", value, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateNotEqualTo(Date value) {
            addCriterion("ESTABLISHMENT_DATE <>", value, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateGreaterThan(Date value) {
            addCriterion("ESTABLISHMENT_DATE >", value, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ESTABLISHMENT_DATE >=", value, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateLessThan(Date value) {
            addCriterion("ESTABLISHMENT_DATE <", value, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateLessThanOrEqualTo(Date value) {
            addCriterion("ESTABLISHMENT_DATE <=", value, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateIn(List<Date> values) {
            addCriterion("ESTABLISHMENT_DATE in", values, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateNotIn(List<Date> values) {
            addCriterion("ESTABLISHMENT_DATE not in", values, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateBetween(Date value1, Date value2) {
            addCriterion("ESTABLISHMENT_DATE between", value1, value2, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andEstablishmentDateNotBetween(Date value1, Date value2) {
            addCriterion("ESTABLISHMENT_DATE not between", value1, value2, "establishmentDate");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarIsNull() {
            addCriterion("COMPANY_TYPE_VAR is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarIsNotNull() {
            addCriterion("COMPANY_TYPE_VAR is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarEqualTo(String value) {
            addCriterion("COMPANY_TYPE_VAR =", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarNotEqualTo(String value) {
            addCriterion("COMPANY_TYPE_VAR <>", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarGreaterThan(String value) {
            addCriterion("COMPANY_TYPE_VAR >", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE_VAR >=", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarLessThan(String value) {
            addCriterion("COMPANY_TYPE_VAR <", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE_VAR <=", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarLike(String value) {
            addCriterion("COMPANY_TYPE_VAR like", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarNotLike(String value) {
            addCriterion("COMPANY_TYPE_VAR not like", value, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarIn(List<String> values) {
            addCriterion("COMPANY_TYPE_VAR in", values, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarNotIn(List<String> values) {
            addCriterion("COMPANY_TYPE_VAR not in", values, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE_VAR between", value1, value2, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE_VAR not between", value1, value2, "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlIsNull() {
            addCriterion("ENTP_LOGO_URL is null");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlIsNotNull() {
            addCriterion("ENTP_LOGO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlEqualTo(String value) {
            addCriterion("ENTP_LOGO_URL =", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlNotEqualTo(String value) {
            addCriterion("ENTP_LOGO_URL <>", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlGreaterThan(String value) {
            addCriterion("ENTP_LOGO_URL >", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ENTP_LOGO_URL >=", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlLessThan(String value) {
            addCriterion("ENTP_LOGO_URL <", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("ENTP_LOGO_URL <=", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlLike(String value) {
            addCriterion("ENTP_LOGO_URL like", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlNotLike(String value) {
            addCriterion("ENTP_LOGO_URL not like", value, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlIn(List<String> values) {
            addCriterion("ENTP_LOGO_URL in", values, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlNotIn(List<String> values) {
            addCriterion("ENTP_LOGO_URL not in", values, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlBetween(String value1, String value2) {
            addCriterion("ENTP_LOGO_URL between", value1, value2, "entpLogoUrl");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlNotBetween(String value1, String value2) {
            addCriterion("ENTP_LOGO_URL not between", value1, value2, "entpLogoUrl");
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

        public Criteria andFullnameEngLikeInsensitive(String value) {
            addCriterion("upper(FULLNAME_ENG) like", value.toUpperCase(), "fullnameEng");
            return (Criteria) this;
        }

        public Criteria andFullnameLikeInsensitive(String value) {
            addCriterion("upper(FULLNAME) like", value.toUpperCase(), "fullname");
            return (Criteria) this;
        }

        public Criteria andShortnameLikeInsensitive(String value) {
            addCriterion("upper(SHORTNAME) like", value.toUpperCase(), "shortname");
            return (Criteria) this;
        }

        public Criteria andFullnamePinyinLikeInsensitive(String value) {
            addCriterion("upper(FULLNAME_PINYIN) like", value.toUpperCase(), "fullnamePinyin");
            return (Criteria) this;
        }

        public Criteria andLpNameLikeInsensitive(String value) {
            addCriterion("upper(LP_NAME) like", value.toUpperCase(), "lpName");
            return (Criteria) this;
        }

        public Criteria andLpMbphoneLikeInsensitive(String value) {
            addCriterion("upper(LP_MBPHONE) like", value.toUpperCase(), "lpMbphone");
            return (Criteria) this;
        }

        public Criteria andLpTelLikeInsensitive(String value) {
            addCriterion("upper(LP_TEL) like", value.toUpperCase(), "lpTel");
            return (Criteria) this;
        }

        public Criteria andLpEmalLikeInsensitive(String value) {
            addCriterion("upper(LP_EMAL) like", value.toUpperCase(), "lpEmal");
            return (Criteria) this;
        }

        public Criteria andLpFaxLikeInsensitive(String value) {
            addCriterion("upper(LP_FAX) like", value.toUpperCase(), "lpFax");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLikeInsensitive(String value) {
            addCriterion("upper(IDENTITY_ID) like", value.toUpperCase(), "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityUrlLikeInsensitive(String value) {
            addCriterion("upper(IDENTITY_URL) like", value.toUpperCase(), "identityUrl");
            return (Criteria) this;
        }

        public Criteria andCompRegfundLikeInsensitive(String value) {
            addCriterion("upper(COMP_REGFUND) like", value.toUpperCase(), "compRegfund");
            return (Criteria) this;
        }

        public Criteria andCompOrgnNumLikeInsensitive(String value) {
            addCriterion("upper(COMP_ORGN_NUM) like", value.toUpperCase(), "compOrgnNum");
            return (Criteria) this;
        }

        public Criteria andCompTaxregcertLikeInsensitive(String value) {
            addCriterion("upper(COMP_TAXREGCERT) like", value.toUpperCase(), "compTaxregcert");
            return (Criteria) this;
        }

        public Criteria andCompProvinceLikeInsensitive(String value) {
            addCriterion("upper(COMP_PROVINCE) like", value.toUpperCase(), "compProvince");
            return (Criteria) this;
        }

        public Criteria andCompCityLikeInsensitive(String value) {
            addCriterion("upper(COMP_CITY) like", value.toUpperCase(), "compCity");
            return (Criteria) this;
        }

        public Criteria andCompDistrictLikeInsensitive(String value) {
            addCriterion("upper(COMP_DISTRICT) like", value.toUpperCase(), "compDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrLikeInsensitive(String value) {
            addCriterion("upper(COMP_ADDR) like", value.toUpperCase(), "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrEngLikeInsensitive(String value) {
            addCriterion("upper(COMP_ADDR_ENG) like", value.toUpperCase(), "compAddrEng");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCommLikeInsensitive(String value) {
            addCriterion("upper(COMP_PROVINCE_COMM) like", value.toUpperCase(), "compProvinceComm");
            return (Criteria) this;
        }

        public Criteria andCompCityCommLikeInsensitive(String value) {
            addCriterion("upper(COMP_CITY_COMM) like", value.toUpperCase(), "compCityComm");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCommLikeInsensitive(String value) {
            addCriterion("upper(COMP_DISTRICT_COMM) like", value.toUpperCase(), "compDistrictComm");
            return (Criteria) this;
        }

        public Criteria andCompAddrCommLikeInsensitive(String value) {
            addCriterion("upper(COMP_ADDR_COMM) like", value.toUpperCase(), "compAddrComm");
            return (Criteria) this;
        }

        public Criteria andCompPostcodeLikeInsensitive(String value) {
            addCriterion("upper(COMP_POSTCODE) like", value.toUpperCase(), "compPostcode");
            return (Criteria) this;
        }

        public Criteria andCompTelLikeInsensitive(String value) {
            addCriterion("upper(COMP_TEL) like", value.toUpperCase(), "compTel");
            return (Criteria) this;
        }

        public Criteria andCompFaxLikeInsensitive(String value) {
            addCriterion("upper(COMP_FAX) like", value.toUpperCase(), "compFax");
            return (Criteria) this;
        }

        public Criteria andCompMailLikeInsensitive(String value) {
            addCriterion("upper(COMP_MAIL) like", value.toUpperCase(), "compMail");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLikeInsensitive(String value) {
            addCriterion("upper(BUSINESS_LICENSE_URL) like", value.toUpperCase(), "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andTaxLicenseUrlLikeInsensitive(String value) {
            addCriterion("upper(TAX_LICENSE_URL) like", value.toUpperCase(), "taxLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andOrgCodeUrlLikeInsensitive(String value) {
            addCriterion("upper(ORG_CODE_URL) like", value.toUpperCase(), "orgCodeUrl");
            return (Criteria) this;
        }

        public Criteria andMaininComeLikeInsensitive(String value) {
            addCriterion("upper(MAININ_COME) like", value.toUpperCase(), "maininCome");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeVarLikeInsensitive(String value) {
            addCriterion("upper(COMPANY_TYPE_VAR) like", value.toUpperCase(), "companyTypeVar");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(MEMO) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andEntpLogoUrlLikeInsensitive(String value) {
            addCriterion("upper(ENTP_LOGO_URL) like", value.toUpperCase(), "entpLogoUrl");
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
     * D_UC_ENTERPRISE
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_ENTERPRISE null
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