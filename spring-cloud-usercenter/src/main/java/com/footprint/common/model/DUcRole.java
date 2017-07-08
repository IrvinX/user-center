package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcRole implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色标识
     */
    private String roleSign;

    /**
     * 角色分类
     */
    private Short roleType;

    /**
     * 角色属性
     */
    private Short roleProperty;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 角色排序
     */
    private Short roleOrder;

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
     * D_UC_ROLE
     */
    private static final long serialVersionUID = 1L;

    public DUcRole(String id, Short verid, String roleName, String roleSign, Short roleType, Short roleProperty, String roleDesc, Short roleOrder, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.roleName = roleName;
        this.roleSign = roleSign;
        this.roleType = roleType;
        this.roleProperty = roleProperty;
        this.roleDesc = roleDesc;
        this.roleOrder = roleOrder;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcRole() {
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
     * 角色名称
     * @return ROLE_NAME 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色标识
     * @return ROLE_SIGN 角色标识
     */
    public String getRoleSign() {
        return roleSign;
    }

    /**
     * 角色标识
     * @param roleSign 角色标识
     */
    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign == null ? null : roleSign.trim();
    }

    /**
     * 角色分类
     * @return ROLE_TYPE 角色分类
     */
    public Short getRoleType() {
        return roleType;
    }

    /**
     * 角色分类
     * @param roleType 角色分类
     */
    public void setRoleType(Short roleType) {
        this.roleType = roleType;
    }

    /**
     * 角色属性
     * @return ROLE_PROPERTY 角色属性
     */
    public Short getRoleProperty() {
        return roleProperty;
    }

    /**
     * 角色属性
     * @param roleProperty 角色属性
     */
    public void setRoleProperty(Short roleProperty) {
        this.roleProperty = roleProperty;
    }

    /**
     * 角色描述
     * @return ROLE_DESC 角色描述
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * 角色描述
     * @param roleDesc 角色描述
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * 角色排序
     * @return ROLE_ORDER 角色排序
     */
    public Short getRoleOrder() {
        return roleOrder;
    }

    /**
     * 角色排序
     * @param roleOrder 角色排序
     */
    public void setRoleOrder(Short roleOrder) {
        this.roleOrder = roleOrder;
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
        sb.append(", roleName=").append(roleName);
        sb.append(", roleSign=").append(roleSign);
        sb.append(", roleType=").append(roleType);
        sb.append(", roleProperty=").append(roleProperty);
        sb.append(", roleDesc=").append(roleDesc);
        sb.append(", roleOrder=").append(roleOrder);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}