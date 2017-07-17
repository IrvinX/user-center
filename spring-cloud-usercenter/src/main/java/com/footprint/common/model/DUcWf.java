package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcWf implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 审核来源
     */
    private Short auditSrc;

    /**
     * 账户转换类型
     */
    private Short changeType;

    /**
     * 流程状态
     */
    private Short wfStatus;

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
     * D_UC_WF
     */
    private static final long serialVersionUID = 1L;

    public DUcWf(String id, Short verid, Short auditSrc, Short changeType, Short wfStatus, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.auditSrc = auditSrc;
        this.changeType = changeType;
        this.wfStatus = wfStatus;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcWf() {
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
     * 审核来源
     * @return AUDIT_SRC 审核来源
     */
    public Short getAuditSrc() {
        return auditSrc;
    }

    /**
     * 审核来源
     * @param auditSrc 审核来源
     */
    public void setAuditSrc(Short auditSrc) {
        this.auditSrc = auditSrc;
    }

    /**
     * 账户转换类型
     * @return CHANGE_TYPE 账户转换类型
     */
    public Short getChangeType() {
        return changeType;
    }

    /**
     * 账户转换类型
     * @param changeType 账户转换类型
     */
    public void setChangeType(Short changeType) {
        this.changeType = changeType;
    }

    /**
     * 流程状态
     * @return WF_STATUS 流程状态
     */
    public Short getWfStatus() {
        return wfStatus;
    }

    /**
     * 流程状态
     * @param wfStatus 流程状态
     */
    public void setWfStatus(Short wfStatus) {
        this.wfStatus = wfStatus;
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
        sb.append(", auditSrc=").append(auditSrc);
        sb.append(", changeType=").append(changeType);
        sb.append(", wfStatus=").append(wfStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}