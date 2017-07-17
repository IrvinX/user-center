package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcDealer implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 交易商类型
     */
    private Short firmType;

    /**
     * 账户缴费类型
     */
    private Short accountPaymentType;

    /**
     * 交易商企业类型
     */
    private Short entpType;

    /**
     * 入市协议
     */
    private Short marketAgr;

    /**
     * 交易商代码
     */
    private String firmCode;

    /**
     * 交易商简称
     */
    private Short firmShortName;

    /**
     * 入市时间
     */
    private Date joinDate;

    /**
     * 增值税票地址_省
     */
    private String vatInvoicePr;

    /**
     * 增值税票地址_市
     */
    private String vatInvoiceCity;

    /**
     * 增值税票地址_区
     */
    private String vatInvoiceDist;

    /**
     * 增值税票地址_地址
     */
    private String vatInvoiceAddr;

    /**
     * 增值税票电话
     */
    private String vatInvoiceTel;

    /**
     * 增值税票企业类型
     */
    private Short vatInvoiceEntpType;

    /**
     * 有效期开始
     */
    private Date expiryDateStt;

    /**
     * 有效期结束
     */
    private Date expiryDateEnd;

    /**
     * 交易商状态
     */
    private Short firmStatus;

    /**
     * 资格费电汇照片
     */
    private String qualFeeUrl;

    /**
     * 年加工量
     */
    private Long yearProcessing;

    /**
     * 年用棉量
     */
    private Long yearExpendQty;

    /**
     * 纺锭数量
     */
    private Long haspQty;

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
     * D_UC_DEALER
     */
    private static final long serialVersionUID = 1L;

    public DUcDealer(String id, Short verid, Short firmType, Short accountPaymentType, Short entpType, Short marketAgr, String firmCode, Short firmShortName, Date joinDate, String vatInvoicePr, String vatInvoiceCity, String vatInvoiceDist, String vatInvoiceAddr, String vatInvoiceTel, Short vatInvoiceEntpType, Date expiryDateStt, Date expiryDateEnd, Short firmStatus, String qualFeeUrl, Long yearProcessing, Long yearExpendQty, Long haspQty, Short customRegion, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.firmType = firmType;
        this.accountPaymentType = accountPaymentType;
        this.entpType = entpType;
        this.marketAgr = marketAgr;
        this.firmCode = firmCode;
        this.firmShortName = firmShortName;
        this.joinDate = joinDate;
        this.vatInvoicePr = vatInvoicePr;
        this.vatInvoiceCity = vatInvoiceCity;
        this.vatInvoiceDist = vatInvoiceDist;
        this.vatInvoiceAddr = vatInvoiceAddr;
        this.vatInvoiceTel = vatInvoiceTel;
        this.vatInvoiceEntpType = vatInvoiceEntpType;
        this.expiryDateStt = expiryDateStt;
        this.expiryDateEnd = expiryDateEnd;
        this.firmStatus = firmStatus;
        this.qualFeeUrl = qualFeeUrl;
        this.yearProcessing = yearProcessing;
        this.yearExpendQty = yearExpendQty;
        this.haspQty = haspQty;
        this.customRegion = customRegion;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcDealer() {
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
     * 增值税票地址_省
     * @return VAT_INVOICE_PR 增值税票地址_省
     */
    public String getVatInvoicePr() {
        return vatInvoicePr;
    }

    /**
     * 增值税票地址_省
     * @param vatInvoicePr 增值税票地址_省
     */
    public void setVatInvoicePr(String vatInvoicePr) {
        this.vatInvoicePr = vatInvoicePr == null ? null : vatInvoicePr.trim();
    }

    /**
     * 增值税票地址_市
     * @return VAT_INVOICE_CITY 增值税票地址_市
     */
    public String getVatInvoiceCity() {
        return vatInvoiceCity;
    }

    /**
     * 增值税票地址_市
     * @param vatInvoiceCity 增值税票地址_市
     */
    public void setVatInvoiceCity(String vatInvoiceCity) {
        this.vatInvoiceCity = vatInvoiceCity == null ? null : vatInvoiceCity.trim();
    }

    /**
     * 增值税票地址_区
     * @return VAT_INVOICE_DIST 增值税票地址_区
     */
    public String getVatInvoiceDist() {
        return vatInvoiceDist;
    }

    /**
     * 增值税票地址_区
     * @param vatInvoiceDist 增值税票地址_区
     */
    public void setVatInvoiceDist(String vatInvoiceDist) {
        this.vatInvoiceDist = vatInvoiceDist == null ? null : vatInvoiceDist.trim();
    }

    /**
     * 增值税票地址_地址
     * @return VAT_INVOICE_ADDR 增值税票地址_地址
     */
    public String getVatInvoiceAddr() {
        return vatInvoiceAddr;
    }

    /**
     * 增值税票地址_地址
     * @param vatInvoiceAddr 增值税票地址_地址
     */
    public void setVatInvoiceAddr(String vatInvoiceAddr) {
        this.vatInvoiceAddr = vatInvoiceAddr == null ? null : vatInvoiceAddr.trim();
    }

    /**
     * 增值税票电话
     * @return VAT_INVOICE_TEL 增值税票电话
     */
    public String getVatInvoiceTel() {
        return vatInvoiceTel;
    }

    /**
     * 增值税票电话
     * @param vatInvoiceTel 增值税票电话
     */
    public void setVatInvoiceTel(String vatInvoiceTel) {
        this.vatInvoiceTel = vatInvoiceTel == null ? null : vatInvoiceTel.trim();
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
     * 有效期开始
     * @return EXPIRY_DATE_STT 有效期开始
     */
    public Date getExpiryDateStt() {
        return expiryDateStt;
    }

    /**
     * 有效期开始
     * @param expiryDateStt 有效期开始
     */
    public void setExpiryDateStt(Date expiryDateStt) {
        this.expiryDateStt = expiryDateStt;
    }

    /**
     * 有效期结束
     * @return EXPIRY_DATE_END 有效期结束
     */
    public Date getExpiryDateEnd() {
        return expiryDateEnd;
    }

    /**
     * 有效期结束
     * @param expiryDateEnd 有效期结束
     */
    public void setExpiryDateEnd(Date expiryDateEnd) {
        this.expiryDateEnd = expiryDateEnd;
    }

    /**
     * 交易商状态
     * @return FIRM_STATUS 交易商状态
     */
    public Short getFirmStatus() {
        return firmStatus;
    }

    /**
     * 交易商状态
     * @param firmStatus 交易商状态
     */
    public void setFirmStatus(Short firmStatus) {
        this.firmStatus = firmStatus;
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
     * 年加工量
     * @return YEAR_PROCESSING 年加工量
     */
    public Long getYearProcessing() {
        return yearProcessing;
    }

    /**
     * 年加工量
     * @param yearProcessing 年加工量
     */
    public void setYearProcessing(Long yearProcessing) {
        this.yearProcessing = yearProcessing;
    }

    /**
     * 年用棉量
     * @return YEAR_EXPEND_QTY 年用棉量
     */
    public Long getYearExpendQty() {
        return yearExpendQty;
    }

    /**
     * 年用棉量
     * @param yearExpendQty 年用棉量
     */
    public void setYearExpendQty(Long yearExpendQty) {
        this.yearExpendQty = yearExpendQty;
    }

    /**
     * 纺锭数量
     * @return HASP_QTY 纺锭数量
     */
    public Long getHaspQty() {
        return haspQty;
    }

    /**
     * 纺锭数量
     * @param haspQty 纺锭数量
     */
    public void setHaspQty(Long haspQty) {
        this.haspQty = haspQty;
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
        sb.append(", firmType=").append(firmType);
        sb.append(", accountPaymentType=").append(accountPaymentType);
        sb.append(", entpType=").append(entpType);
        sb.append(", marketAgr=").append(marketAgr);
        sb.append(", firmCode=").append(firmCode);
        sb.append(", firmShortName=").append(firmShortName);
        sb.append(", joinDate=").append(joinDate);
        sb.append(", vatInvoicePr=").append(vatInvoicePr);
        sb.append(", vatInvoiceCity=").append(vatInvoiceCity);
        sb.append(", vatInvoiceDist=").append(vatInvoiceDist);
        sb.append(", vatInvoiceAddr=").append(vatInvoiceAddr);
        sb.append(", vatInvoiceTel=").append(vatInvoiceTel);
        sb.append(", vatInvoiceEntpType=").append(vatInvoiceEntpType);
        sb.append(", expiryDateStt=").append(expiryDateStt);
        sb.append(", expiryDateEnd=").append(expiryDateEnd);
        sb.append(", firmStatus=").append(firmStatus);
        sb.append(", qualFeeUrl=").append(qualFeeUrl);
        sb.append(", yearProcessing=").append(yearProcessing);
        sb.append(", yearExpendQty=").append(yearExpendQty);
        sb.append(", haspQty=").append(haspQty);
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