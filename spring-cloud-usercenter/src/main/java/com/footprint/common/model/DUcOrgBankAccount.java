package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcOrgBankAccount implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 组织ID
     */
    private String orgId;

    /**
     * 银行类型
     */
    private Short bankType;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 银行编码
     */
    private String bankCode;

    /**
     * 银行联系人姓名
     */
    private String cmName;

    /**
     * 银行联系电话
     */
    private String bankTel;

    /**
     * 银行联系手机
     */
    private String bankMobile;

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
     * D_UC_ORG_BANK_ACCOUNT
     */
    private static final long serialVersionUID = 1L;

    public DUcOrgBankAccount(String id, Short verid, String orgId, Short bankType, String bankName, String bankAccount, String bankCode, String cmName, String bankTel, String bankMobile, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.orgId = orgId;
        this.bankType = bankType;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.bankCode = bankCode;
        this.cmName = cmName;
        this.bankTel = bankTel;
        this.bankMobile = bankMobile;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcOrgBankAccount() {
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
     * 组织ID
     * @return ORG_ID 组织ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 组织ID
     * @param orgId 组织ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 银行类型
     * @return BANK_TYPE 银行类型
     */
    public Short getBankType() {
        return bankType;
    }

    /**
     * 银行类型
     * @param bankType 银行类型
     */
    public void setBankType(Short bankType) {
        this.bankType = bankType;
    }

    /**
     * 银行名称
     * @return BANK_NAME 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 银行名称
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 银行账号
     * @return BANK_ACCOUNT 银行账号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 银行账号
     * @param bankAccount 银行账号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * 银行编码
     * @return BANK_CODE 银行编码
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 银行编码
     * @param bankCode 银行编码
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * 银行联系人姓名
     * @return CM_NAME 银行联系人姓名
     */
    public String getCmName() {
        return cmName;
    }

    /**
     * 银行联系人姓名
     * @param cmName 银行联系人姓名
     */
    public void setCmName(String cmName) {
        this.cmName = cmName == null ? null : cmName.trim();
    }

    /**
     * 银行联系电话
     * @return BANK_TEL 银行联系电话
     */
    public String getBankTel() {
        return bankTel;
    }

    /**
     * 银行联系电话
     * @param bankTel 银行联系电话
     */
    public void setBankTel(String bankTel) {
        this.bankTel = bankTel == null ? null : bankTel.trim();
    }

    /**
     * 银行联系手机
     * @return BANK_MOBILE 银行联系手机
     */
    public String getBankMobile() {
        return bankMobile;
    }

    /**
     * 银行联系手机
     * @param bankMobile 银行联系手机
     */
    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile == null ? null : bankMobile.trim();
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
        sb.append(", orgId=").append(orgId);
        sb.append(", bankType=").append(bankType);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", cmName=").append(cmName);
        sb.append(", bankTel=").append(bankTel);
        sb.append(", bankMobile=").append(bankMobile);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}