package irvin.api.domain;

import java.io.Serializable;

public class UcRolePermission implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 角色 ID
     */
    private String roleId;

    /**
     * 权限 ID
     */
    private String permissionId;

    /**
     * 关系状态
     */
    private Integer status;

    /**
     * 
     */
    private Integer version;

    /**
     * uc_role_permission
     */
    private static final long serialVersionUID = 1L;

    public UcRolePermission(String id, String roleId, String permissionId, Integer status, Integer version) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.status = status;
        this.version = version;
    }

    public UcRolePermission() {
        super();
    }

    /**
     * 主键
     * @return id 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 角色 ID
     * @return role_id 角色 ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色 ID
     * @param roleId 角色 ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 权限 ID
     * @return permission_id 权限 ID
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 权限 ID
     * @param permissionId 权限 ID
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    /**
     * 关系状态
     * @return status 关系状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 关系状态
     * @param status 关系状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return version 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}