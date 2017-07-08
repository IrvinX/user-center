package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcUser implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本
     */
    private Short verid;

    /**
     * 人员ID
     */
    private String personId;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 用户名
     */
    private String userNm;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否修改密码
     */
    private Short forceChangePwd;

    /**
     * 企业超级管理员
     */
    private Short entpSuperAdmin;

    /**
     * 用户状态
     */
    private Short userStatus;

    /**
     * 用户类型
     */
    private Short userType;

    /**
     * 是否启用KEY
     */
    private Short enableKey;

    /**
     * KEY码
     */
    private String keycode;

    /**
     * 用户来源
     */
    private Short userOrigin;

    /**
     * 是否需要完善信息
     */
    private Short perfectUserInfo;

    /**
     * 新旧密码
     */
    private Short newOldPwd;

    /**
     * 有效期开始
     */
    private Date expiryDateStt;

    /**
     * 有效期结束
     */
    private Date expiryDateEnd;

    /**
     * 账户安全问题
     */
    private String accountQuestion;

    /**
     * 账户安全问题答案
     */
    private String questionAnswer;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 创建者
     */
    private String createuserid;

    /**
     * 更新时间
     */
    private Date updatedate;

    /**
     * 更新者
     */
    private String updateuserid;

    /**
     * D_UC_USER
     */
    private static final long serialVersionUID = 1L;

    public DUcUser(String id, Short verid, String personId, String salt, String userNm, String password, Short forceChangePwd, Short entpSuperAdmin, Short userStatus, Short userType, Short enableKey, String keycode, Short userOrigin, Short perfectUserInfo, Short newOldPwd, Date expiryDateStt, Date expiryDateEnd, String accountQuestion, String questionAnswer, Date createdate, String createuserid, Date updatedate, String updateuserid) {
        this.id = id;
        this.verid = verid;
        this.personId = personId;
        this.salt = salt;
        this.userNm = userNm;
        this.password = password;
        this.forceChangePwd = forceChangePwd;
        this.entpSuperAdmin = entpSuperAdmin;
        this.userStatus = userStatus;
        this.userType = userType;
        this.enableKey = enableKey;
        this.keycode = keycode;
        this.userOrigin = userOrigin;
        this.perfectUserInfo = perfectUserInfo;
        this.newOldPwd = newOldPwd;
        this.expiryDateStt = expiryDateStt;
        this.expiryDateEnd = expiryDateEnd;
        this.accountQuestion = accountQuestion;
        this.questionAnswer = questionAnswer;
        this.createdate = createdate;
        this.createuserid = createuserid;
        this.updatedate = updatedate;
        this.updateuserid = updateuserid;
    }

    public DUcUser() {
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
     * 版本
     * @return VERID 版本
     */
    public Short getVerid() {
        return verid;
    }

    /**
     * 版本
     * @param verid 版本
     */
    public void setVerid(Short verid) {
        this.verid = verid;
    }

    /**
     * 人员ID
     * @return PERSON_ID 人员ID
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 人员ID
     * @param personId 人员ID
     */
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    /**
     * 加密盐
     * @return SALT 加密盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 加密盐
     * @param salt 加密盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 用户名
     * @return USER_NM 用户名
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * 用户名
     * @param userNm 用户名
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm == null ? null : userNm.trim();
    }

    /**
     * 密码
     * @return PASSWORD 密码
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
     * 是否修改密码
     * @return FORCE_CHANGE_PWD 是否修改密码
     */
    public Short getForceChangePwd() {
        return forceChangePwd;
    }

    /**
     * 是否修改密码
     * @param forceChangePwd 是否修改密码
     */
    public void setForceChangePwd(Short forceChangePwd) {
        this.forceChangePwd = forceChangePwd;
    }

    /**
     * 企业超级管理员
     * @return ENTP_SUPER_ADMIN 企业超级管理员
     */
    public Short getEntpSuperAdmin() {
        return entpSuperAdmin;
    }

    /**
     * 企业超级管理员
     * @param entpSuperAdmin 企业超级管理员
     */
    public void setEntpSuperAdmin(Short entpSuperAdmin) {
        this.entpSuperAdmin = entpSuperAdmin;
    }

    /**
     * 用户状态
     * @return USER_STATUS 用户状态
     */
    public Short getUserStatus() {
        return userStatus;
    }

    /**
     * 用户状态
     * @param userStatus 用户状态
     */
    public void setUserStatus(Short userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 用户类型
     * @return USER_TYPE 用户类型
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * 用户类型
     * @param userType 用户类型
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * 是否启用KEY
     * @return ENABLE_KEY 是否启用KEY
     */
    public Short getEnableKey() {
        return enableKey;
    }

    /**
     * 是否启用KEY
     * @param enableKey 是否启用KEY
     */
    public void setEnableKey(Short enableKey) {
        this.enableKey = enableKey;
    }

    /**
     * KEY码
     * @return KEYCODE KEY码
     */
    public String getKeycode() {
        return keycode;
    }

    /**
     * KEY码
     * @param keycode KEY码
     */
    public void setKeycode(String keycode) {
        this.keycode = keycode == null ? null : keycode.trim();
    }

    /**
     * 用户来源
     * @return USER_ORIGIN 用户来源
     */
    public Short getUserOrigin() {
        return userOrigin;
    }

    /**
     * 用户来源
     * @param userOrigin 用户来源
     */
    public void setUserOrigin(Short userOrigin) {
        this.userOrigin = userOrigin;
    }

    /**
     * 是否需要完善信息
     * @return PERFECT_USER_INFO 是否需要完善信息
     */
    public Short getPerfectUserInfo() {
        return perfectUserInfo;
    }

    /**
     * 是否需要完善信息
     * @param perfectUserInfo 是否需要完善信息
     */
    public void setPerfectUserInfo(Short perfectUserInfo) {
        this.perfectUserInfo = perfectUserInfo;
    }

    /**
     * 新旧密码
     * @return NEW_OLD_PWD 新旧密码
     */
    public Short getNewOldPwd() {
        return newOldPwd;
    }

    /**
     * 新旧密码
     * @param newOldPwd 新旧密码
     */
    public void setNewOldPwd(Short newOldPwd) {
        this.newOldPwd = newOldPwd;
    }

    /**
     * 有效期开始
     * @return EXPIRY_DATE_STT 有效期开始
     */
    public Date getExpiryDateStt() {
        return expiryDateStt;
    }

    /**
     * 有效期开始
     * @param expiryDateStt 有效期开始
     */
    public void setExpiryDateStt(Date expiryDateStt) {
        this.expiryDateStt = expiryDateStt;
    }

    /**
     * 有效期结束
     * @return EXPIRY_DATE_END 有效期结束
     */
    public Date getExpiryDateEnd() {
        return expiryDateEnd;
    }

    /**
     * 有效期结束
     * @param expiryDateEnd 有效期结束
     */
    public void setExpiryDateEnd(Date expiryDateEnd) {
        this.expiryDateEnd = expiryDateEnd;
    }

    /**
     * 账户安全问题
     * @return ACCOUNT_QUESTION 账户安全问题
     */
    public String getAccountQuestion() {
        return accountQuestion;
    }

    /**
     * 账户安全问题
     * @param accountQuestion 账户安全问题
     */
    public void setAccountQuestion(String accountQuestion) {
        this.accountQuestion = accountQuestion == null ? null : accountQuestion.trim();
    }

    /**
     * 账户安全问题答案
     * @return QUESTION_ANSWER 账户安全问题答案
     */
    public String getQuestionAnswer() {
        return questionAnswer;
    }

    /**
     * 账户安全问题答案
     * @param questionAnswer 账户安全问题答案
     */
    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer == null ? null : questionAnswer.trim();
    }

    /**
     * 创建时间
     * @return CREATEDATE 创建时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 创建时间
     * @param createdate 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 创建者
     * @return CREATEUSERID 创建者
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * 创建者
     * @param createuserid 创建者
     */
    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    /**
     * 更新时间
     * @return UPDATEDATE 更新时间
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * 更新时间
     * @param updatedate 更新时间
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * 更新者
     * @return UPDATEUSERID 更新者
     */
    public String getUpdateuserid() {
        return updateuserid;
    }

    /**
     * 更新者
     * @param updateuserid 更新者
     */
    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", verid=").append(verid);
        sb.append(", personId=").append(personId);
        sb.append(", salt=").append(salt);
        sb.append(", userNm=").append(userNm);
        sb.append(", password=").append(password);
        sb.append(", forceChangePwd=").append(forceChangePwd);
        sb.append(", entpSuperAdmin=").append(entpSuperAdmin);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userType=").append(userType);
        sb.append(", enableKey=").append(enableKey);
        sb.append(", keycode=").append(keycode);
        sb.append(", userOrigin=").append(userOrigin);
        sb.append(", perfectUserInfo=").append(perfectUserInfo);
        sb.append(", newOldPwd=").append(newOldPwd);
        sb.append(", expiryDateStt=").append(expiryDateStt);
        sb.append(", expiryDateEnd=").append(expiryDateEnd);
        sb.append(", accountQuestion=").append(accountQuestion);
        sb.append(", questionAnswer=").append(questionAnswer);
        sb.append(", createdate=").append(createdate);
        sb.append(", createuserid=").append(createuserid);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", updateuserid=").append(updateuserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}