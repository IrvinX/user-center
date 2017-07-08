package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcBusinessSystemExample {
    /**
     * D_UC_BUSINESS_SYSTEM
     */
    protected String orderByClause;

    /**
     * D_UC_BUSINESS_SYSTEM
     */
    protected boolean distinct;

    /**
     * D_UC_BUSINESS_SYSTEM
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_BUSINESS_SYSTEM
     */
    protected Page page;

    public DUcBusinessSystemExample() {
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
     * D_UC_BUSINESS_SYSTEM null
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

        public Criteria andIconUrlIsNull() {
            addCriterion("ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("ICON_URL =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("ICON_URL <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("ICON_URL >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_URL >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("ICON_URL <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("ICON_URL <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("ICON_URL like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("ICON_URL not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("ICON_URL in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("ICON_URL not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("ICON_URL between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("ICON_URL not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNull() {
            addCriterion("BANNER_URL is null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNotNull() {
            addCriterion("BANNER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlEqualTo(String value) {
            addCriterion("BANNER_URL =", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotEqualTo(String value) {
            addCriterion("BANNER_URL <>", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThan(String value) {
            addCriterion("BANNER_URL >", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BANNER_URL >=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThan(String value) {
            addCriterion("BANNER_URL <", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("BANNER_URL <=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLike(String value) {
            addCriterion("BANNER_URL like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotLike(String value) {
            addCriterion("BANNER_URL not like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIn(List<String> values) {
            addCriterion("BANNER_URL in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotIn(List<String> values) {
            addCriterion("BANNER_URL not in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlBetween(String value1, String value2) {
            addCriterion("BANNER_URL between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotBetween(String value1, String value2) {
            addCriterion("BANNER_URL not between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("THEME is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("THEME is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("THEME =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("THEME <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("THEME >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("THEME >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("THEME <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("THEME <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("THEME like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("THEME not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("THEME in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("THEME not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("THEME between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("THEME not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andBasepathIsNull() {
            addCriterion("BASEPATH is null");
            return (Criteria) this;
        }

        public Criteria andBasepathIsNotNull() {
            addCriterion("BASEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andBasepathEqualTo(String value) {
            addCriterion("BASEPATH =", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotEqualTo(String value) {
            addCriterion("BASEPATH <>", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathGreaterThan(String value) {
            addCriterion("BASEPATH >", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathGreaterThanOrEqualTo(String value) {
            addCriterion("BASEPATH >=", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathLessThan(String value) {
            addCriterion("BASEPATH <", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathLessThanOrEqualTo(String value) {
            addCriterion("BASEPATH <=", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathLike(String value) {
            addCriterion("BASEPATH like", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotLike(String value) {
            addCriterion("BASEPATH not like", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathIn(List<String> values) {
            addCriterion("BASEPATH in", values, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotIn(List<String> values) {
            addCriterion("BASEPATH not in", values, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathBetween(String value1, String value2) {
            addCriterion("BASEPATH between", value1, value2, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotBetween(String value1, String value2) {
            addCriterion("BASEPATH not between", value1, value2, "basepath");
            return (Criteria) this;
        }

        public Criteria andSysStatusIsNull() {
            addCriterion("SYS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSysStatusIsNotNull() {
            addCriterion("SYS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSysStatusEqualTo(Short value) {
            addCriterion("SYS_STATUS =", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotEqualTo(Short value) {
            addCriterion("SYS_STATUS <>", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusGreaterThan(Short value) {
            addCriterion("SYS_STATUS >", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("SYS_STATUS >=", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusLessThan(Short value) {
            addCriterion("SYS_STATUS <", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusLessThanOrEqualTo(Short value) {
            addCriterion("SYS_STATUS <=", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusIn(List<Short> values) {
            addCriterion("SYS_STATUS in", values, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotIn(List<Short> values) {
            addCriterion("SYS_STATUS not in", values, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusBetween(Short value1, Short value2) {
            addCriterion("SYS_STATUS between", value1, value2, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotBetween(Short value1, Short value2) {
            addCriterion("SYS_STATUS not between", value1, value2, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysTypeIsNull() {
            addCriterion("SYS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSysTypeIsNotNull() {
            addCriterion("SYS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSysTypeEqualTo(Short value) {
            addCriterion("SYS_TYPE =", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotEqualTo(Short value) {
            addCriterion("SYS_TYPE <>", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThan(Short value) {
            addCriterion("SYS_TYPE >", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SYS_TYPE >=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThan(Short value) {
            addCriterion("SYS_TYPE <", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThanOrEqualTo(Short value) {
            addCriterion("SYS_TYPE <=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeIn(List<Short> values) {
            addCriterion("SYS_TYPE in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotIn(List<Short> values) {
            addCriterion("SYS_TYPE not in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeBetween(Short value1, Short value2) {
            addCriterion("SYS_TYPE between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotBetween(Short value1, Short value2) {
            addCriterion("SYS_TYPE not between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNull() {
            addCriterion("SYS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNotNull() {
            addCriterion("SYS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysNameEqualTo(String value) {
            addCriterion("SYS_NAME =", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotEqualTo(String value) {
            addCriterion("SYS_NAME <>", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThan(String value) {
            addCriterion("SYS_NAME >", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NAME >=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThan(String value) {
            addCriterion("SYS_NAME <", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_NAME <=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLike(String value) {
            addCriterion("SYS_NAME like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotLike(String value) {
            addCriterion("SYS_NAME not like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameIn(List<String> values) {
            addCriterion("SYS_NAME in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotIn(List<String> values) {
            addCriterion("SYS_NAME not in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameBetween(String value1, String value2) {
            addCriterion("SYS_NAME between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotBetween(String value1, String value2) {
            addCriterion("SYS_NAME not between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysTitleIsNull() {
            addCriterion("SYS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSysTitleIsNotNull() {
            addCriterion("SYS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSysTitleEqualTo(String value) {
            addCriterion("SYS_TITLE =", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleNotEqualTo(String value) {
            addCriterion("SYS_TITLE <>", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleGreaterThan(String value) {
            addCriterion("SYS_TITLE >", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_TITLE >=", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleLessThan(String value) {
            addCriterion("SYS_TITLE <", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleLessThanOrEqualTo(String value) {
            addCriterion("SYS_TITLE <=", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleLike(String value) {
            addCriterion("SYS_TITLE like", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleNotLike(String value) {
            addCriterion("SYS_TITLE not like", value, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleIn(List<String> values) {
            addCriterion("SYS_TITLE in", values, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleNotIn(List<String> values) {
            addCriterion("SYS_TITLE not in", values, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleBetween(String value1, String value2) {
            addCriterion("SYS_TITLE between", value1, value2, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysTitleNotBetween(String value1, String value2) {
            addCriterion("SYS_TITLE not between", value1, value2, "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysDescIsNull() {
            addCriterion("SYS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSysDescIsNotNull() {
            addCriterion("SYS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSysDescEqualTo(String value) {
            addCriterion("SYS_DESC =", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotEqualTo(String value) {
            addCriterion("SYS_DESC <>", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescGreaterThan(String value) {
            addCriterion("SYS_DESC >", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DESC >=", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLessThan(String value) {
            addCriterion("SYS_DESC <", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLessThanOrEqualTo(String value) {
            addCriterion("SYS_DESC <=", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLike(String value) {
            addCriterion("SYS_DESC like", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotLike(String value) {
            addCriterion("SYS_DESC not like", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescIn(List<String> values) {
            addCriterion("SYS_DESC in", values, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotIn(List<String> values) {
            addCriterion("SYS_DESC not in", values, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescBetween(String value1, String value2) {
            addCriterion("SYS_DESC between", value1, value2, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotBetween(String value1, String value2) {
            addCriterion("SYS_DESC not between", value1, value2, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysOrderIsNull() {
            addCriterion("SYS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andSysOrderIsNotNull() {
            addCriterion("SYS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSysOrderEqualTo(Short value) {
            addCriterion("SYS_ORDER =", value, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderNotEqualTo(Short value) {
            addCriterion("SYS_ORDER <>", value, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderGreaterThan(Short value) {
            addCriterion("SYS_ORDER >", value, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("SYS_ORDER >=", value, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderLessThan(Short value) {
            addCriterion("SYS_ORDER <", value, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderLessThanOrEqualTo(Short value) {
            addCriterion("SYS_ORDER <=", value, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderIn(List<Short> values) {
            addCriterion("SYS_ORDER in", values, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderNotIn(List<Short> values) {
            addCriterion("SYS_ORDER not in", values, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderBetween(Short value1, Short value2) {
            addCriterion("SYS_ORDER between", value1, value2, "sysOrder");
            return (Criteria) this;
        }

        public Criteria andSysOrderNotBetween(Short value1, Short value2) {
            addCriterion("SYS_ORDER not between", value1, value2, "sysOrder");
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

        public Criteria andIconUrlLikeInsensitive(String value) {
            addCriterion("upper(ICON_URL) like", value.toUpperCase(), "iconUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLikeInsensitive(String value) {
            addCriterion("upper(BANNER_URL) like", value.toUpperCase(), "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andThemeLikeInsensitive(String value) {
            addCriterion("upper(THEME) like", value.toUpperCase(), "theme");
            return (Criteria) this;
        }

        public Criteria andBasepathLikeInsensitive(String value) {
            addCriterion("upper(BASEPATH) like", value.toUpperCase(), "basepath");
            return (Criteria) this;
        }

        public Criteria andSysNameLikeInsensitive(String value) {
            addCriterion("upper(SYS_NAME) like", value.toUpperCase(), "sysName");
            return (Criteria) this;
        }

        public Criteria andSysTitleLikeInsensitive(String value) {
            addCriterion("upper(SYS_TITLE) like", value.toUpperCase(), "sysTitle");
            return (Criteria) this;
        }

        public Criteria andSysDescLikeInsensitive(String value) {
            addCriterion("upper(SYS_DESC) like", value.toUpperCase(), "sysDesc");
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
     * D_UC_BUSINESS_SYSTEM
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_BUSINESS_SYSTEM null
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