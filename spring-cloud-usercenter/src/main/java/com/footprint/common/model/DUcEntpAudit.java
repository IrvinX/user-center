package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcEntpAudit implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 流程ID
     */
    private String wfId;

    /**
     * 审核阶段
     */
    private Short auditStage;

    /**
     * 审核类型
     */
    private Short auditType;

    /**
     * 审核状态
     */
    private Short auditStatus;

    /**
     * 审核意见
     */
    private String auditMemo;

    /**
     * 审核人
     */
    private String auditMan;

    /**
     * 审核时间
     */
    private Date auditDate;

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
     * D_UC_ENTP_AUDIT
     */
    private static final long serialVersionUID = 1L;

    public DUcEntpAudit(String id, Short verid, String wfId, Short auditStage, Short auditType, Short auditStatus, String auditMemo, String auditMan, Date auditDate, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.wfId = wfId;
        this.auditStage = auditStage;
        this.auditType = auditType;
        this.auditStatus = auditStatus;
        this.auditMemo = auditMemo;
        this.auditMan = auditMan;
        this.auditDate = auditDate;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcEntpAudit() {
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
     * 流程ID
     * @return WF_ID 流程ID
     */
    public String getWfId() {
        return wfId;
    }

    /**
     * 流程ID
     * @param wfId 流程ID
     */
    public void setWfId(String wfId) {
        this.wfId = wfId == null ? null : wfId.trim();
    }

    /**
     * 审核阶段
     * @return AUDIT_STAGE 审核阶段
     */
    public Short getAuditStage() {
        return auditStage;
    }

    /**
     * 审核阶段
     * @param auditStage 审核阶段
     */
    public void setAuditStage(Short auditStage) {
        this.auditStage = auditStage;
    }

    /**
     * 审核类型
     * @return AUDIT_TYPE 审核类型
     */
    public Short getAuditType() {
        return auditType;
    }

    /**
     * 审核类型
     * @param auditType 审核类型
     */
    public void setAuditType(Short auditType) {
        this.auditType = auditType;
    }

    /**
     * 审核状态
     * @return AUDIT_STATUS 审核状态
     */
    public Short getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态
     * @param auditStatus 审核状态
     */
    public void setAuditStatus(Short auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 审核意见
     * @return AUDIT_MEMO 审核意见
     */
    public String getAuditMemo() {
        return auditMemo;
    }

    /**
     * 审核意见
     * @param auditMemo 审核意见
     */
    public void setAuditMemo(String auditMemo) {
        this.auditMemo = auditMemo == null ? null : auditMemo.trim();
    }

    /**
     * 审核人
     * @return AUDIT_MAN 审核人
     */
    public String getAuditMan() {
        return auditMan;
    }

    /**
     * 审核人
     * @param auditMan 审核人
     */
    public void setAuditMan(String auditMan) {
        this.auditMan = auditMan == null ? null : auditMan.trim();
    }

    /**
     * 审核时间
     * @return AUDIT_DATE 审核时间
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * 审核时间
     * @param auditDate 审核时间
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
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
        sb.append(", wfId=").append(wfId);
        sb.append(", auditStage=").append(auditStage);
        sb.append(", auditType=").append(auditType);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", auditMemo=").append(auditMemo);
        sb.append(", auditMan=").append(auditMan);
        sb.append(", auditDate=").append(auditDate);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}