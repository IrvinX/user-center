package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcOrg implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 组织类型
     */
    private Short orgType;

    /**
     * 虚拟标志
     */
    private Short virtualFlg;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 组织简称
     */
    private String orgShortName;

    /**
     * 组织英文名
     */
    private String orgNameEng;

    /**
     * 组织英文名简称
     */
    private String orgShortNameEng;

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
     * D_UC_ORG
     */
    private static final long serialVersionUID = 1L;

    public DUcOrg(String id, Short verid, Short orgType, Short virtualFlg, String orgName, String orgShortName, String orgNameEng, String orgShortNameEng, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.orgType = orgType;
        this.virtualFlg = virtualFlg;
        this.orgName = orgName;
        this.orgShortName = orgShortName;
        this.orgNameEng = orgNameEng;
        this.orgShortNameEng = orgShortNameEng;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcOrg() {
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
     * 组织类型
     * @return ORG_TYPE 组织类型
     */
    public Short getOrgType() {
        return orgType;
    }

    /**
     * 组织类型
     * @param orgType 组织类型
     */
    public void setOrgType(Short orgType) {
        this.orgType = orgType;
    }

    /**
     * 虚拟标志
     * @return VIRTUAL_FLG 虚拟标志
     */
    public Short getVirtualFlg() {
        return virtualFlg;
    }

    /**
     * 虚拟标志
     * @param virtualFlg 虚拟标志
     */
    public void setVirtualFlg(Short virtualFlg) {
        this.virtualFlg = virtualFlg;
    }

    /**
     * 组织名称
     * @return ORG_NAME 组织名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 组织名称
     * @param orgName 组织名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 组织简称
     * @return ORG_SHORT_NAME 组织简称
     */
    public String getOrgShortName() {
        return orgShortName;
    }

    /**
     * 组织简称
     * @param orgShortName 组织简称
     */
    public void setOrgShortName(String orgShortName) {
        this.orgShortName = orgShortName == null ? null : orgShortName.trim();
    }

    /**
     * 组织英文名
     * @return ORG_NAME_ENG 组织英文名
     */
    public String getOrgNameEng() {
        return orgNameEng;
    }

    /**
     * 组织英文名
     * @param orgNameEng 组织英文名
     */
    public void setOrgNameEng(String orgNameEng) {
        this.orgNameEng = orgNameEng == null ? null : orgNameEng.trim();
    }

    /**
     * 组织英文名简称
     * @return ORG_SHORT_NAME_ENG 组织英文名简称
     */
    public String getOrgShortNameEng() {
        return orgShortNameEng;
    }

    /**
     * 组织英文名简称
     * @param orgShortNameEng 组织英文名简称
     */
    public void setOrgShortNameEng(String orgShortNameEng) {
        this.orgShortNameEng = orgShortNameEng == null ? null : orgShortNameEng.trim();
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
        sb.append(", orgType=").append(orgType);
        sb.append(", virtualFlg=").append(virtualFlg);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgShortName=").append(orgShortName);
        sb.append(", orgNameEng=").append(orgNameEng);
        sb.append(", orgShortNameEng=").append(orgShortNameEng);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}