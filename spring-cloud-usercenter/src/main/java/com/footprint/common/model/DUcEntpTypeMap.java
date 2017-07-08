package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcEntpTypeMap implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 企业ID
     */
    private String entpId;

    /**
     * 企业类型
     */
    private Short entpType;

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
     * D_UC_ENTP_TYPE_MAP
     */
    private static final long serialVersionUID = 1L;

    public DUcEntpTypeMap(String id, String entpId, Short entpType, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.entpId = entpId;
        this.entpType = entpType;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcEntpTypeMap() {
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
     * 企业类型
     * @return ENTP_TYPE 企业类型
     */
    public Short getEntpType() {
        return entpType;
    }

    /**
     * 企业类型
     * @param entpType 企业类型
     */
    public void setEntpType(Short entpType) {
        this.entpType = entpType;
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
        sb.append(", entpId=").append(entpId);
        sb.append(", entpType=").append(entpType);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}