package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcOrgPerson implements Serializable {
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
     * 人员ID
     */
    private String personId;

    /**
     * 企业人员类型
     */
    private Short entpPersonType;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 职务信息
     */
    private String position;

    /**
     * 人员状态
     */
    private Short personStatus;

    /**
     * 备注
     */
    private String memo;

    /**
     * 有效期开始
     */
    private Date expiryDateStt;

    /**
     * 有效期结束
     */
    private Date expiryDateEnd;

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
     * D_UC_ORG_PERSON
     */
    private static final long serialVersionUID = 1L;

    public DUcOrgPerson(String id, Short verid, String orgId, String personId, Short entpPersonType, String tel, String mobile, String mail, String position, Short personStatus, String memo, Date expiryDateStt, Date expiryDateEnd, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.orgId = orgId;
        this.personId = personId;
        this.entpPersonType = entpPersonType;
        this.tel = tel;
        this.mobile = mobile;
        this.mail = mail;
        this.position = position;
        this.personStatus = personStatus;
        this.memo = memo;
        this.expiryDateStt = expiryDateStt;
        this.expiryDateEnd = expiryDateEnd;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcOrgPerson() {
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
     * 企业人员类型
     * @return ENTP_PERSON_TYPE 企业人员类型
     */
    public Short getEntpPersonType() {
        return entpPersonType;
    }

    /**
     * 企业人员类型
     * @param entpPersonType 企业人员类型
     */
    public void setEntpPersonType(Short entpPersonType) {
        this.entpPersonType = entpPersonType;
    }

    /**
     * 联系电话
     * @return TEL 联系电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 联系电话
     * @param tel 联系电话
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 手机
     * @return MOBILE 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 邮箱
     * @return MAIL 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 邮箱
     * @param mail 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * 职务信息
     * @return POSITION 职务信息
     */
    public String getPosition() {
        return position;
    }

    /**
     * 职务信息
     * @param position 职务信息
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 人员状态
     * @return PERSON_STATUS 人员状态
     */
    public Short getPersonStatus() {
        return personStatus;
    }

    /**
     * 人员状态
     * @param personStatus 人员状态
     */
    public void setPersonStatus(Short personStatus) {
        this.personStatus = personStatus;
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
        sb.append(", personId=").append(personId);
        sb.append(", entpPersonType=").append(entpPersonType);
        sb.append(", tel=").append(tel);
        sb.append(", mobile=").append(mobile);
        sb.append(", mail=").append(mail);
        sb.append(", position=").append(position);
        sb.append(", personStatus=").append(personStatus);
        sb.append(", memo=").append(memo);
        sb.append(", expiryDateStt=").append(expiryDateStt);
        sb.append(", expiryDateEnd=").append(expiryDateEnd);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}