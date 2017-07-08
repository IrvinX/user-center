package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcTextileEntpExample {
    /**
     * D_UC_TEXTILE_ENTP
     */
    protected String orderByClause;

    /**
     * D_UC_TEXTILE_ENTP
     */
    protected boolean distinct;

    /**
     * D_UC_TEXTILE_ENTP
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_TEXTILE_ENTP
     */
    protected Page page;

    public DUcTextileEntpExample() {
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
     * D_UC_TEXTILE_ENTP null
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

        public Criteria andArmyLocalTypeIsNull() {
            addCriterion("ARMY_LOCAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeIsNotNull() {
            addCriterion("ARMY_LOCAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeEqualTo(Short value) {
            addCriterion("ARMY_LOCAL_TYPE =", value, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeNotEqualTo(Short value) {
            addCriterion("ARMY_LOCAL_TYPE <>", value, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeGreaterThan(Short value) {
            addCriterion("ARMY_LOCAL_TYPE >", value, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ARMY_LOCAL_TYPE >=", value, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeLessThan(Short value) {
            addCriterion("ARMY_LOCAL_TYPE <", value, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeLessThanOrEqualTo(Short value) {
            addCriterion("ARMY_LOCAL_TYPE <=", value, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeIn(List<Short> values) {
            addCriterion("ARMY_LOCAL_TYPE in", values, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeNotIn(List<Short> values) {
            addCriterion("ARMY_LOCAL_TYPE not in", values, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeBetween(Short value1, Short value2) {
            addCriterion("ARMY_LOCAL_TYPE between", value1, value2, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andArmyLocalTypeNotBetween(Short value1, Short value2) {
            addCriterion("ARMY_LOCAL_TYPE not between", value1, value2, "armyLocalType");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumIsNull() {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumIsNotNull() {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumEqualTo(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM =", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumNotEqualTo(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM <>", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumGreaterThan(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM >", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM >=", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumLessThan(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM <", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumLessThanOrEqualTo(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM <=", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumLike(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM like", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumNotLike(String value) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM not like", value, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumIn(List<String> values) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM in", values, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumNotIn(List<String> values) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM not in", values, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumBetween(String value1, String value2) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM between", value1, value2, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSupplyPowerContractNumNotBetween(String value1, String value2) {
            addCriterion("SUPPLY_POWER_CONTRACT_NUM not between", value1, value2, "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("SIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("SIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("SIGN_TIME =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("SIGN_TIME <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("SIGN_TIME >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGN_TIME >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("SIGN_TIME <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("SIGN_TIME <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("SIGN_TIME in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("SIGN_TIME not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("SIGN_TIME between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("SIGN_TIME not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("REGIST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("REGIST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Date value) {
            addCriterion("REGIST_TIME =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Date value) {
            addCriterion("REGIST_TIME <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Date value) {
            addCriterion("REGIST_TIME >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGIST_TIME >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Date value) {
            addCriterion("REGIST_TIME <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("REGIST_TIME <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Date> values) {
            addCriterion("REGIST_TIME in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Date> values) {
            addCriterion("REGIST_TIME not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Date value1, Date value2) {
            addCriterion("REGIST_TIME between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("REGIST_TIME not between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeIsNull() {
            addCriterion("OPERATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeIsNotNull() {
            addCriterion("OPERATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeEqualTo(Date value) {
            addCriterion("OPERATED_TIME =", value, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeNotEqualTo(Date value) {
            addCriterion("OPERATED_TIME <>", value, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeGreaterThan(Date value) {
            addCriterion("OPERATED_TIME >", value, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATED_TIME >=", value, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeLessThan(Date value) {
            addCriterion("OPERATED_TIME <", value, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATED_TIME <=", value, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeIn(List<Date> values) {
            addCriterion("OPERATED_TIME in", values, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeNotIn(List<Date> values) {
            addCriterion("OPERATED_TIME not in", values, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATED_TIME between", value1, value2, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andOperatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATED_TIME not between", value1, value2, "operatedTime");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsIsNull() {
            addCriterion("INDUSTRY_CATEGORY_FS is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsIsNotNull() {
            addCriterion("INDUSTRY_CATEGORY_FS is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS =", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsNotEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS <>", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsGreaterThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS >", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS >=", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsLessThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS <", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS <=", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS like", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsNotLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_FS not like", value, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_FS in", values, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsNotIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_FS not in", values, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_FS between", value1, value2, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_FS not between", value1, value2, "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbIsNull() {
            addCriterion("INDUSTRY_CATEGORY_ZB is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbIsNotNull() {
            addCriterion("INDUSTRY_CATEGORY_ZB is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB =", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbNotEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB <>", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbGreaterThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB >", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB >=", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbLessThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB <", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB <=", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB like", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbNotLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_ZB not like", value, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_ZB in", values, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbNotIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_ZB not in", values, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_ZB between", value1, value2, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_ZB not between", value1, value2, "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxIsNull() {
            addCriterion("INDUSTRY_CATEGORY_HX is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxIsNotNull() {
            addCriterion("INDUSTRY_CATEGORY_HX is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX =", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxNotEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX <>", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxGreaterThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX >", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX >=", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxLessThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX <", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX <=", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX like", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxNotLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_HX not like", value, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_HX in", values, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxNotIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_HX not in", values, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_HX between", value1, value2, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_HX not between", value1, value2, "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpIsNull() {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpIsNotNull() {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP =", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpNotEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP <>", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpGreaterThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP >", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP >=", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpLessThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP <", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP <=", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP like", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpNotLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP not like", value, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP in", values, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpNotIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP not in", values, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP between", value1, value2, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_CYYFZP not between", value1, value2, "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfIsNull() {
            addCriterion("INDUSTRY_CATEGORY_FZJJF is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfIsNotNull() {
            addCriterion("INDUSTRY_CATEGORY_FZJJF is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF =", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfNotEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF <>", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfGreaterThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF >", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF >=", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfLessThan(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF <", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF <=", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF like", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfNotLike(String value) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF not like", value, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF in", values, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfNotIn(List<String> values) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF not in", values, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF between", value1, value2, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CATEGORY_FZJJF not between", value1, value2, "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsIsNull() {
            addCriterion("MANAGEME_CATEGORY_FS is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_FS is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FS =", value, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FS <>", value, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_FS >", value, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FS >=", value, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_FS <", value, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FS <=", value, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_FS in", values, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_FS not in", values, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_FS between", value1, value2, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFsNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_FS not between", value1, value2, "managemeCategoryFs");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbIsNull() {
            addCriterion("MANAGEME_CATEGORY_ZB is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_ZB is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZB =", value, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZB <>", value, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZB >", value, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZB >=", value, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZB <", value, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZB <=", value, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_ZB in", values, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_ZB not in", values, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_ZB between", value1, value2, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZbNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_ZB not between", value1, value2, "managemeCategoryZb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxIsNull() {
            addCriterion("MANAGEME_CATEGORY_HX is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_HX is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_HX =", value, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_HX <>", value, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_HX >", value, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_HX >=", value, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_HX <", value, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_HX <=", value, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_HX in", values, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_HX not in", values, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_HX between", value1, value2, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryHxNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_HX not between", value1, value2, "managemeCategoryHx");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpIsNull() {
            addCriterion("MANAGEME_CATEGORY_NJP is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_NJP is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_NJP =", value, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_NJP <>", value, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_NJP >", value, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_NJP >=", value, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_NJP <", value, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_NJP <=", value, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_NJP in", values, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_NJP not in", values, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_NJP between", value1, value2, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryNjpNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_NJP not between", value1, value2, "managemeCategoryNjp");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbIsNull() {
            addCriterion("MANAGEME_CATEGORY_WFB is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_WFB is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_WFB =", value, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_WFB <>", value, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_WFB >", value, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_WFB >=", value, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_WFB <", value, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_WFB <=", value, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_WFB in", values, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_WFB not in", values, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_WFB between", value1, value2, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryWfbNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_WFB not between", value1, value2, "managemeCategoryWfb");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzIsNull() {
            addCriterion("MANAGEME_CATEGORY_FZ is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_FZ is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FZ =", value, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FZ <>", value, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_FZ >", value, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FZ >=", value, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_FZ <", value, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_FZ <=", value, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_FZ in", values, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_FZ not in", values, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_FZ between", value1, value2, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryFzNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_FZ not between", value1, value2, "managemeCategoryFz");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtIsNull() {
            addCriterion("MANAGEME_CATEGORY_DT is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_DT is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_DT =", value, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_DT <>", value, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_DT >", value, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_DT >=", value, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_DT <", value, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_DT <=", value, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_DT in", values, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_DT not in", values, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_DT between", value1, value2, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryDtNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_DT not between", value1, value2, "managemeCategoryDt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStIsNull() {
            addCriterion("MANAGEME_CATEGORY_ST is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_ST is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ST =", value, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ST <>", value, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_ST >", value, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ST >=", value, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_ST <", value, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ST <=", value, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_ST in", values, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_ST not in", values, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_ST between", value1, value2, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryStNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_ST not between", value1, value2, "managemeCategorySt");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwIsNull() {
            addCriterion("MANAGEME_CATEGORY_ZW is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_ZW is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZW =", value, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZW <>", value, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZW >", value, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZW >=", value, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZW <", value, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_ZW <=", value, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_ZW in", values, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_ZW not in", values, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_ZW between", value1, value2, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryZwNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_ZW not between", value1, value2, "managemeCategoryZw");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrIsNull() {
            addCriterion("MANAGEME_CATEGORY_YR is null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrIsNotNull() {
            addCriterion("MANAGEME_CATEGORY_YR is not null");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_YR =", value, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrNotEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_YR <>", value, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrGreaterThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_YR >", value, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrGreaterThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_YR >=", value, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrLessThan(Short value) {
            addCriterion("MANAGEME_CATEGORY_YR <", value, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrLessThanOrEqualTo(Short value) {
            addCriterion("MANAGEME_CATEGORY_YR <=", value, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_YR in", values, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrNotIn(List<Short> values) {
            addCriterion("MANAGEME_CATEGORY_YR not in", values, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_YR between", value1, value2, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andManagemeCategoryYrNotBetween(Short value1, Short value2) {
            addCriterion("MANAGEME_CATEGORY_YR not between", value1, value2, "managemeCategoryYr");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentIsNull() {
            addCriterion("PLAN_EMPLOYMENT is null");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentIsNotNull() {
            addCriterion("PLAN_EMPLOYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentEqualTo(Long value) {
            addCriterion("PLAN_EMPLOYMENT =", value, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentNotEqualTo(Long value) {
            addCriterion("PLAN_EMPLOYMENT <>", value, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentGreaterThan(Long value) {
            addCriterion("PLAN_EMPLOYMENT >", value, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentGreaterThanOrEqualTo(Long value) {
            addCriterion("PLAN_EMPLOYMENT >=", value, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentLessThan(Long value) {
            addCriterion("PLAN_EMPLOYMENT <", value, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentLessThanOrEqualTo(Long value) {
            addCriterion("PLAN_EMPLOYMENT <=", value, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentIn(List<Long> values) {
            addCriterion("PLAN_EMPLOYMENT in", values, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentNotIn(List<Long> values) {
            addCriterion("PLAN_EMPLOYMENT not in", values, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentBetween(Long value1, Long value2) {
            addCriterion("PLAN_EMPLOYMENT between", value1, value2, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andPlanEmploymentNotBetween(Long value1, Long value2) {
            addCriterion("PLAN_EMPLOYMENT not between", value1, value2, "planEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentIsNull() {
            addCriterion("CURRENT_EMPLOYMENT is null");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentIsNotNull() {
            addCriterion("CURRENT_EMPLOYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentEqualTo(Long value) {
            addCriterion("CURRENT_EMPLOYMENT =", value, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentNotEqualTo(Long value) {
            addCriterion("CURRENT_EMPLOYMENT <>", value, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentGreaterThan(Long value) {
            addCriterion("CURRENT_EMPLOYMENT >", value, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_EMPLOYMENT >=", value, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentLessThan(Long value) {
            addCriterion("CURRENT_EMPLOYMENT <", value, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_EMPLOYMENT <=", value, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentIn(List<Long> values) {
            addCriterion("CURRENT_EMPLOYMENT in", values, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentNotIn(List<Long> values) {
            addCriterion("CURRENT_EMPLOYMENT not in", values, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentBetween(Long value1, Long value2) {
            addCriterion("CURRENT_EMPLOYMENT between", value1, value2, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andCurrentEmploymentNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_EMPLOYMENT not between", value1, value2, "currentEmployment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIsNull() {
            addCriterion("TOTAL_INVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIsNotNull() {
            addCriterion("TOTAL_INVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentEqualTo(Long value) {
            addCriterion("TOTAL_INVESTMENT =", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotEqualTo(Long value) {
            addCriterion("TOTAL_INVESTMENT <>", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentGreaterThan(Long value) {
            addCriterion("TOTAL_INVESTMENT >", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_INVESTMENT >=", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentLessThan(Long value) {
            addCriterion("TOTAL_INVESTMENT <", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_INVESTMENT <=", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIn(List<Long> values) {
            addCriterion("TOTAL_INVESTMENT in", values, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotIn(List<Long> values) {
            addCriterion("TOTAL_INVESTMENT not in", values, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentBetween(Long value1, Long value2) {
            addCriterion("TOTAL_INVESTMENT between", value1, value2, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_INVESTMENT not between", value1, value2, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentIsNull() {
            addCriterion("FIXED_INVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentIsNotNull() {
            addCriterion("FIXED_INVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentEqualTo(Long value) {
            addCriterion("FIXED_INVESTMENT =", value, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentNotEqualTo(Long value) {
            addCriterion("FIXED_INVESTMENT <>", value, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentGreaterThan(Long value) {
            addCriterion("FIXED_INVESTMENT >", value, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentGreaterThanOrEqualTo(Long value) {
            addCriterion("FIXED_INVESTMENT >=", value, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentLessThan(Long value) {
            addCriterion("FIXED_INVESTMENT <", value, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentLessThanOrEqualTo(Long value) {
            addCriterion("FIXED_INVESTMENT <=", value, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentIn(List<Long> values) {
            addCriterion("FIXED_INVESTMENT in", values, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentNotIn(List<Long> values) {
            addCriterion("FIXED_INVESTMENT not in", values, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentBetween(Long value1, Long value2) {
            addCriterion("FIXED_INVESTMENT between", value1, value2, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andFixedInvestmentNotBetween(Long value1, Long value2) {
            addCriterion("FIXED_INVESTMENT not between", value1, value2, "fixedInvestment");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdIsNull() {
            addCriterion("INVESTMENT_SUBJECT_P_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdIsNotNull() {
            addCriterion("INVESTMENT_SUBJECT_P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID =", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdNotEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID <>", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdGreaterThan(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID >", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID >=", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdLessThan(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID <", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdLessThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID <=", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdLike(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID like", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdNotLike(String value) {
            addCriterion("INVESTMENT_SUBJECT_P_ID not like", value, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdIn(List<String> values) {
            addCriterion("INVESTMENT_SUBJECT_P_ID in", values, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdNotIn(List<String> values) {
            addCriterion("INVESTMENT_SUBJECT_P_ID not in", values, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdBetween(String value1, String value2) {
            addCriterion("INVESTMENT_SUBJECT_P_ID between", value1, value2, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdNotBetween(String value1, String value2) {
            addCriterion("INVESTMENT_SUBJECT_P_ID not between", value1, value2, "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdIsNull() {
            addCriterion("INVESTMENT_SUBJECT_C_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdIsNotNull() {
            addCriterion("INVESTMENT_SUBJECT_C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID =", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdNotEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID <>", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdGreaterThan(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID >", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID >=", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdLessThan(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID <", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdLessThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID <=", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdLike(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID like", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdNotLike(String value) {
            addCriterion("INVESTMENT_SUBJECT_C_ID not like", value, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdIn(List<String> values) {
            addCriterion("INVESTMENT_SUBJECT_C_ID in", values, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdNotIn(List<String> values) {
            addCriterion("INVESTMENT_SUBJECT_C_ID not in", values, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdBetween(String value1, String value2) {
            addCriterion("INVESTMENT_SUBJECT_C_ID between", value1, value2, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdNotBetween(String value1, String value2) {
            addCriterion("INVESTMENT_SUBJECT_C_ID not between", value1, value2, "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameIsNull() {
            addCriterion("INVESTMENT_SUBJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameIsNotNull() {
            addCriterion("INVESTMENT_SUBJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME =", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameNotEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME <>", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameGreaterThan(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME >", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME >=", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameLessThan(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME <", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME <=", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameLike(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME like", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameNotLike(String value) {
            addCriterion("INVESTMENT_SUBJECT_NAME not like", value, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameIn(List<String> values) {
            addCriterion("INVESTMENT_SUBJECT_NAME in", values, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameNotIn(List<String> values) {
            addCriterion("INVESTMENT_SUBJECT_NAME not in", values, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameBetween(String value1, String value2) {
            addCriterion("INVESTMENT_SUBJECT_NAME between", value1, value2, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameNotBetween(String value1, String value2) {
            addCriterion("INVESTMENT_SUBJECT_NAME not between", value1, value2, "investmentSubjectName");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeIsNull() {
            addCriterion("FACTORY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeIsNotNull() {
            addCriterion("FACTORY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeEqualTo(Short value) {
            addCriterion("FACTORY_TYPE =", value, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeNotEqualTo(Short value) {
            addCriterion("FACTORY_TYPE <>", value, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeGreaterThan(Short value) {
            addCriterion("FACTORY_TYPE >", value, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("FACTORY_TYPE >=", value, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeLessThan(Short value) {
            addCriterion("FACTORY_TYPE <", value, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeLessThanOrEqualTo(Short value) {
            addCriterion("FACTORY_TYPE <=", value, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeIn(List<Short> values) {
            addCriterion("FACTORY_TYPE in", values, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeNotIn(List<Short> values) {
            addCriterion("FACTORY_TYPE not in", values, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeBetween(Short value1, Short value2) {
            addCriterion("FACTORY_TYPE between", value1, value2, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryTypeNotBetween(Short value1, Short value2) {
            addCriterion("FACTORY_TYPE not between", value1, value2, "factoryType");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIsNull() {
            addCriterion("FACTORY_AREA is null");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIsNotNull() {
            addCriterion("FACTORY_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaEqualTo(BigDecimal value) {
            addCriterion("FACTORY_AREA =", value, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaNotEqualTo(BigDecimal value) {
            addCriterion("FACTORY_AREA <>", value, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaGreaterThan(BigDecimal value) {
            addCriterion("FACTORY_AREA >", value, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTORY_AREA >=", value, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaLessThan(BigDecimal value) {
            addCriterion("FACTORY_AREA <", value, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTORY_AREA <=", value, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIn(List<BigDecimal> values) {
            addCriterion("FACTORY_AREA in", values, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaNotIn(List<BigDecimal> values) {
            addCriterion("FACTORY_AREA not in", values, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTORY_AREA between", value1, value2, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTORY_AREA not between", value1, value2, "factoryArea");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("REPORT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("REPORT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(Short value) {
            addCriterion("REPORT_STATUS =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(Short value) {
            addCriterion("REPORT_STATUS <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(Short value) {
            addCriterion("REPORT_STATUS >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("REPORT_STATUS >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(Short value) {
            addCriterion("REPORT_STATUS <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(Short value) {
            addCriterion("REPORT_STATUS <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<Short> values) {
            addCriterion("REPORT_STATUS in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<Short> values) {
            addCriterion("REPORT_STATUS not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(Short value1, Short value2) {
            addCriterion("REPORT_STATUS between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(Short value1, Short value2) {
            addCriterion("REPORT_STATUS not between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyIsNull() {
            addCriterion("KEY_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyIsNotNull() {
            addCriterion("KEY_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyEqualTo(Short value) {
            addCriterion("KEY_COMPANY =", value, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyNotEqualTo(Short value) {
            addCriterion("KEY_COMPANY <>", value, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyGreaterThan(Short value) {
            addCriterion("KEY_COMPANY >", value, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyGreaterThanOrEqualTo(Short value) {
            addCriterion("KEY_COMPANY >=", value, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyLessThan(Short value) {
            addCriterion("KEY_COMPANY <", value, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyLessThanOrEqualTo(Short value) {
            addCriterion("KEY_COMPANY <=", value, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyIn(List<Short> values) {
            addCriterion("KEY_COMPANY in", values, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyNotIn(List<Short> values) {
            addCriterion("KEY_COMPANY not in", values, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyBetween(Short value1, Short value2) {
            addCriterion("KEY_COMPANY between", value1, value2, "keyCompany");
            return (Criteria) this;
        }

        public Criteria andKeyCompanyNotBetween(Short value1, Short value2) {
            addCriterion("KEY_COMPANY not between", value1, value2, "keyCompany");
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

        public Criteria andSupplyPowerContractNumLikeInsensitive(String value) {
            addCriterion("upper(SUPPLY_POWER_CONTRACT_NUM) like", value.toUpperCase(), "supplyPowerContractNum");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFsLikeInsensitive(String value) {
            addCriterion("upper(INDUSTRY_CATEGORY_FS) like", value.toUpperCase(), "industryCategoryFs");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryZbLikeInsensitive(String value) {
            addCriterion("upper(INDUSTRY_CATEGORY_ZB) like", value.toUpperCase(), "industryCategoryZb");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryHxLikeInsensitive(String value) {
            addCriterion("upper(INDUSTRY_CATEGORY_HX) like", value.toUpperCase(), "industryCategoryHx");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryCyyfzpLikeInsensitive(String value) {
            addCriterion("upper(INDUSTRY_CATEGORY_CYYFZP) like", value.toUpperCase(), "industryCategoryCyyfzp");
            return (Criteria) this;
        }

        public Criteria andIndustryCategoryFzjjfLikeInsensitive(String value) {
            addCriterion("upper(INDUSTRY_CATEGORY_FZJJF) like", value.toUpperCase(), "industryCategoryFzjjf");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectPIdLikeInsensitive(String value) {
            addCriterion("upper(INVESTMENT_SUBJECT_P_ID) like", value.toUpperCase(), "investmentSubjectPId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectCIdLikeInsensitive(String value) {
            addCriterion("upper(INVESTMENT_SUBJECT_C_ID) like", value.toUpperCase(), "investmentSubjectCId");
            return (Criteria) this;
        }

        public Criteria andInvestmentSubjectNameLikeInsensitive(String value) {
            addCriterion("upper(INVESTMENT_SUBJECT_NAME) like", value.toUpperCase(), "investmentSubjectName");
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
     * D_UC_TEXTILE_ENTP
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_TEXTILE_ENTP null
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