package com.footprint.common.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DUcTextileEntp implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 兵地类型
     */
    private Short armyLocalType;

    /**
     * 供电合同号
     */
    private String supplyPowerContractNum;

    /**
     * 签约日期
     */
    private Date signTime;

    /**
     * 注册日期
     */
    private Date registTime;

    /**
     * 开工日期
     */
    private Date startTime;

    /**
     * 投产日期
     */
    private Date operatedTime;

    /**
     * 纺纱(万锭)
     */
    private String industryCategoryFs;

    /**
     * 织布(万米)
     */
    private String industryCategoryZb;

    /**
     * 化纤(吨)
     */
    private String industryCategoryHx;

    /**
     * 产业用纺织品(吨)
     */
    private String industryCategoryCyyfzp;

    /**
     * 服装及家纺
     */
    private String industryCategoryFzjjf;

    /**
     * 纺纱
     */
    private Short managemeCategoryFs;

    /**
     * 织布
     */
    private Short managemeCategoryZb;

    /**
     * 化纤
     */
    private Short managemeCategoryHx;

    /**
     * 粘浆粕
     */
    private Short managemeCategoryNjp;

    /**
     * 无纺布
     */
    private Short managemeCategoryWfb;

    /**
     * 服装
     */
    private Short managemeCategoryFz;

    /**
     * 地毯
     */
    private Short managemeCategoryDt;

    /**
     * 手套
     */
    private Short managemeCategorySt;

    /**
     * 织袜
     */
    private Short managemeCategoryZw;

    /**
     * 印染
     */
    private Short managemeCategoryYr;

    /**
     * 计划就业人数(人)
     */
    private Long planEmployment;

    /**
     * 当前就业人数(人)
     */
    private Long currentEmployment;

    /**
     * 总投资(万元)
     */
    private Long totalInvestment;

    /**
     * 固定投资(万元)
     */
    private Long fixedInvestment;

    /**
     * 投资主体归属省
     */
    private String investmentSubjectPId;

    /**
     * 投资主体归属市
     */
    private String investmentSubjectCId;

    /**
     * 投资主体名称
     */
    private String investmentSubjectName;

    /**
     * 厂房类型
     */
    private Short factoryType;

    /**
     * 厂房面积(平方米)
     */
    private BigDecimal factoryArea;

    /**
     * 上报状态
     */
    private Short reportStatus;

    /**
     * 是否重点企业
     */
    private Short keyCompany;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建者
     */
    private String createuser;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 更新者
     */
    private String updateuser;

    /**
     * D_UC_TEXTILE_ENTP
     */
    private static final long serialVersionUID = 1L;

    public DUcTextileEntp(String id, Short verid, Short armyLocalType, String supplyPowerContractNum, Date signTime, Date registTime, Date startTime, Date operatedTime, String industryCategoryFs, String industryCategoryZb, String industryCategoryHx, String industryCategoryCyyfzp, String industryCategoryFzjjf, Short managemeCategoryFs, Short managemeCategoryZb, Short managemeCategoryHx, Short managemeCategoryNjp, Short managemeCategoryWfb, Short managemeCategoryFz, Short managemeCategoryDt, Short managemeCategorySt, Short managemeCategoryZw, Short managemeCategoryYr, Long planEmployment, Long currentEmployment, Long totalInvestment, Long fixedInvestment, String investmentSubjectPId, String investmentSubjectCId, String investmentSubjectName, Short factoryType, BigDecimal factoryArea, Short reportStatus, Short keyCompany, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.armyLocalType = armyLocalType;
        this.supplyPowerContractNum = supplyPowerContractNum;
        this.signTime = signTime;
        this.registTime = registTime;
        this.startTime = startTime;
        this.operatedTime = operatedTime;
        this.industryCategoryFs = industryCategoryFs;
        this.industryCategoryZb = industryCategoryZb;
        this.industryCategoryHx = industryCategoryHx;
        this.industryCategoryCyyfzp = industryCategoryCyyfzp;
        this.industryCategoryFzjjf = industryCategoryFzjjf;
        this.managemeCategoryFs = managemeCategoryFs;
        this.managemeCategoryZb = managemeCategoryZb;
        this.managemeCategoryHx = managemeCategoryHx;
        this.managemeCategoryNjp = managemeCategoryNjp;
        this.managemeCategoryWfb = managemeCategoryWfb;
        this.managemeCategoryFz = managemeCategoryFz;
        this.managemeCategoryDt = managemeCategoryDt;
        this.managemeCategorySt = managemeCategorySt;
        this.managemeCategoryZw = managemeCategoryZw;
        this.managemeCategoryYr = managemeCategoryYr;
        this.planEmployment = planEmployment;
        this.currentEmployment = currentEmployment;
        this.totalInvestment = totalInvestment;
        this.fixedInvestment = fixedInvestment;
        this.investmentSubjectPId = investmentSubjectPId;
        this.investmentSubjectCId = investmentSubjectCId;
        this.investmentSubjectName = investmentSubjectName;
        this.factoryType = factoryType;
        this.factoryArea = factoryArea;
        this.reportStatus = reportStatus;
        this.keyCompany = keyCompany;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcTextileEntp() {
        super();
    }

    /**
     * ID
     * @return ID ID
     */
    public String getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 版本号
     * @return VERID 版本号
     */
    public Short getVerid() {
        return verid;
    }

    /**
     * 版本号
     * @param verid 版本号
     */
    public void setVerid(Short verid) {
        this.verid = verid;
    }

    /**
     * 兵地类型
     * @return ARMY_LOCAL_TYPE 兵地类型
     */
    public Short getArmyLocalType() {
        return armyLocalType;
    }

    /**
     * 兵地类型
     * @param armyLocalType 兵地类型
     */
    public void setArmyLocalType(Short armyLocalType) {
        this.armyLocalType = armyLocalType;
    }

    /**
     * 供电合同号
     * @return SUPPLY_POWER_CONTRACT_NUM 供电合同号
     */
    public String getSupplyPowerContractNum() {
        return supplyPowerContractNum;
    }

    /**
     * 供电合同号
     * @param supplyPowerContractNum 供电合同号
     */
    public void setSupplyPowerContractNum(String supplyPowerContractNum) {
        this.supplyPowerContractNum = supplyPowerContractNum == null ? null : supplyPowerContractNum.trim();
    }

    /**
     * 签约日期
     * @return SIGN_TIME 签约日期
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * 签约日期
     * @param signTime 签约日期
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * 注册日期
     * @return REGIST_TIME 注册日期
     */
    public Date getRegistTime() {
        return registTime;
    }

    /**
     * 注册日期
     * @param registTime 注册日期
     */
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    /**
     * 开工日期
     * @return START_TIME 开工日期
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 开工日期
     * @param startTime 开工日期
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 投产日期
     * @return OPERATED_TIME 投产日期
     */
    public Date getOperatedTime() {
        return operatedTime;
    }

    /**
     * 投产日期
     * @param operatedTime 投产日期
     */
    public void setOperatedTime(Date operatedTime) {
        this.operatedTime = operatedTime;
    }

    /**
     * 纺纱(万锭)
     * @return INDUSTRY_CATEGORY_FS 纺纱(万锭)
     */
    public String getIndustryCategoryFs() {
        return industryCategoryFs;
    }

    /**
     * 纺纱(万锭)
     * @param industryCategoryFs 纺纱(万锭)
     */
    public void setIndustryCategoryFs(String industryCategoryFs) {
        this.industryCategoryFs = industryCategoryFs == null ? null : industryCategoryFs.trim();
    }

    /**
     * 织布(万米)
     * @return INDUSTRY_CATEGORY_ZB 织布(万米)
     */
    public String getIndustryCategoryZb() {
        return industryCategoryZb;
    }

    /**
     * 织布(万米)
     * @param industryCategoryZb 织布(万米)
     */
    public void setIndustryCategoryZb(String industryCategoryZb) {
        this.industryCategoryZb = industryCategoryZb == null ? null : industryCategoryZb.trim();
    }

    /**
     * 化纤(吨)
     * @return INDUSTRY_CATEGORY_HX 化纤(吨)
     */
    public String getIndustryCategoryHx() {
        return industryCategoryHx;
    }

    /**
     * 化纤(吨)
     * @param industryCategoryHx 化纤(吨)
     */
    public void setIndustryCategoryHx(String industryCategoryHx) {
        this.industryCategoryHx = industryCategoryHx == null ? null : industryCategoryHx.trim();
    }

    /**
     * 产业用纺织品(吨)
     * @return INDUSTRY_CATEGORY_CYYFZP 产业用纺织品(吨)
     */
    public String getIndustryCategoryCyyfzp() {
        return industryCategoryCyyfzp;
    }

    /**
     * 产业用纺织品(吨)
     * @param industryCategoryCyyfzp 产业用纺织品(吨)
     */
    public void setIndustryCategoryCyyfzp(String industryCategoryCyyfzp) {
        this.industryCategoryCyyfzp = industryCategoryCyyfzp == null ? null : industryCategoryCyyfzp.trim();
    }

    /**
     * 服装及家纺
     * @return INDUSTRY_CATEGORY_FZJJF 服装及家纺
     */
    public String getIndustryCategoryFzjjf() {
        return industryCategoryFzjjf;
    }

    /**
     * 服装及家纺
     * @param industryCategoryFzjjf 服装及家纺
     */
    public void setIndustryCategoryFzjjf(String industryCategoryFzjjf) {
        this.industryCategoryFzjjf = industryCategoryFzjjf == null ? null : industryCategoryFzjjf.trim();
    }

    /**
     * 纺纱
     * @return MANAGEME_CATEGORY_FS 纺纱
     */
    public Short getManagemeCategoryFs() {
        return managemeCategoryFs;
    }

    /**
     * 纺纱
     * @param managemeCategoryFs 纺纱
     */
    public void setManagemeCategoryFs(Short managemeCategoryFs) {
        this.managemeCategoryFs = managemeCategoryFs;
    }

    /**
     * 织布
     * @return MANAGEME_CATEGORY_ZB 织布
     */
    public Short getManagemeCategoryZb() {
        return managemeCategoryZb;
    }

    /**
     * 织布
     * @param managemeCategoryZb 织布
     */
    public void setManagemeCategoryZb(Short managemeCategoryZb) {
        this.managemeCategoryZb = managemeCategoryZb;
    }

    /**
     * 化纤
     * @return MANAGEME_CATEGORY_HX 化纤
     */
    public Short getManagemeCategoryHx() {
        return managemeCategoryHx;
    }

    /**
     * 化纤
     * @param managemeCategoryHx 化纤
     */
    public void setManagemeCategoryHx(Short managemeCategoryHx) {
        this.managemeCategoryHx = managemeCategoryHx;
    }

    /**
     * 粘浆粕
     * @return MANAGEME_CATEGORY_NJP 粘浆粕
     */
    public Short getManagemeCategoryNjp() {
        return managemeCategoryNjp;
    }

    /**
     * 粘浆粕
     * @param managemeCategoryNjp 粘浆粕
     */
    public void setManagemeCategoryNjp(Short managemeCategoryNjp) {
        this.managemeCategoryNjp = managemeCategoryNjp;
    }

    /**
     * 无纺布
     * @return MANAGEME_CATEGORY_WFB 无纺布
     */
    public Short getManagemeCategoryWfb() {
        return managemeCategoryWfb;
    }

    /**
     * 无纺布
     * @param managemeCategoryWfb 无纺布
     */
    public void setManagemeCategoryWfb(Short managemeCategoryWfb) {
        this.managemeCategoryWfb = managemeCategoryWfb;
    }

    /**
     * 服装
     * @return MANAGEME_CATEGORY_FZ 服装
     */
    public Short getManagemeCategoryFz() {
        return managemeCategoryFz;
    }

    /**
     * 服装
     * @param managemeCategoryFz 服装
     */
    public void setManagemeCategoryFz(Short managemeCategoryFz) {
        this.managemeCategoryFz = managemeCategoryFz;
    }

    /**
     * 地毯
     * @return MANAGEME_CATEGORY_DT 地毯
     */
    public Short getManagemeCategoryDt() {
        return managemeCategoryDt;
    }

    /**
     * 地毯
     * @param managemeCategoryDt 地毯
     */
    public void setManagemeCategoryDt(Short managemeCategoryDt) {
        this.managemeCategoryDt = managemeCategoryDt;
    }

    /**
     * 手套
     * @return MANAGEME_CATEGORY_ST 手套
     */
    public Short getManagemeCategorySt() {
        return managemeCategorySt;
    }

    /**
     * 手套
     * @param managemeCategorySt 手套
     */
    public void setManagemeCategorySt(Short managemeCategorySt) {
        this.managemeCategorySt = managemeCategorySt;
    }

    /**
     * 织袜
     * @return MANAGEME_CATEGORY_ZW 织袜
     */
    public Short getManagemeCategoryZw() {
        return managemeCategoryZw;
    }

    /**
     * 织袜
     * @param managemeCategoryZw 织袜
     */
    public void setManagemeCategoryZw(Short managemeCategoryZw) {
        this.managemeCategoryZw = managemeCategoryZw;
    }

    /**
     * 印染
     * @return MANAGEME_CATEGORY_YR 印染
     */
    public Short getManagemeCategoryYr() {
        return managemeCategoryYr;
    }

    /**
     * 印染
     * @param managemeCategoryYr 印染
     */
    public void setManagemeCategoryYr(Short managemeCategoryYr) {
        this.managemeCategoryYr = managemeCategoryYr;
    }

    /**
     * 计划就业人数(人)
     * @return PLAN_EMPLOYMENT 计划就业人数(人)
     */
    public Long getPlanEmployment() {
        return planEmployment;
    }

    /**
     * 计划就业人数(人)
     * @param planEmployment 计划就业人数(人)
     */
    public void setPlanEmployment(Long planEmployment) {
        this.planEmployment = planEmployment;
    }

    /**
     * 当前就业人数(人)
     * @return CURRENT_EMPLOYMENT 当前就业人数(人)
     */
    public Long getCurrentEmployment() {
        return currentEmployment;
    }

    /**
     * 当前就业人数(人)
     * @param currentEmployment 当前就业人数(人)
     */
    public void setCurrentEmployment(Long currentEmployment) {
        this.currentEmployment = currentEmployment;
    }

    /**
     * 总投资(万元)
     * @return TOTAL_INVESTMENT 总投资(万元)
     */
    public Long getTotalInvestment() {
        return totalInvestment;
    }

    /**
     * 总投资(万元)
     * @param totalInvestment 总投资(万元)
     */
    public void setTotalInvestment(Long totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    /**
     * 固定投资(万元)
     * @return FIXED_INVESTMENT 固定投资(万元)
     */
    public Long getFixedInvestment() {
        return fixedInvestment;
    }

    /**
     * 固定投资(万元)
     * @param fixedInvestment 固定投资(万元)
     */
    public void setFixedInvestment(Long fixedInvestment) {
        this.fixedInvestment = fixedInvestment;
    }

    /**
     * 投资主体归属省
     * @return INVESTMENT_SUBJECT_P_ID 投资主体归属省
     */
    public String getInvestmentSubjectPId() {
        return investmentSubjectPId;
    }

    /**
     * 投资主体归属省
     * @param investmentSubjectPId 投资主体归属省
     */
    public void setInvestmentSubjectPId(String investmentSubjectPId) {
        this.investmentSubjectPId = investmentSubjectPId == null ? null : investmentSubjectPId.trim();
    }

    /**
     * 投资主体归属市
     * @return INVESTMENT_SUBJECT_C_ID 投资主体归属市
     */
    public String getInvestmentSubjectCId() {
        return investmentSubjectCId;
    }

    /**
     * 投资主体归属市
     * @param investmentSubjectCId 投资主体归属市
     */
    public void setInvestmentSubjectCId(String investmentSubjectCId) {
        this.investmentSubjectCId = investmentSubjectCId == null ? null : investmentSubjectCId.trim();
    }

    /**
     * 投资主体名称
     * @return INVESTMENT_SUBJECT_NAME 投资主体名称
     */
    public String getInvestmentSubjectName() {
        return investmentSubjectName;
    }

    /**
     * 投资主体名称
     * @param investmentSubjectName 投资主体名称
     */
    public void setInvestmentSubjectName(String investmentSubjectName) {
        this.investmentSubjectName = investmentSubjectName == null ? null : investmentSubjectName.trim();
    }

    /**
     * 厂房类型
     * @return FACTORY_TYPE 厂房类型
     */
    public Short getFactoryType() {
        return factoryType;
    }

    /**
     * 厂房类型
     * @param factoryType 厂房类型
     */
    public void setFactoryType(Short factoryType) {
        this.factoryType = factoryType;
    }

    /**
     * 厂房面积(平方米)
     * @return FACTORY_AREA 厂房面积(平方米)
     */
    public BigDecimal getFactoryArea() {
        return factoryArea;
    }

    /**
     * 厂房面积(平方米)
     * @param factoryArea 厂房面积(平方米)
     */
    public void setFactoryArea(BigDecimal factoryArea) {
        this.factoryArea = factoryArea;
    }

    /**
     * 上报状态
     * @return REPORT_STATUS 上报状态
     */
    public Short getReportStatus() {
        return reportStatus;
    }

    /**
     * 上报状态
     * @param reportStatus 上报状态
     */
    public void setReportStatus(Short reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * 是否重点企业
     * @return KEY_COMPANY 是否重点企业
     */
    public Short getKeyCompany() {
        return keyCompany;
    }

    /**
     * 是否重点企业
     * @param keyCompany 是否重点企业
     */
    public void setKeyCompany(Short keyCompany) {
        this.keyCompany = keyCompany;
    }

    /**
     * 创建时间
     * @return CREATETIME 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 创建者
     * @return CREATEUSER 创建者
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * 创建者
     * @param createuser 创建者
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * 更新时间
     * @return UPDATETIME 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 更新时间
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 更新者
     * @return UPDATEUSER 更新者
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * 更新者
     * @param updateuser 更新者
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", verid=").append(verid);
        sb.append(", armyLocalType=").append(armyLocalType);
        sb.append(", supplyPowerContractNum=").append(supplyPowerContractNum);
        sb.append(", signTime=").append(signTime);
        sb.append(", registTime=").append(registTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", operatedTime=").append(operatedTime);
        sb.append(", industryCategoryFs=").append(industryCategoryFs);
        sb.append(", industryCategoryZb=").append(industryCategoryZb);
        sb.append(", industryCategoryHx=").append(industryCategoryHx);
        sb.append(", industryCategoryCyyfzp=").append(industryCategoryCyyfzp);
        sb.append(", industryCategoryFzjjf=").append(industryCategoryFzjjf);
        sb.append(", managemeCategoryFs=").append(managemeCategoryFs);
        sb.append(", managemeCategoryZb=").append(managemeCategoryZb);
        sb.append(", managemeCategoryHx=").append(managemeCategoryHx);
        sb.append(", managemeCategoryNjp=").append(managemeCategoryNjp);
        sb.append(", managemeCategoryWfb=").append(managemeCategoryWfb);
        sb.append(", managemeCategoryFz=").append(managemeCategoryFz);
        sb.append(", managemeCategoryDt=").append(managemeCategoryDt);
        sb.append(", managemeCategorySt=").append(managemeCategorySt);
        sb.append(", managemeCategoryZw=").append(managemeCategoryZw);
        sb.append(", managemeCategoryYr=").append(managemeCategoryYr);
        sb.append(", planEmployment=").append(planEmployment);
        sb.append(", currentEmployment=").append(currentEmployment);
        sb.append(", totalInvestment=").append(totalInvestment);
        sb.append(", fixedInvestment=").append(fixedInvestment);
        sb.append(", investmentSubjectPId=").append(investmentSubjectPId);
        sb.append(", investmentSubjectCId=").append(investmentSubjectCId);
        sb.append(", investmentSubjectName=").append(investmentSubjectName);
        sb.append(", factoryType=").append(factoryType);
        sb.append(", factoryArea=").append(factoryArea);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", keyCompany=").append(keyCompany);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}