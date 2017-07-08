package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcEntpAuditHis extends DUcEntpAuditHisKey implements Serializable {
    /**
     * 企业ID
     */
    private String entpId;

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
     * 最新数据标志
     */
    private Short latestFlg;

    /**
     * 审核前数据ID
     */
    private String auditPreId;

    /**
     * 审核前数据版本ID
     */
    private Short auditPreVerid;

    /**
     * 待审核数据ID
     */
    private String auditWaitId;

    /**
     * 待审核数据版本ID
     */
    private Short auditWaitVerid;

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
     * D_UC_ENTP_AUDIT_HIS
     */
    private static final long serialVersionUID = 1L;

    public DUcEntpAuditHis(String id, Short verid, String entpId, Short auditType, Short auditStatus, String auditMemo, String auditMan, Date auditDate, Short latestFlg, String auditPreId, Short auditPreVerid, String auditWaitId, Short auditWaitVerid, Date createtime, String createuser, Date updatetime, String updateuser) {
        super(id, verid);
        this.entpId = entpId;
        this.auditType = auditType;
        this.auditStatus = auditStatus;
        this.auditMemo = auditMemo;
        this.auditMan = auditMan;
        this.auditDate = auditDate;
        this.latestFlg = latestFlg;
        this.auditPreId = auditPreId;
        this.auditPreVerid = auditPreVerid;
        this.auditWaitId = auditWaitId;
        this.auditWaitVerid = auditWaitVerid;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcEntpAuditHis() {
        super();
    }

    /**
     * 企业ID
     * @return ENTP_ID 企业ID
     */
    public String getEntpId() {
        return entpId;
    }

    /**
     * 企业ID
     * @param entpId 企业ID
     */
    public void setEntpId(String entpId) {
        this.entpId = entpId == null ? null : entpId.trim();
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
     * 最新数据标志
     * @return LATEST_FLG 最新数据标志
     */
    public Short getLatestFlg() {
        return latestFlg;
    }

    /**
     * 最新数据标志
     * @param latestFlg 最新数据标志
     */
    public void setLatestFlg(Short latestFlg) {
        this.latestFlg = latestFlg;
    }

    /**
     * 审核前数据ID
     * @return AUDIT_PRE_ID 审核前数据ID
     */
    public String getAuditPreId() {
        return auditPreId;
    }

    /**
     * 审核前数据ID
     * @param auditPreId 审核前数据ID
     */
    public void setAuditPreId(String auditPreId) {
        this.auditPreId = auditPreId == null ? null : auditPreId.trim();
    }

    /**
     * 审核前数据版本ID
     * @return AUDIT_PRE_VERID 审核前数据版本ID
     */
    public Short getAuditPreVerid() {
        return auditPreVerid;
    }

    /**
     * 审核前数据版本ID
     * @param auditPreVerid 审核前数据版本ID
     */
    public void setAuditPreVerid(Short auditPreVerid) {
        this.auditPreVerid = auditPreVerid;
    }

    /**
     * 待审核数据ID
     * @return AUDIT_WAIT_ID 待审核数据ID
     */
    public String getAuditWaitId() {
        return auditWaitId;
    }

    /**
     * 待审核数据ID
     * @param auditWaitId 待审核数据ID
     */
    public void setAuditWaitId(String auditWaitId) {
        this.auditWaitId = auditWaitId == null ? null : auditWaitId.trim();
    }

    /**
     * 待审核数据版本ID
     * @return AUDIT_WAIT_VERID 待审核数据版本ID
     */
    public Short getAuditWaitVerid() {
        return auditWaitVerid;
    }

    /**
     * 待审核数据版本ID
     * @param auditWaitVerid 待审核数据版本ID
     */
    public void setAuditWaitVerid(Short auditWaitVerid) {
        this.auditWaitVerid = auditWaitVerid;
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
        sb.append(", entpId=").append(entpId);
        sb.append(", auditType=").append(auditType);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", auditMemo=").append(auditMemo);
        sb.append(", auditMan=").append(auditMan);
        sb.append(", auditDate=").append(auditDate);
        sb.append(", latestFlg=").append(latestFlg);
        sb.append(", auditPreId=").append(auditPreId);
        sb.append(", auditPreVerid=").append(auditPreVerid);
        sb.append(", auditWaitId=").append(auditWaitId);
        sb.append(", auditWaitVerid=").append(auditWaitVerid);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}