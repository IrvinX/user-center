package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcOrgUser implements Serializable {
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
     * 用户ID
     */
    private String userId;

    /**
     * 状态
     */
    private Short status;

    /**
     * 有效期开始
     */
    private Date expiryDateStt;

    /**
     * 有效期结束
     */
    private Date expiryDateEnd;

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
     * D_UC_ORG_USER
     */
    private static final long serialVersionUID = 1L;

    public DUcOrgUser(String id, Short verid, String orgId, String userId, Short status, Date expiryDateStt, Date expiryDateEnd, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.orgId = orgId;
        this.userId = userId;
        this.status = status;
        this.expiryDateStt = expiryDateStt;
        this.expiryDateEnd = expiryDateEnd;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcOrgUser() {
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
     * 用户ID
     * @return USER_ID 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 状态
     * @return STATUS 状态
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Short status) {
        this.status = status;
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
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", expiryDateStt=").append(expiryDateStt);
        sb.append(", expiryDateEnd=").append(expiryDateEnd);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}