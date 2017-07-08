package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcUserExample {
    /**
     * D_UC_USER
     */
    protected String orderByClause;

    /**
     * D_UC_USER
     */
    protected boolean distinct;

    /**
     * D_UC_USER
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_USER
     */
    protected Page page;

    public DUcUserExample() {
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
     * D_UC_USER null
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

        public Criteria andPersonIdIsNull() {
            addCriterion("PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("PERSON_ID =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("PERSON_ID <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("PERSON_ID >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_ID >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("PERSON_ID <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("PERSON_ID <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("PERSON_ID like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("PERSON_ID not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("PERSON_ID in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("PERSON_ID not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("PERSON_ID between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("PERSON_ID not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("SALT is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("SALT is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("SALT =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("SALT <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("SALT >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("SALT >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("SALT <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("SALT <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("SALT like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("SALT not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("SALT in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("SALT not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("SALT between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("SALT not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andUserNmIsNull() {
            addCriterion("USER_NM is null");
            return (Criteria) this;
        }

        public Criteria andUserNmIsNotNull() {
            addCriterion("USER_NM is not null");
            return (Criteria) this;
        }

        public Criteria andUserNmEqualTo(String value) {
            addCriterion("USER_NM =", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotEqualTo(String value) {
            addCriterion("USER_NM <>", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmGreaterThan(String value) {
            addCriterion("USER_NM >", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NM >=", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLessThan(String value) {
            addCriterion("USER_NM <", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLessThanOrEqualTo(String value) {
            addCriterion("USER_NM <=", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLike(String value) {
            addCriterion("USER_NM like", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotLike(String value) {
            addCriterion("USER_NM not like", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmIn(List<String> values) {
            addCriterion("USER_NM in", values, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotIn(List<String> values) {
            addCriterion("USER_NM not in", values, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmBetween(String value1, String value2) {
            addCriterion("USER_NM between", value1, value2, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotBetween(String value1, String value2) {
            addCriterion("USER_NM not between", value1, value2, "userNm");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdIsNull() {
            addCriterion("FORCE_CHANGE_PWD is null");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdIsNotNull() {
            addCriterion("FORCE_CHANGE_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdEqualTo(Short value) {
            addCriterion("FORCE_CHANGE_PWD =", value, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdNotEqualTo(Short value) {
            addCriterion("FORCE_CHANGE_PWD <>", value, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdGreaterThan(Short value) {
            addCriterion("FORCE_CHANGE_PWD >", value, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdGreaterThanOrEqualTo(Short value) {
            addCriterion("FORCE_CHANGE_PWD >=", value, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdLessThan(Short value) {
            addCriterion("FORCE_CHANGE_PWD <", value, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdLessThanOrEqualTo(Short value) {
            addCriterion("FORCE_CHANGE_PWD <=", value, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdIn(List<Short> values) {
            addCriterion("FORCE_CHANGE_PWD in", values, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdNotIn(List<Short> values) {
            addCriterion("FORCE_CHANGE_PWD not in", values, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdBetween(Short value1, Short value2) {
            addCriterion("FORCE_CHANGE_PWD between", value1, value2, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andForceChangePwdNotBetween(Short value1, Short value2) {
            addCriterion("FORCE_CHANGE_PWD not between", value1, value2, "forceChangePwd");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminIsNull() {
            addCriterion("ENTP_SUPER_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminIsNotNull() {
            addCriterion("ENTP_SUPER_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminEqualTo(Short value) {
            addCriterion("ENTP_SUPER_ADMIN =", value, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminNotEqualTo(Short value) {
            addCriterion("ENTP_SUPER_ADMIN <>", value, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminGreaterThan(Short value) {
            addCriterion("ENTP_SUPER_ADMIN >", value, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminGreaterThanOrEqualTo(Short value) {
            addCriterion("ENTP_SUPER_ADMIN >=", value, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminLessThan(Short value) {
            addCriterion("ENTP_SUPER_ADMIN <", value, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminLessThanOrEqualTo(Short value) {
            addCriterion("ENTP_SUPER_ADMIN <=", value, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminIn(List<Short> values) {
            addCriterion("ENTP_SUPER_ADMIN in", values, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminNotIn(List<Short> values) {
            addCriterion("ENTP_SUPER_ADMIN not in", values, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminBetween(Short value1, Short value2) {
            addCriterion("ENTP_SUPER_ADMIN between", value1, value2, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andEntpSuperAdminNotBetween(Short value1, Short value2) {
            addCriterion("ENTP_SUPER_ADMIN not between", value1, value2, "entpSuperAdmin");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Short value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Short value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Short value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Short value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Short value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Short> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Short> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Short value1, Short value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Short value1, Short value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Short value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Short value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Short value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Short value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Short> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Short> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Short value1, Short value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andEnableKeyIsNull() {
            addCriterion("ENABLE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andEnableKeyIsNotNull() {
            addCriterion("ENABLE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andEnableKeyEqualTo(Short value) {
            addCriterion("ENABLE_KEY =", value, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyNotEqualTo(Short value) {
            addCriterion("ENABLE_KEY <>", value, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyGreaterThan(Short value) {
            addCriterion("ENABLE_KEY >", value, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyGreaterThanOrEqualTo(Short value) {
            addCriterion("ENABLE_KEY >=", value, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyLessThan(Short value) {
            addCriterion("ENABLE_KEY <", value, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyLessThanOrEqualTo(Short value) {
            addCriterion("ENABLE_KEY <=", value, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyIn(List<Short> values) {
            addCriterion("ENABLE_KEY in", values, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyNotIn(List<Short> values) {
            addCriterion("ENABLE_KEY not in", values, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyBetween(Short value1, Short value2) {
            addCriterion("ENABLE_KEY between", value1, value2, "enableKey");
            return (Criteria) this;
        }

        public Criteria andEnableKeyNotBetween(Short value1, Short value2) {
            addCriterion("ENABLE_KEY not between", value1, value2, "enableKey");
            return (Criteria) this;
        }

        public Criteria andKeycodeIsNull() {
            addCriterion("KEYCODE is null");
            return (Criteria) this;
        }

        public Criteria andKeycodeIsNotNull() {
            addCriterion("KEYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andKeycodeEqualTo(String value) {
            addCriterion("KEYCODE =", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotEqualTo(String value) {
            addCriterion("KEYCODE <>", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeGreaterThan(String value) {
            addCriterion("KEYCODE >", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeGreaterThanOrEqualTo(String value) {
            addCriterion("KEYCODE >=", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLessThan(String value) {
            addCriterion("KEYCODE <", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLessThanOrEqualTo(String value) {
            addCriterion("KEYCODE <=", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLike(String value) {
            addCriterion("KEYCODE like", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotLike(String value) {
            addCriterion("KEYCODE not like", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeIn(List<String> values) {
            addCriterion("KEYCODE in", values, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotIn(List<String> values) {
            addCriterion("KEYCODE not in", values, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeBetween(String value1, String value2) {
            addCriterion("KEYCODE between", value1, value2, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotBetween(String value1, String value2) {
            addCriterion("KEYCODE not between", value1, value2, "keycode");
            return (Criteria) this;
        }

        public Criteria andUserOriginIsNull() {
            addCriterion("USER_ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andUserOriginIsNotNull() {
            addCriterion("USER_ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserOriginEqualTo(Short value) {
            addCriterion("USER_ORIGIN =", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginNotEqualTo(Short value) {
            addCriterion("USER_ORIGIN <>", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginGreaterThan(Short value) {
            addCriterion("USER_ORIGIN >", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_ORIGIN >=", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginLessThan(Short value) {
            addCriterion("USER_ORIGIN <", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginLessThanOrEqualTo(Short value) {
            addCriterion("USER_ORIGIN <=", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginIn(List<Short> values) {
            addCriterion("USER_ORIGIN in", values, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginNotIn(List<Short> values) {
            addCriterion("USER_ORIGIN not in", values, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginBetween(Short value1, Short value2) {
            addCriterion("USER_ORIGIN between", value1, value2, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginNotBetween(Short value1, Short value2) {
            addCriterion("USER_ORIGIN not between", value1, value2, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoIsNull() {
            addCriterion("PERFECT_USER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoIsNotNull() {
            addCriterion("PERFECT_USER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoEqualTo(Short value) {
            addCriterion("PERFECT_USER_INFO =", value, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoNotEqualTo(Short value) {
            addCriterion("PERFECT_USER_INFO <>", value, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoGreaterThan(Short value) {
            addCriterion("PERFECT_USER_INFO >", value, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoGreaterThanOrEqualTo(Short value) {
            addCriterion("PERFECT_USER_INFO >=", value, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoLessThan(Short value) {
            addCriterion("PERFECT_USER_INFO <", value, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoLessThanOrEqualTo(Short value) {
            addCriterion("PERFECT_USER_INFO <=", value, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoIn(List<Short> values) {
            addCriterion("PERFECT_USER_INFO in", values, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoNotIn(List<Short> values) {
            addCriterion("PERFECT_USER_INFO not in", values, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoBetween(Short value1, Short value2) {
            addCriterion("PERFECT_USER_INFO between", value1, value2, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andPerfectUserInfoNotBetween(Short value1, Short value2) {
            addCriterion("PERFECT_USER_INFO not between", value1, value2, "perfectUserInfo");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdIsNull() {
            addCriterion("NEW_OLD_PWD is null");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdIsNotNull() {
            addCriterion("NEW_OLD_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdEqualTo(Short value) {
            addCriterion("NEW_OLD_PWD =", value, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdNotEqualTo(Short value) {
            addCriterion("NEW_OLD_PWD <>", value, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdGreaterThan(Short value) {
            addCriterion("NEW_OLD_PWD >", value, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdGreaterThanOrEqualTo(Short value) {
            addCriterion("NEW_OLD_PWD >=", value, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdLessThan(Short value) {
            addCriterion("NEW_OLD_PWD <", value, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdLessThanOrEqualTo(Short value) {
            addCriterion("NEW_OLD_PWD <=", value, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdIn(List<Short> values) {
            addCriterion("NEW_OLD_PWD in", values, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdNotIn(List<Short> values) {
            addCriterion("NEW_OLD_PWD not in", values, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdBetween(Short value1, Short value2) {
            addCriterion("NEW_OLD_PWD between", value1, value2, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andNewOldPwdNotBetween(Short value1, Short value2) {
            addCriterion("NEW_OLD_PWD not between", value1, value2, "newOldPwd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttIsNull() {
            addCriterion("EXPIRY_DATE_STT is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttIsNotNull() {
            addCriterion("EXPIRY_DATE_STT is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_STT =", value, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttNotEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_STT <>", value, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttGreaterThan(Date value) {
            addCriterion("EXPIRY_DATE_STT >", value, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_STT >=", value, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttLessThan(Date value) {
            addCriterion("EXPIRY_DATE_STT <", value, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_STT <=", value, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttIn(List<Date> values) {
            addCriterion("EXPIRY_DATE_STT in", values, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttNotIn(List<Date> values) {
            addCriterion("EXPIRY_DATE_STT not in", values, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttBetween(Date value1, Date value2) {
            addCriterion("EXPIRY_DATE_STT between", value1, value2, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateSttNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRY_DATE_STT not between", value1, value2, "expiryDateStt");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndIsNull() {
            addCriterion("EXPIRY_DATE_END is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndIsNotNull() {
            addCriterion("EXPIRY_DATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_END =", value, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndNotEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_END <>", value, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndGreaterThan(Date value) {
            addCriterion("EXPIRY_DATE_END >", value, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_END >=", value, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndLessThan(Date value) {
            addCriterion("EXPIRY_DATE_END <", value, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRY_DATE_END <=", value, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndIn(List<Date> values) {
            addCriterion("EXPIRY_DATE_END in", values, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndNotIn(List<Date> values) {
            addCriterion("EXPIRY_DATE_END not in", values, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndBetween(Date value1, Date value2) {
            addCriterion("EXPIRY_DATE_END between", value1, value2, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEndNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRY_DATE_END not between", value1, value2, "expiryDateEnd");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionIsNull() {
            addCriterion("ACCOUNT_QUESTION is null");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionIsNotNull() {
            addCriterion("ACCOUNT_QUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionEqualTo(String value) {
            addCriterion("ACCOUNT_QUESTION =", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionNotEqualTo(String value) {
            addCriterion("ACCOUNT_QUESTION <>", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionGreaterThan(String value) {
            addCriterion("ACCOUNT_QUESTION >", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_QUESTION >=", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionLessThan(String value) {
            addCriterion("ACCOUNT_QUESTION <", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_QUESTION <=", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionLike(String value) {
            addCriterion("ACCOUNT_QUESTION like", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionNotLike(String value) {
            addCriterion("ACCOUNT_QUESTION not like", value, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionIn(List<String> values) {
            addCriterion("ACCOUNT_QUESTION in", values, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionNotIn(List<String> values) {
            addCriterion("ACCOUNT_QUESTION not in", values, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionBetween(String value1, String value2) {
            addCriterion("ACCOUNT_QUESTION between", value1, value2, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_QUESTION not between", value1, value2, "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIsNull() {
            addCriterion("QUESTION_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIsNotNull() {
            addCriterion("QUESTION_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerEqualTo(String value) {
            addCriterion("QUESTION_ANSWER =", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotEqualTo(String value) {
            addCriterion("QUESTION_ANSWER <>", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerGreaterThan(String value) {
            addCriterion("QUESTION_ANSWER >", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_ANSWER >=", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLessThan(String value) {
            addCriterion("QUESTION_ANSWER <", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_ANSWER <=", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLike(String value) {
            addCriterion("QUESTION_ANSWER like", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotLike(String value) {
            addCriterion("QUESTION_ANSWER not like", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIn(List<String> values) {
            addCriterion("QUESTION_ANSWER in", values, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotIn(List<String> values) {
            addCriterion("QUESTION_ANSWER not in", values, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerBetween(String value1, String value2) {
            addCriterion("QUESTION_ANSWER between", value1, value2, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotBetween(String value1, String value2) {
            addCriterion("QUESTION_ANSWER not between", value1, value2, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CREATEUSERID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CREATEUSERID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CREATEUSERID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CREATEUSERID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CREATEUSERID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CREATEUSERID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CREATEUSERID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CREATEUSERID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CREATEUSERID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("UPDATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("UPDATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(String value) {
            addCriterion("UPDATEUSERID =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(String value) {
            addCriterion("UPDATEUSERID <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(String value) {
            addCriterion("UPDATEUSERID >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(String value) {
            addCriterion("UPDATEUSERID <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLike(String value) {
            addCriterion("UPDATEUSERID like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotLike(String value) {
            addCriterion("UPDATEUSERID not like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<String> values) {
            addCriterion("UPDATEUSERID in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<String> values) {
            addCriterion("UPDATEUSERID not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andPersonIdLikeInsensitive(String value) {
            addCriterion("upper(PERSON_ID) like", value.toUpperCase(), "personId");
            return (Criteria) this;
        }

        public Criteria andSaltLikeInsensitive(String value) {
            addCriterion("upper(SALT) like", value.toUpperCase(), "salt");
            return (Criteria) this;
        }

        public Criteria andUserNmLikeInsensitive(String value) {
            addCriterion("upper(USER_NM) like", value.toUpperCase(), "userNm");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(PASSWORD) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andKeycodeLikeInsensitive(String value) {
            addCriterion("upper(KEYCODE) like", value.toUpperCase(), "keycode");
            return (Criteria) this;
        }

        public Criteria andAccountQuestionLikeInsensitive(String value) {
            addCriterion("upper(ACCOUNT_QUESTION) like", value.toUpperCase(), "accountQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLikeInsensitive(String value) {
            addCriterion("upper(QUESTION_ANSWER) like", value.toUpperCase(), "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLikeInsensitive(String value) {
            addCriterion("upper(CREATEUSERID) like", value.toUpperCase(), "createuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLikeInsensitive(String value) {
            addCriterion("upper(UPDATEUSERID) like", value.toUpperCase(), "updateuserid");
            return (Criteria) this;
        }
    }

    /**
     * D_UC_USER
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_USER null
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