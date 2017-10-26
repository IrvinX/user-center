package irvin.api.domain;

import java.io.Serializable;

public class UcUserRole implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户基础信息 ID
     */
    private String userBasicId;

    /**
     * 角色 ID
     */
    private String roleId;

    /**
     * 关系状态
     */
    private Integer status;

    /**
     * uc_user_role
     */
    private static final long serialVersionUID = 1L;

    public UcUserRole(String id, String userBasicId, String roleId, Integer status) {
        this.id = id;
        this.userBasicId = userBasicId;
        this.roleId = roleId;
        this.status = status;
    }

    public UcUserRole() {
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
     * 用户基础信息 ID
     * @return user_basic_id 用户基础信息 ID
     */
    public String getUserBasicId() {
        return userBasicId;
    }

    /**
     * 用户基础信息 ID
     * @param userBasicId 用户基础信息 ID
     */
    public void setUserBasicId(String userBasicId) {
        this.userBasicId = userBasicId == null ? null : userBasicId.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userBasicId=").append(userBasicId);
        sb.append(", roleId=").append(roleId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}