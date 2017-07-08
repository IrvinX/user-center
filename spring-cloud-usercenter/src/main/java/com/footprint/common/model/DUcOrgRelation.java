package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcOrgRelation implements Serializable {
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
     * 父节点
     */
    private String pid;

    /**
     * 顺序
     */
    private Short nodeOrder;

    /**
     * 节点标识
     */
    private Short nodeFlg;

    /**
     * 节点类型
     */
    private Short nodeType;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 节点描述
     */
    private String nodeDesc;

    /**
     * 图标
     */
    private String icon;

    /**
     * 备注
     */
    private String memo;

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
     * D_UC_ORG_RELATION
     */
    private static final long serialVersionUID = 1L;

    public DUcOrgRelation(String id, Short verid, String orgId, String pid, Short nodeOrder, Short nodeFlg, Short nodeType, String nodeName, String nodeDesc, String icon, String memo, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.orgId = orgId;
        this.pid = pid;
        this.nodeOrder = nodeOrder;
        this.nodeFlg = nodeFlg;
        this.nodeType = nodeType;
        this.nodeName = nodeName;
        this.nodeDesc = nodeDesc;
        this.icon = icon;
        this.memo = memo;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcOrgRelation() {
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
     * 顺序
     * @return NODE_ORDER 顺序
     */
    public Short getNodeOrder() {
        return nodeOrder;
    }

    /**
     * 顺序
     * @param nodeOrder 顺序
     */
    public void setNodeOrder(Short nodeOrder) {
        this.nodeOrder = nodeOrder;
    }

    /**
     * 节点标识
     * @return NODE_FLG 节点标识
     */
    public Short getNodeFlg() {
        return nodeFlg;
    }

    /**
     * 节点标识
     * @param nodeFlg 节点标识
     */
    public void setNodeFlg(Short nodeFlg) {
        this.nodeFlg = nodeFlg;
    }

    /**
     * 节点类型
     * @return NODE_TYPE 节点类型
     */
    public Short getNodeType() {
        return nodeType;
    }

    /**
     * 节点类型
     * @param nodeType 节点类型
     */
    public void setNodeType(Short nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * 节点名称
     * @return NODE_NAME 节点名称
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * 节点名称
     * @param nodeName 节点名称
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    /**
     * 节点描述
     * @return NODE_DESC 节点描述
     */
    public String getNodeDesc() {
        return nodeDesc;
    }

    /**
     * 节点描述
     * @param nodeDesc 节点描述
     */
    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc == null ? null : nodeDesc.trim();
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
     * 备注
     * @return MEMO 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 备注
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
        sb.append(", pid=").append(pid);
        sb.append(", nodeOrder=").append(nodeOrder);
        sb.append(", nodeFlg=").append(nodeFlg);
        sb.append(", nodeType=").append(nodeType);
        sb.append(", nodeName=").append(nodeName);
        sb.append(", nodeDesc=").append(nodeDesc);
        sb.append(", icon=").append(icon);
        sb.append(", memo=").append(memo);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}