package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcDealerAuditInfo implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 审核ID
     */
    private String auditId;

    /**
     * 交易商ID
     */
    private String dealerId;

    /**
     * 交易商类型原
     */
    private Short firmTypeOld;

    /**
     * 交易商类型
     */
    private Short firmType;

    /**
     * 账户缴费类型原
     */
    private Short accountPaymentTypeOld;

    /**
     * 账户缴费类型
     */
    private Short accountPaymentType;

    /**
     * 交易商企业类型原
     */
    private Short entpTypeOld;

    /**
     * 交易商企业类型
     */
    private Short entpType;

    /**
     * 入市协议原
     */
    private Short marketAgrOld;

    /**
     * 入市协议
     */
    private Short marketAgr;

    /**
     * 交易商代码原
     */
    private String firmCodeOld;

    /**
     * 交易商代码
     */
    private String firmCode;

    /**
     * 交易商简称原
     */
    private Short firmShortNameOld;

    /**
     * 交易商简称
     */
    private Short firmShortName;

    /**
     * 入市时间原
     */
    private Date joinDateOld;

    /**
     * 入市时间
     */
    private Date joinDate;

    /**
     * 增值税票企业类型原
     */
    private Short vatInvoiceEntpTypeOld;

    /**
     * 增值税票企业类型
     */
    private Short vatInvoiceEntpType;

    /**
     * 资格费电汇照片原
     */
    private String qualFeeUrlOld;

    /**
     * 资格费电汇照片
     */
    private String qualFeeUrl;

    /**
     * 客户区域原
     */
    private Short customRegionOld;

    /**
     * 客户区域
     */
    private Short customRegion;

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
     * D_UC_DEALER_AUDIT_INFO
     */
    private static final long serialVersionUID = 1L;

    public DUcDealerAuditInfo(String id, Short verid, String auditId, String dealerId, Short firmTypeOld, Short firmType, Short accountPaymentTypeOld, Short accountPaymentType, Short entpTypeOld, Short entpType, Short marketAgrOld, Short marketAgr, String firmCodeOld, String firmCode, Short firmShortNameOld, Short firmShortName, Date joinDateOld, Date joinDate, Short vatInvoiceEntpTypeOld, Short vatInvoiceEntpType, String qualFeeUrlOld, String qualFeeUrl, Short customRegionOld, Short customRegion, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.auditId = auditId;
        this.dealerId = dealerId;
        this.firmTypeOld = firmTypeOld;
        this.firmType = firmType;
        this.accountPaymentTypeOld = accountPaymentTypeOld;
        this.accountPaymentType = accountPaymentType;
        this.entpTypeOld = entpTypeOld;
        this.entpType = entpType;
        this.marketAgrOld = marketAgrOld;
        this.marketAgr = marketAgr;
        this.firmCodeOld = firmCodeOld;
        this.firmCode = firmCode;
        this.firmShortNameOld = firmShortNameOld;
        this.firmShortName = firmShortName;
        this.joinDateOld = joinDateOld;
        this.joinDate = joinDate;
        this.vatInvoiceEntpTypeOld = vatInvoiceEntpTypeOld;
        this.vatInvoiceEntpType = vatInvoiceEntpType;
        this.qualFeeUrlOld = qualFeeUrlOld;
        this.qualFeeUrl = qualFeeUrl;
        this.customRegionOld = customRegionOld;
        this.customRegion = customRegion;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcDealerAuditInfo() {
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
     * 审核ID
     * @return AUDIT_ID 审核ID
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * 审核ID
     * @param auditId 审核ID
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    /**
     * 交易商ID
     * @return DEALER_ID 交易商ID
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * 交易商ID
     * @param dealerId 交易商ID
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
    }

    /**
     * 交易商类型原
     * @return FIRM_TYPE_OLD 交易商类型原
     */
    public Short getFirmTypeOld() {
        return firmTypeOld;
    }

    /**
     * 交易商类型原
     * @param firmTypeOld 交易商类型原
     */
    public void setFirmTypeOld(Short firmTypeOld) {
        this.firmTypeOld = firmTypeOld;
    }

    /**
     * 交易商类型
     * @return FIRM_TYPE 交易商类型
     */
    public Short getFirmType() {
        return firmType;
    }

    /**
     * 交易商类型
     * @param firmType 交易商类型
     */
    public void setFirmType(Short firmType) {
        this.firmType = firmType;
    }

    /**
     * 账户缴费类型原
     * @return ACCOUNT_PAYMENT_TYPE_OLD 账户缴费类型原
     */
    public Short getAccountPaymentTypeOld() {
        return accountPaymentTypeOld;
    }

    /**
     * 账户缴费类型原
     * @param accountPaymentTypeOld 账户缴费类型原
     */
    public void setAccountPaymentTypeOld(Short accountPaymentTypeOld) {
        this.accountPaymentTypeOld = accountPaymentTypeOld;
    }

    /**
     * 账户缴费类型
     * @return ACCOUNT_PAYMENT_TYPE 账户缴费类型
     */
    public Short getAccountPaymentType() {
        return accountPaymentType;
    }

    /**
     * 账户缴费类型
     * @param accountPaymentType 账户缴费类型
     */
    public void setAccountPaymentType(Short accountPaymentType) {
        this.accountPaymentType = accountPaymentType;
    }

    /**
     * 交易商企业类型原
     * @return ENTP_TYPE_OLD 交易商企业类型原
     */
    public Short getEntpTypeOld() {
        return entpTypeOld;
    }

    /**
     * 交易商企业类型原
     * @param entpTypeOld 交易商企业类型原
     */
    public void setEntpTypeOld(Short entpTypeOld) {
        this.entpTypeOld = entpTypeOld;
    }

    /**
     * 交易商企业类型
     * @return ENTP_TYPE 交易商企业类型
     */
    public Short getEntpType() {
        return entpType;
    }

    /**
     * 交易商企业类型
     * @param entpType 交易商企业类型
     */
    public void setEntpType(Short entpType) {
        this.entpType = entpType;
    }

    /**
     * 入市协议原
     * @return MARKET_AGR_OLD 入市协议原
     */
    public Short getMarketAgrOld() {
        return marketAgrOld;
    }

    /**
     * 入市协议原
     * @param marketAgrOld 入市协议原
     */
    public void setMarketAgrOld(Short marketAgrOld) {
        this.marketAgrOld = marketAgrOld;
    }

    /**
     * 入市协议
     * @return MARKET_AGR 入市协议
     */
    public Short getMarketAgr() {
        return marketAgr;
    }

    /**
     * 入市协议
     * @param marketAgr 入市协议
     */
    public void setMarketAgr(Short marketAgr) {
        this.marketAgr = marketAgr;
    }

    /**
     * 交易商代码原
     * @return FIRM_CODE_OLD 交易商代码原
     */
    public String getFirmCodeOld() {
        return firmCodeOld;
    }

    /**
     * 交易商代码原
     * @param firmCodeOld 交易商代码原
     */
    public void setFirmCodeOld(String firmCodeOld) {
        this.firmCodeOld = firmCodeOld == null ? null : firmCodeOld.trim();
    }

    /**
     * 交易商代码
     * @return FIRM_CODE 交易商代码
     */
    public String getFirmCode() {
        return firmCode;
    }

    /**
     * 交易商代码
     * @param firmCode 交易商代码
     */
    public void setFirmCode(String firmCode) {
        this.firmCode = firmCode == null ? null : firmCode.trim();
    }

    /**
     * 交易商简称原
     * @return FIRM_SHORT_NAME_OLD 交易商简称原
     */
    public Short getFirmShortNameOld() {
        return firmShortNameOld;
    }

    /**
     * 交易商简称原
     * @param firmShortNameOld 交易商简称原
     */
    public void setFirmShortNameOld(Short firmShortNameOld) {
        this.firmShortNameOld = firmShortNameOld;
    }

    /**
     * 交易商简称
     * @return FIRM_SHORT_NAME 交易商简称
     */
    public Short getFirmShortName() {
        return firmShortName;
    }

    /**
     * 交易商简称
     * @param firmShortName 交易商简称
     */
    public void setFirmShortName(Short firmShortName) {
        this.firmShortName = firmShortName;
    }

    /**
     * 入市时间原
     * @return JOIN_DATE_OLD 入市时间原
     */
    public Date getJoinDateOld() {
        return joinDateOld;
    }

    /**
     * 入市时间原
     * @param joinDateOld 入市时间原
     */
    public void setJoinDateOld(Date joinDateOld) {
        this.joinDateOld = joinDateOld;
    }

    /**
     * 入市时间
     * @return JOIN_DATE 入市时间
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * 入市时间
     * @param joinDate 入市时间
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * 增值税票企业类型原
     * @return VAT_INVOICE_ENTP_TYPE_OLD 增值税票企业类型原
     */
    public Short getVatInvoiceEntpTypeOld() {
        return vatInvoiceEntpTypeOld;
    }

    /**
     * 增值税票企业类型原
     * @param vatInvoiceEntpTypeOld 增值税票企业类型原
     */
    public void setVatInvoiceEntpTypeOld(Short vatInvoiceEntpTypeOld) {
        this.vatInvoiceEntpTypeOld = vatInvoiceEntpTypeOld;
    }

    /**
     * 增值税票企业类型
     * @return VAT_INVOICE_ENTP_TYPE 增值税票企业类型
     */
    public Short getVatInvoiceEntpType() {
        return vatInvoiceEntpType;
    }

    /**
     * 增值税票企业类型
     * @param vatInvoiceEntpType 增值税票企业类型
     */
    public void setVatInvoiceEntpType(Short vatInvoiceEntpType) {
        this.vatInvoiceEntpType = vatInvoiceEntpType;
    }

    /**
     * 资格费电汇照片原
     * @return QUAL_FEE_URL_OLD 资格费电汇照片原
     */
    public String getQualFeeUrlOld() {
        return qualFeeUrlOld;
    }

    /**
     * 资格费电汇照片原
     * @param qualFeeUrlOld 资格费电汇照片原
     */
    public void setQualFeeUrlOld(String qualFeeUrlOld) {
        this.qualFeeUrlOld = qualFeeUrlOld == null ? null : qualFeeUrlOld.trim();
    }

    /**
     * 资格费电汇照片
     * @return QUAL_FEE_URL 资格费电汇照片
     */
    public String getQualFeeUrl() {
        return qualFeeUrl;
    }

    /**
     * 资格费电汇照片
     * @param qualFeeUrl 资格费电汇照片
     */
    public void setQualFeeUrl(String qualFeeUrl) {
        this.qualFeeUrl = qualFeeUrl == null ? null : qualFeeUrl.trim();
    }

    /**
     * 客户区域原
     * @return CUSTOM_REGION_OLD 客户区域原
     */
    public Short getCustomRegionOld() {
        return customRegionOld;
    }

    /**
     * 客户区域原
     * @param customRegionOld 客户区域原
     */
    public void setCustomRegionOld(Short customRegionOld) {
        this.customRegionOld = customRegionOld;
    }

    /**
     * 客户区域
     * @return CUSTOM_REGION 客户区域
     */
    public Short getCustomRegion() {
        return customRegion;
    }

    /**
     * 客户区域
     * @param customRegion 客户区域
     */
    public void setCustomRegion(Short customRegion) {
        this.customRegion = customRegion;
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
        sb.append(", auditId=").append(auditId);
        sb.append(", dealerId=").append(dealerId);
        sb.append(", firmTypeOld=").append(firmTypeOld);
        sb.append(", firmType=").append(firmType);
        sb.append(", accountPaymentTypeOld=").append(accountPaymentTypeOld);
        sb.append(", accountPaymentType=").append(accountPaymentType);
        sb.append(", entpTypeOld=").append(entpTypeOld);
        sb.append(", entpType=").append(entpType);
        sb.append(", marketAgrOld=").append(marketAgrOld);
        sb.append(", marketAgr=").append(marketAgr);
        sb.append(", firmCodeOld=").append(firmCodeOld);
        sb.append(", firmCode=").append(firmCode);
        sb.append(", firmShortNameOld=").append(firmShortNameOld);
        sb.append(", firmShortName=").append(firmShortName);
        sb.append(", joinDateOld=").append(joinDateOld);
        sb.append(", joinDate=").append(joinDate);
        sb.append(", vatInvoiceEntpTypeOld=").append(vatInvoiceEntpTypeOld);
        sb.append(", vatInvoiceEntpType=").append(vatInvoiceEntpType);
        sb.append(", qualFeeUrlOld=").append(qualFeeUrlOld);
        sb.append(", qualFeeUrl=").append(qualFeeUrl);
        sb.append(", customRegionOld=").append(customRegionOld);
        sb.append(", customRegion=").append(customRegion);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}