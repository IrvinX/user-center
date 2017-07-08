package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcDealerExample {
    /**
     * D_UC_DEALER
     */
    protected String orderByClause;

    /**
     * D_UC_DEALER
     */
    protected boolean distinct;

    /**
     * D_UC_DEALER
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_DEALER
     */
    protected Page page;

    public DUcDealerExample() {
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
     * D_UC_DEALER null
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

        public Criteria andVatInvoicePrIsNull() {
            addCriterion("VAT_INVOICE_PR is null");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrIsNotNull() {
            addCriterion("VAT_INVOICE_PR is not null");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrEqualTo(String value) {
            addCriterion("VAT_INVOICE_PR =", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrNotEqualTo(String value) {
            addCriterion("VAT_INVOICE_PR <>", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrGreaterThan(String value) {
            addCriterion("VAT_INVOICE_PR >", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrGreaterThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_PR >=", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrLessThan(String value) {
            addCriterion("VAT_INVOICE_PR <", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrLessThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_PR <=", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrLike(String value) {
            addCriterion("VAT_INVOICE_PR like", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrNotLike(String value) {
            addCriterion("VAT_INVOICE_PR not like", value, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrIn(List<String> values) {
            addCriterion("VAT_INVOICE_PR in", values, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrNotIn(List<String> values) {
            addCriterion("VAT_INVOICE_PR not in", values, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_PR between", value1, value2, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrNotBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_PR not between", value1, value2, "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityIsNull() {
            addCriterion("VAT_INVOICE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityIsNotNull() {
            addCriterion("VAT_INVOICE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityEqualTo(String value) {
            addCriterion("VAT_INVOICE_CITY =", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityNotEqualTo(String value) {
            addCriterion("VAT_INVOICE_CITY <>", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityGreaterThan(String value) {
            addCriterion("VAT_INVOICE_CITY >", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityGreaterThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_CITY >=", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityLessThan(String value) {
            addCriterion("VAT_INVOICE_CITY <", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityLessThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_CITY <=", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityLike(String value) {
            addCriterion("VAT_INVOICE_CITY like", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityNotLike(String value) {
            addCriterion("VAT_INVOICE_CITY not like", value, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityIn(List<String> values) {
            addCriterion("VAT_INVOICE_CITY in", values, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityNotIn(List<String> values) {
            addCriterion("VAT_INVOICE_CITY not in", values, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_CITY between", value1, value2, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityNotBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_CITY not between", value1, value2, "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistIsNull() {
            addCriterion("VAT_INVOICE_DIST is null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistIsNotNull() {
            addCriterion("VAT_INVOICE_DIST is not null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistEqualTo(String value) {
            addCriterion("VAT_INVOICE_DIST =", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistNotEqualTo(String value) {
            addCriterion("VAT_INVOICE_DIST <>", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistGreaterThan(String value) {
            addCriterion("VAT_INVOICE_DIST >", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistGreaterThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_DIST >=", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistLessThan(String value) {
            addCriterion("VAT_INVOICE_DIST <", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistLessThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_DIST <=", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistLike(String value) {
            addCriterion("VAT_INVOICE_DIST like", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistNotLike(String value) {
            addCriterion("VAT_INVOICE_DIST not like", value, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistIn(List<String> values) {
            addCriterion("VAT_INVOICE_DIST in", values, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistNotIn(List<String> values) {
            addCriterion("VAT_INVOICE_DIST not in", values, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_DIST between", value1, value2, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistNotBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_DIST not between", value1, value2, "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrIsNull() {
            addCriterion("VAT_INVOICE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrIsNotNull() {
            addCriterion("VAT_INVOICE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrEqualTo(String value) {
            addCriterion("VAT_INVOICE_ADDR =", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrNotEqualTo(String value) {
            addCriterion("VAT_INVOICE_ADDR <>", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrGreaterThan(String value) {
            addCriterion("VAT_INVOICE_ADDR >", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_ADDR >=", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrLessThan(String value) {
            addCriterion("VAT_INVOICE_ADDR <", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrLessThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_ADDR <=", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrLike(String value) {
            addCriterion("VAT_INVOICE_ADDR like", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrNotLike(String value) {
            addCriterion("VAT_INVOICE_ADDR not like", value, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrIn(List<String> values) {
            addCriterion("VAT_INVOICE_ADDR in", values, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrNotIn(List<String> values) {
            addCriterion("VAT_INVOICE_ADDR not in", values, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_ADDR between", value1, value2, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrNotBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_ADDR not between", value1, value2, "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelIsNull() {
            addCriterion("VAT_INVOICE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelIsNotNull() {
            addCriterion("VAT_INVOICE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelEqualTo(String value) {
            addCriterion("VAT_INVOICE_TEL =", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelNotEqualTo(String value) {
            addCriterion("VAT_INVOICE_TEL <>", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelGreaterThan(String value) {
            addCriterion("VAT_INVOICE_TEL >", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_TEL >=", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelLessThan(String value) {
            addCriterion("VAT_INVOICE_TEL <", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelLessThanOrEqualTo(String value) {
            addCriterion("VAT_INVOICE_TEL <=", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelLike(String value) {
            addCriterion("VAT_INVOICE_TEL like", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelNotLike(String value) {
            addCriterion("VAT_INVOICE_TEL not like", value, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelIn(List<String> values) {
            addCriterion("VAT_INVOICE_TEL in", values, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelNotIn(List<String> values) {
            addCriterion("VAT_INVOICE_TEL not in", values, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_TEL between", value1, value2, "vatInvoiceTel");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelNotBetween(String value1, String value2) {
            addCriterion("VAT_INVOICE_TEL not between", value1, value2, "vatInvoiceTel");
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

        public Criteria andFirmStatusIsNull() {
            addCriterion("FIRM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFirmStatusIsNotNull() {
            addCriterion("FIRM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFirmStatusEqualTo(Short value) {
            addCriterion("FIRM_STATUS =", value, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusNotEqualTo(Short value) {
            addCriterion("FIRM_STATUS <>", value, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusGreaterThan(Short value) {
            addCriterion("FIRM_STATUS >", value, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("FIRM_STATUS >=", value, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusLessThan(Short value) {
            addCriterion("FIRM_STATUS <", value, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusLessThanOrEqualTo(Short value) {
            addCriterion("FIRM_STATUS <=", value, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusIn(List<Short> values) {
            addCriterion("FIRM_STATUS in", values, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusNotIn(List<Short> values) {
            addCriterion("FIRM_STATUS not in", values, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusBetween(Short value1, Short value2) {
            addCriterion("FIRM_STATUS between", value1, value2, "firmStatus");
            return (Criteria) this;
        }

        public Criteria andFirmStatusNotBetween(Short value1, Short value2) {
            addCriterion("FIRM_STATUS not between", value1, value2, "firmStatus");
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

        public Criteria andYearProcessingIsNull() {
            addCriterion("YEAR_PROCESSING is null");
            return (Criteria) this;
        }

        public Criteria andYearProcessingIsNotNull() {
            addCriterion("YEAR_PROCESSING is not null");
            return (Criteria) this;
        }

        public Criteria andYearProcessingEqualTo(Long value) {
            addCriterion("YEAR_PROCESSING =", value, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingNotEqualTo(Long value) {
            addCriterion("YEAR_PROCESSING <>", value, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingGreaterThan(Long value) {
            addCriterion("YEAR_PROCESSING >", value, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingGreaterThanOrEqualTo(Long value) {
            addCriterion("YEAR_PROCESSING >=", value, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingLessThan(Long value) {
            addCriterion("YEAR_PROCESSING <", value, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingLessThanOrEqualTo(Long value) {
            addCriterion("YEAR_PROCESSING <=", value, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingIn(List<Long> values) {
            addCriterion("YEAR_PROCESSING in", values, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingNotIn(List<Long> values) {
            addCriterion("YEAR_PROCESSING not in", values, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingBetween(Long value1, Long value2) {
            addCriterion("YEAR_PROCESSING between", value1, value2, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearProcessingNotBetween(Long value1, Long value2) {
            addCriterion("YEAR_PROCESSING not between", value1, value2, "yearProcessing");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyIsNull() {
            addCriterion("YEAR_EXPEND_QTY is null");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyIsNotNull() {
            addCriterion("YEAR_EXPEND_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyEqualTo(Long value) {
            addCriterion("YEAR_EXPEND_QTY =", value, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyNotEqualTo(Long value) {
            addCriterion("YEAR_EXPEND_QTY <>", value, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyGreaterThan(Long value) {
            addCriterion("YEAR_EXPEND_QTY >", value, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyGreaterThanOrEqualTo(Long value) {
            addCriterion("YEAR_EXPEND_QTY >=", value, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyLessThan(Long value) {
            addCriterion("YEAR_EXPEND_QTY <", value, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyLessThanOrEqualTo(Long value) {
            addCriterion("YEAR_EXPEND_QTY <=", value, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyIn(List<Long> values) {
            addCriterion("YEAR_EXPEND_QTY in", values, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyNotIn(List<Long> values) {
            addCriterion("YEAR_EXPEND_QTY not in", values, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyBetween(Long value1, Long value2) {
            addCriterion("YEAR_EXPEND_QTY between", value1, value2, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andYearExpendQtyNotBetween(Long value1, Long value2) {
            addCriterion("YEAR_EXPEND_QTY not between", value1, value2, "yearExpendQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyIsNull() {
            addCriterion("HASP_QTY is null");
            return (Criteria) this;
        }

        public Criteria andHaspQtyIsNotNull() {
            addCriterion("HASP_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andHaspQtyEqualTo(Long value) {
            addCriterion("HASP_QTY =", value, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyNotEqualTo(Long value) {
            addCriterion("HASP_QTY <>", value, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyGreaterThan(Long value) {
            addCriterion("HASP_QTY >", value, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyGreaterThanOrEqualTo(Long value) {
            addCriterion("HASP_QTY >=", value, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyLessThan(Long value) {
            addCriterion("HASP_QTY <", value, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyLessThanOrEqualTo(Long value) {
            addCriterion("HASP_QTY <=", value, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyIn(List<Long> values) {
            addCriterion("HASP_QTY in", values, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyNotIn(List<Long> values) {
            addCriterion("HASP_QTY not in", values, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyBetween(Long value1, Long value2) {
            addCriterion("HASP_QTY between", value1, value2, "haspQty");
            return (Criteria) this;
        }

        public Criteria andHaspQtyNotBetween(Long value1, Long value2) {
            addCriterion("HASP_QTY not between", value1, value2, "haspQty");
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

        public Criteria andFirmCodeLikeInsensitive(String value) {
            addCriterion("upper(FIRM_CODE) like", value.toUpperCase(), "firmCode");
            return (Criteria) this;
        }

        public Criteria andVatInvoicePrLikeInsensitive(String value) {
            addCriterion("upper(VAT_INVOICE_PR) like", value.toUpperCase(), "vatInvoicePr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceCityLikeInsensitive(String value) {
            addCriterion("upper(VAT_INVOICE_CITY) like", value.toUpperCase(), "vatInvoiceCity");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceDistLikeInsensitive(String value) {
            addCriterion("upper(VAT_INVOICE_DIST) like", value.toUpperCase(), "vatInvoiceDist");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceAddrLikeInsensitive(String value) {
            addCriterion("upper(VAT_INVOICE_ADDR) like", value.toUpperCase(), "vatInvoiceAddr");
            return (Criteria) this;
        }

        public Criteria andVatInvoiceTelLikeInsensitive(String value) {
            addCriterion("upper(VAT_INVOICE_TEL) like", value.toUpperCase(), "vatInvoiceTel");
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
     * D_UC_DEALER
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_DEALER null
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