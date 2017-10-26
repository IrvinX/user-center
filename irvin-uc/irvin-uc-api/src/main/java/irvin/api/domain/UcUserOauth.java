package irvin.api.domain;

import java.io.Serializable;

public class UcUserOauth implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户基础信息 ID
     */
    private String userBasicId;

    /**
     * 账号类型
     */
    private Integer accountType;

    /**
     * 账号
     */
    private String account;

    /**
     * 账号状态
     */
    private Integer status;

    /**
     * uc_user_oauth
     */
    private static final long serialVersionUID = 1L;

    public UcUserOauth(String id, String userBasicId, Integer accountType, String account, Integer status) {
        this.id = id;
        this.userBasicId = userBasicId;
        this.accountType = accountType;
        this.account = account;
        this.status = status;
    }

    public UcUserOauth() {
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
     * 账号类型
     * @return account_type 账号类型
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 账号类型
     * @param accountType 账号类型
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 账号
     * @return account 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 账号
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 账号状态
     * @return status 账号状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 账号状态
     * @param status 账号状态
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
        sb.append(", accountType=").append(accountType);
        sb.append(", account=").append(account);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}