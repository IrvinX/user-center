package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcPermission implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 系统ID
     */
    private String sysId;

    /**
     * 父节点
     */
    private String pid;

    /**
     * 权限排序
     */
    private Short pOrder;

    /**
     * 图标
     */
    private String icon;

    /**
     * 权限所属
     */
    private Short pBelone;

    /**
     * 权限分类
     */
    private Short pType;

    /**
     * 排列顺序
     */
    private Short orderTurn;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 描述表达式
     */
    private String expression;

    /**
     * 权限URL
     */
    private String pUrl;

    /**
     * 权限分配标志
     */
    private Short assignmentFlag;

    /**
     * 权限状态
     */
    private Short status;

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
     * D_UC_PERMISSION
     */
    private static final long serialVersionUID = 1L;

    public DUcPermission(String id, Short verid, String sysId, String pid, Short pOrder, String icon, Short pBelone, Short pType, Short orderTurn, String permissionName, String expression, String pUrl, Short assignmentFlag, Short status, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.sysId = sysId;
        this.pid = pid;
        this.pOrder = pOrder;
        this.icon = icon;
        this.pBelone = pBelone;
        this.pType = pType;
        this.orderTurn = orderTurn;
        this.permissionName = permissionName;
        this.expression = expression;
        this.pUrl = pUrl;
        this.assignmentFlag = assignmentFlag;
        this.status = status;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcPermission() {
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
     * 系统ID
     * @return SYS_ID 系统ID
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * 系统ID
     * @param sysId 系统ID
     */
    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    /**
     * 父节点
     * @return PID 父节点
     */
    public String getPid() {
        return pid;
    }

    /**
     * 父节点
     * @param pid 父节点
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * 权限排序
     * @return P_ORDER 权限排序
     */
    public Short getpOrder() {
        return pOrder;
    }

    /**
     * 权限排序
     * @param pOrder 权限排序
     */
    public void setpOrder(Short pOrder) {
        this.pOrder = pOrder;
    }

    /**
     * 图标
     * @return ICON 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 权限所属
     * @return P_BELONE 权限所属
     */
    public Short getpBelone() {
        return pBelone;
    }

    /**
     * 权限所属
     * @param pBelone 权限所属
     */
    public void setpBelone(Short pBelone) {
        this.pBelone = pBelone;
    }

    /**
     * 权限分类
     * @return P_TYPE 权限分类
     */
    public Short getpType() {
        return pType;
    }

    /**
     * 权限分类
     * @param pType 权限分类
     */
    public void setpType(Short pType) {
        this.pType = pType;
    }

    /**
     * 排列顺序
     * @return ORDER_TURN 排列顺序
     */
    public Short getOrderTurn() {
        return orderTurn;
    }

    /**
     * 排列顺序
     * @param orderTurn 排列顺序
     */
    public void setOrderTurn(Short orderTurn) {
        this.orderTurn = orderTurn;
    }

    /**
     * 权限名称
     * @return PERMISSION_NAME 权限名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 权限名称
     * @param permissionName 权限名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * 描述表达式
     * @return EXPRESSION 描述表达式
     */
    public String getExpression() {
        return expression;
    }

    /**
     * 描述表达式
     * @param expression 描述表达式
     */
    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    /**
     * 权限URL
     * @return P_URL 权限URL
     */
    public String getpUrl() {
        return pUrl;
    }

    /**
     * 权限URL
     * @param pUrl 权限URL
     */
    public void setpUrl(String pUrl) {
        this.pUrl = pUrl == null ? null : pUrl.trim();
    }

    /**
     * 权限分配标志
     * @return ASSIGNMENT_FLAG 权限分配标志
     */
    public Short getAssignmentFlag() {
        return assignmentFlag;
    }

    /**
     * 权限分配标志
     * @param assignmentFlag 权限分配标志
     */
    public void setAssignmentFlag(Short assignmentFlag) {
        this.assignmentFlag = assignmentFlag;
    }

    /**
     * 权限状态
     * @return STATUS 权限状态
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 权限状态
     * @param status 权限状态
     */
    public void setStatus(Short status) {
        this.status = status;
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
        sb.append(", sysId=").append(sysId);
        sb.append(", pid=").append(pid);
        sb.append(", pOrder=").append(pOrder);
        sb.append(", icon=").append(icon);
        sb.append(", pBelone=").append(pBelone);
        sb.append(", pType=").append(pType);
        sb.append(", orderTurn=").append(orderTurn);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", expression=").append(expression);
        sb.append(", pUrl=").append(pUrl);
        sb.append(", assignmentFlag=").append(assignmentFlag);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}