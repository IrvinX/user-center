package irvin.api.domain;

import java.io.Serializable;

public class UcUserExternal implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户基础信息 ID
     */
    private String userBasicId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 
     */
    private Integer version;

    /**
     * uc_user_external
     */
    private static final long serialVersionUID = 1L;

    public UcUserExternal(String id, String userBasicId, Integer status, Integer version) {
        this.id = id;
        this.userBasicId = userBasicId;
        this.status = status;
        this.version = version;
    }

    public UcUserExternal() {
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
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
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
        sb.append(", userBasicId=").append(userBasicId);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}