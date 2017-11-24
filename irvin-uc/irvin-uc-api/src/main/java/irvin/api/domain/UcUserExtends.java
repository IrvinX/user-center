package irvin.api.domain;

import java.io.Serializable;

public class UcUserExtends implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 密码
     */
    private String password;

    /**
     * salt
     */
    private String salt;

    /**
     * 用户基础信息表 ID
     */
    private String userBasicId;

    /**
     * 用户类型(外部用户/后台用户)
     */
    private Integer type;

    /**
     * 
     */
    private Integer version;

    /**
     * uc_user_extends
     */
    private static final long serialVersionUID = 1L;

    public UcUserExtends(String id, String password, String salt, String userBasicId, Integer type, Integer version) {
        this.id = id;
        this.password = password;
        this.salt = salt;
        this.userBasicId = userBasicId;
        this.type = type;
        this.version = version;
    }

    public UcUserExtends() {
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
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * salt
     * @return salt salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * salt
     * @param salt salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 用户基础信息表 ID
     * @return user_basic_id 用户基础信息表 ID
     */
    public String getUserBasicId() {
        return userBasicId;
    }

    /**
     * 用户基础信息表 ID
     * @param userBasicId 用户基础信息表 ID
     */
    public void setUserBasicId(String userBasicId) {
        this.userBasicId = userBasicId == null ? null : userBasicId.trim();
    }

    /**
     * 用户类型(外部用户/后台用户)
     * @return type 用户类型(外部用户/后台用户)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 用户类型(外部用户/后台用户)
     * @param type 用户类型(外部用户/后台用户)
     */
    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", userBasicId=").append(userBasicId);
        sb.append(", type=").append(type);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}