package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcPerson implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Short sex;

    /**
     * 出生年月
     */
    private Date birthday;

    /**
     * 身份证类型
     */
    private Short identityType;

    /**
     * 身份证号码
     */
    private String identityId;

    /**
     * 身份证图片URL
     */
    private String identityUrl;

    /**
     * 个人照片URL
     */
    private String photoUrl;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 传真
     */
    private String fax;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 地址
     */
    private String address;

    /**
     * 人员状态
     */
    private Short personStatus;

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
     * D_UC_PERSON
     */
    private static final long serialVersionUID = 1L;

    public DUcPerson(String id, Short verid, String name, Short sex, Date birthday, Short identityType, String identityId, String identityUrl, String photoUrl, String tel, String mobile, String fax, String mail, String province, String city, String district, String address, Short personStatus, String memo, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.identityType = identityType;
        this.identityId = identityId;
        this.identityUrl = identityUrl;
        this.photoUrl = photoUrl;
        this.tel = tel;
        this.mobile = mobile;
        this.fax = fax;
        this.mail = mail;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.personStatus = personStatus;
        this.memo = memo;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcPerson() {
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
     * 姓名
     * @return NAME 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 性别
     * @return SEX 性别
     */
    public Short getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * 出生年月
     * @return BIRTHDAY 出生年月
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 出生年月
     * @param birthday 出生年月
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 身份证类型
     * @return IDENTITY_TYPE 身份证类型
     */
    public Short getIdentityType() {
        return identityType;
    }

    /**
     * 身份证类型
     * @param identityType 身份证类型
     */
    public void setIdentityType(Short identityType) {
        this.identityType = identityType;
    }

    /**
     * 身份证号码
     * @return IDENTITY_ID 身份证号码
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 身份证号码
     * @param identityId 身份证号码
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId == null ? null : identityId.trim();
    }

    /**
     * 身份证图片URL
     * @return IDENTITY_URL 身份证图片URL
     */
    public String getIdentityUrl() {
        return identityUrl;
    }

    /**
     * 身份证图片URL
     * @param identityUrl 身份证图片URL
     */
    public void setIdentityUrl(String identityUrl) {
        this.identityUrl = identityUrl == null ? null : identityUrl.trim();
    }

    /**
     * 个人照片URL
     * @return PHOTO_URL 个人照片URL
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 个人照片URL
     * @param photoUrl 个人照片URL
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
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
     * 传真
     * @return FAX 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 传真
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
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
     * 省
     * @return PROVINCE 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 市
     * @return CITY 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区
     * @return DISTRICT 区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 区
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 地址
     * @return ADDRESS 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", identityType=").append(identityType);
        sb.append(", identityId=").append(identityId);
        sb.append(", identityUrl=").append(identityUrl);
        sb.append(", photoUrl=").append(photoUrl);
        sb.append(", tel=").append(tel);
        sb.append(", mobile=").append(mobile);
        sb.append(", fax=").append(fax);
        sb.append(", mail=").append(mail);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", personStatus=").append(personStatus);
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