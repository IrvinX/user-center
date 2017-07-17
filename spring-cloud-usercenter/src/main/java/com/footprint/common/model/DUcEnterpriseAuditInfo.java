package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcEnterpriseAuditInfo implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 审核ID
     */
    private String auditId;

    /**
     * 企业ID
     */
    private String entpId;

    /**
     * 企业全称原
     */
    private String fullnameOld;

    /**
     * 企业全称
     */
    private String fullname;

    /**
     * 企业简称原
     */
    private String shortnameOld;

    /**
     * 企业简称
     */
    private String shortname;

    /**
     * 企业全称拼音原
     */
    private String fullnamePinyinOld;

    /**
     * 企业全称拼音
     */
    private String fullnamePinyin;

    /**
     * 法人_姓名原
     */
    private String lpNameOld;

    /**
     * 法人_姓名
     */
    private String lpName;

    /**
     * 法人身份证类型原
     */
    private Short identityTypeOld;

    /**
     * 法人身份证类型
     */
    private Short identityType;

    /**
     * 法人身份证号原
     */
    private String identityIdOld;

    /**
     * 法人身份证号
     */
    private String identityId;

    /**
     * 法人身份证URL原
     */
    private String identityUrlOld;

    /**
     * 法人身份证URL
     */
    private String identityUrl;

    /**
     * 组织机构代码证类型原
     */
    private Short orgTypeOld;

    /**
     * 组织机构代码证类型
     */
    private Short orgType;

    /**
     * 企业_组织机构代码证号原
     */
    private String compOrgnNumOld;

    /**
     * 企业_组织机构代码证号
     */
    private String compOrgnNum;

    /**
     * 企业_类型原
     */
    private Short compTypeOld;

    /**
     * 企业_类型
     */
    private Short compType;

    /**
     * 企业_所在地_省原
     */
    private String compProvinceOld;

    /**
     * 企业_所在地_省
     */
    private String compProvince;

    /**
     * 企业_所在地_市原
     */
    private String compCityOld;

    /**
     * 企业_所在地_市
     */
    private String compCity;

    /**
     * 企业_所在地_区原
     */
    private String compDistrictOld;

    /**
     * 企业_所在地_区
     */
    private String compDistrict;

    /**
     * 企业_街道地址原
     */
    private String compAddrOld;

    /**
     * 企业_街道地址
     */
    private String compAddr;

    /**
     * 营业执照URL原
     */
    private String businessLicenseUrlOld;

    /**
     * 营业执照URL
     */
    private String businessLicenseUrl;

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
     * D_UC_ENTERPRISE_AUDIT_INFO
     */
    private static final long serialVersionUID = 1L;

    public DUcEnterpriseAuditInfo(String id, Short verid, String auditId, String entpId, String fullnameOld, String fullname, String shortnameOld, String shortname, String fullnamePinyinOld, String fullnamePinyin, String lpNameOld, String lpName, Short identityTypeOld, Short identityType, String identityIdOld, String identityId, String identityUrlOld, String identityUrl, Short orgTypeOld, Short orgType, String compOrgnNumOld, String compOrgnNum, Short compTypeOld, Short compType, String compProvinceOld, String compProvince, String compCityOld, String compCity, String compDistrictOld, String compDistrict, String compAddrOld, String compAddr, String businessLicenseUrlOld, String businessLicenseUrl, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.auditId = auditId;
        this.entpId = entpId;
        this.fullnameOld = fullnameOld;
        this.fullname = fullname;
        this.shortnameOld = shortnameOld;
        this.shortname = shortname;
        this.fullnamePinyinOld = fullnamePinyinOld;
        this.fullnamePinyin = fullnamePinyin;
        this.lpNameOld = lpNameOld;
        this.lpName = lpName;
        this.identityTypeOld = identityTypeOld;
        this.identityType = identityType;
        this.identityIdOld = identityIdOld;
        this.identityId = identityId;
        this.identityUrlOld = identityUrlOld;
        this.identityUrl = identityUrl;
        this.orgTypeOld = orgTypeOld;
        this.orgType = orgType;
        this.compOrgnNumOld = compOrgnNumOld;
        this.compOrgnNum = compOrgnNum;
        this.compTypeOld = compTypeOld;
        this.compType = compType;
        this.compProvinceOld = compProvinceOld;
        this.compProvince = compProvince;
        this.compCityOld = compCityOld;
        this.compCity = compCity;
        this.compDistrictOld = compDistrictOld;
        this.compDistrict = compDistrict;
        this.compAddrOld = compAddrOld;
        this.compAddr = compAddr;
        this.businessLicenseUrlOld = businessLicenseUrlOld;
        this.businessLicenseUrl = businessLicenseUrl;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcEnterpriseAuditInfo() {
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
     * 审核ID
     * @return AUDIT_ID 审核ID
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * 审核ID
     * @param auditId 审核ID
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    /**
     * 企业ID
     * @return ENTP_ID 企业ID
     */
    public String getEntpId() {
        return entpId;
    }

    /**
     * 企业ID
     * @param entpId 企业ID
     */
    public void setEntpId(String entpId) {
        this.entpId = entpId == null ? null : entpId.trim();
    }

    /**
     * 企业全称原
     * @return FULLNAME_OLD 企业全称原
     */
    public String getFullnameOld() {
        return fullnameOld;
    }

    /**
     * 企业全称原
     * @param fullnameOld 企业全称原
     */
    public void setFullnameOld(String fullnameOld) {
        this.fullnameOld = fullnameOld == null ? null : fullnameOld.trim();
    }

    /**
     * 企业全称
     * @return FULLNAME 企业全称
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 企业全称
     * @param fullname 企业全称
     */
    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    /**
     * 企业简称原
     * @return SHORTNAME_OLD 企业简称原
     */
    public String getShortnameOld() {
        return shortnameOld;
    }

    /**
     * 企业简称原
     * @param shortnameOld 企业简称原
     */
    public void setShortnameOld(String shortnameOld) {
        this.shortnameOld = shortnameOld == null ? null : shortnameOld.trim();
    }

    /**
     * 企业简称
     * @return SHORTNAME 企业简称
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * 企业简称
     * @param shortname 企业简称
     */
    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    /**
     * 企业全称拼音原
     * @return FULLNAME_PINYIN_OLD 企业全称拼音原
     */
    public String getFullnamePinyinOld() {
        return fullnamePinyinOld;
    }

    /**
     * 企业全称拼音原
     * @param fullnamePinyinOld 企业全称拼音原
     */
    public void setFullnamePinyinOld(String fullnamePinyinOld) {
        this.fullnamePinyinOld = fullnamePinyinOld == null ? null : fullnamePinyinOld.trim();
    }

    /**
     * 企业全称拼音
     * @return FULLNAME_PINYIN 企业全称拼音
     */
    public String getFullnamePinyin() {
        return fullnamePinyin;
    }

    /**
     * 企业全称拼音
     * @param fullnamePinyin 企业全称拼音
     */
    public void setFullnamePinyin(String fullnamePinyin) {
        this.fullnamePinyin = fullnamePinyin == null ? null : fullnamePinyin.trim();
    }

    /**
     * 法人_姓名原
     * @return LP_NAME_OLD 法人_姓名原
     */
    public String getLpNameOld() {
        return lpNameOld;
    }

    /**
     * 法人_姓名原
     * @param lpNameOld 法人_姓名原
     */
    public void setLpNameOld(String lpNameOld) {
        this.lpNameOld = lpNameOld == null ? null : lpNameOld.trim();
    }

    /**
     * 法人_姓名
     * @return LP_NAME 法人_姓名
     */
    public String getLpName() {
        return lpName;
    }

    /**
     * 法人_姓名
     * @param lpName 法人_姓名
     */
    public void setLpName(String lpName) {
        this.lpName = lpName == null ? null : lpName.trim();
    }

    /**
     * 法人身份证类型原
     * @return IDENTITY_TYPE_OLD 法人身份证类型原
     */
    public Short getIdentityTypeOld() {
        return identityTypeOld;
    }

    /**
     * 法人身份证类型原
     * @param identityTypeOld 法人身份证类型原
     */
    public void setIdentityTypeOld(Short identityTypeOld) {
        this.identityTypeOld = identityTypeOld;
    }

    /**
     * 法人身份证类型
     * @return IDENTITY_TYPE 法人身份证类型
     */
    public Short getIdentityType() {
        return identityType;
    }

    /**
     * 法人身份证类型
     * @param identityType 法人身份证类型
     */
    public void setIdentityType(Short identityType) {
        this.identityType = identityType;
    }

    /**
     * 法人身份证号原
     * @return IDENTITY_ID_OLD 法人身份证号原
     */
    public String getIdentityIdOld() {
        return identityIdOld;
    }

    /**
     * 法人身份证号原
     * @param identityIdOld 法人身份证号原
     */
    public void setIdentityIdOld(String identityIdOld) {
        this.identityIdOld = identityIdOld == null ? null : identityIdOld.trim();
    }

    /**
     * 法人身份证号
     * @return IDENTITY_ID 法人身份证号
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 法人身份证号
     * @param identityId 法人身份证号
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId == null ? null : identityId.trim();
    }

    /**
     * 法人身份证URL原
     * @return IDENTITY_URL_OLD 法人身份证URL原
     */
    public String getIdentityUrlOld() {
        return identityUrlOld;
    }

    /**
     * 法人身份证URL原
     * @param identityUrlOld 法人身份证URL原
     */
    public void setIdentityUrlOld(String identityUrlOld) {
        this.identityUrlOld = identityUrlOld == null ? null : identityUrlOld.trim();
    }

    /**
     * 法人身份证URL
     * @return IDENTITY_URL 法人身份证URL
     */
    public String getIdentityUrl() {
        return identityUrl;
    }

    /**
     * 法人身份证URL
     * @param identityUrl 法人身份证URL
     */
    public void setIdentityUrl(String identityUrl) {
        this.identityUrl = identityUrl == null ? null : identityUrl.trim();
    }

    /**
     * 组织机构代码证类型原
     * @return ORG_TYPE_OLD 组织机构代码证类型原
     */
    public Short getOrgTypeOld() {
        return orgTypeOld;
    }

    /**
     * 组织机构代码证类型原
     * @param orgTypeOld 组织机构代码证类型原
     */
    public void setOrgTypeOld(Short orgTypeOld) {
        this.orgTypeOld = orgTypeOld;
    }

    /**
     * 组织机构代码证类型
     * @return ORG_TYPE 组织机构代码证类型
     */
    public Short getOrgType() {
        return orgType;
    }

    /**
     * 组织机构代码证类型
     * @param orgType 组织机构代码证类型
     */
    public void setOrgType(Short orgType) {
        this.orgType = orgType;
    }

    /**
     * 企业_组织机构代码证号原
     * @return COMP_ORGN_NUM_OLD 企业_组织机构代码证号原
     */
    public String getCompOrgnNumOld() {
        return compOrgnNumOld;
    }

    /**
     * 企业_组织机构代码证号原
     * @param compOrgnNumOld 企业_组织机构代码证号原
     */
    public void setCompOrgnNumOld(String compOrgnNumOld) {
        this.compOrgnNumOld = compOrgnNumOld == null ? null : compOrgnNumOld.trim();
    }

    /**
     * 企业_组织机构代码证号
     * @return COMP_ORGN_NUM 企业_组织机构代码证号
     */
    public String getCompOrgnNum() {
        return compOrgnNum;
    }

    /**
     * 企业_组织机构代码证号
     * @param compOrgnNum 企业_组织机构代码证号
     */
    public void setCompOrgnNum(String compOrgnNum) {
        this.compOrgnNum = compOrgnNum == null ? null : compOrgnNum.trim();
    }

    /**
     * 企业_类型原
     * @return COMP_TYPE_OLD 企业_类型原
     */
    public Short getCompTypeOld() {
        return compTypeOld;
    }

    /**
     * 企业_类型原
     * @param compTypeOld 企业_类型原
     */
    public void setCompTypeOld(Short compTypeOld) {
        this.compTypeOld = compTypeOld;
    }

    /**
     * 企业_类型
     * @return COMP_TYPE 企业_类型
     */
    public Short getCompType() {
        return compType;
    }

    /**
     * 企业_类型
     * @param compType 企业_类型
     */
    public void setCompType(Short compType) {
        this.compType = compType;
    }

    /**
     * 企业_所在地_省原
     * @return COMP_PROVINCE_OLD 企业_所在地_省原
     */
    public String getCompProvinceOld() {
        return compProvinceOld;
    }

    /**
     * 企业_所在地_省原
     * @param compProvinceOld 企业_所在地_省原
     */
    public void setCompProvinceOld(String compProvinceOld) {
        this.compProvinceOld = compProvinceOld == null ? null : compProvinceOld.trim();
    }

    /**
     * 企业_所在地_省
     * @return COMP_PROVINCE 企业_所在地_省
     */
    public String getCompProvince() {
        return compProvince;
    }

    /**
     * 企业_所在地_省
     * @param compProvince 企业_所在地_省
     */
    public void setCompProvince(String compProvince) {
        this.compProvince = compProvince == null ? null : compProvince.trim();
    }

    /**
     * 企业_所在地_市原
     * @return COMP_CITY_OLD 企业_所在地_市原
     */
    public String getCompCityOld() {
        return compCityOld;
    }

    /**
     * 企业_所在地_市原
     * @param compCityOld 企业_所在地_市原
     */
    public void setCompCityOld(String compCityOld) {
        this.compCityOld = compCityOld == null ? null : compCityOld.trim();
    }

    /**
     * 企业_所在地_市
     * @return COMP_CITY 企业_所在地_市
     */
    public String getCompCity() {
        return compCity;
    }

    /**
     * 企业_所在地_市
     * @param compCity 企业_所在地_市
     */
    public void setCompCity(String compCity) {
        this.compCity = compCity == null ? null : compCity.trim();
    }

    /**
     * 企业_所在地_区原
     * @return COMP_DISTRICT_OLD 企业_所在地_区原
     */
    public String getCompDistrictOld() {
        return compDistrictOld;
    }

    /**
     * 企业_所在地_区原
     * @param compDistrictOld 企业_所在地_区原
     */
    public void setCompDistrictOld(String compDistrictOld) {
        this.compDistrictOld = compDistrictOld == null ? null : compDistrictOld.trim();
    }

    /**
     * 企业_所在地_区
     * @return COMP_DISTRICT 企业_所在地_区
     */
    public String getCompDistrict() {
        return compDistrict;
    }

    /**
     * 企业_所在地_区
     * @param compDistrict 企业_所在地_区
     */
    public void setCompDistrict(String compDistrict) {
        this.compDistrict = compDistrict == null ? null : compDistrict.trim();
    }

    /**
     * 企业_街道地址原
     * @return COMP_ADDR_OLD 企业_街道地址原
     */
    public String getCompAddrOld() {
        return compAddrOld;
    }

    /**
     * 企业_街道地址原
     * @param compAddrOld 企业_街道地址原
     */
    public void setCompAddrOld(String compAddrOld) {
        this.compAddrOld = compAddrOld == null ? null : compAddrOld.trim();
    }

    /**
     * 企业_街道地址
     * @return COMP_ADDR 企业_街道地址
     */
    public String getCompAddr() {
        return compAddr;
    }

    /**
     * 企业_街道地址
     * @param compAddr 企业_街道地址
     */
    public void setCompAddr(String compAddr) {
        this.compAddr = compAddr == null ? null : compAddr.trim();
    }

    /**
     * 营业执照URL原
     * @return BUSINESS_LICENSE_URL_OLD 营业执照URL原
     */
    public String getBusinessLicenseUrlOld() {
        return businessLicenseUrlOld;
    }

    /**
     * 营业执照URL原
     * @param businessLicenseUrlOld 营业执照URL原
     */
    public void setBusinessLicenseUrlOld(String businessLicenseUrlOld) {
        this.businessLicenseUrlOld = businessLicenseUrlOld == null ? null : businessLicenseUrlOld.trim();
    }

    /**
     * 营业执照URL
     * @return BUSINESS_LICENSE_URL 营业执照URL
     */
    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    /**
     * 营业执照URL
     * @param businessLicenseUrl 营业执照URL
     */
    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl == null ? null : businessLicenseUrl.trim();
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
        sb.append(", auditId=").append(auditId);
        sb.append(", entpId=").append(entpId);
        sb.append(", fullnameOld=").append(fullnameOld);
        sb.append(", fullname=").append(fullname);
        sb.append(", shortnameOld=").append(shortnameOld);
        sb.append(", shortname=").append(shortname);
        sb.append(", fullnamePinyinOld=").append(fullnamePinyinOld);
        sb.append(", fullnamePinyin=").append(fullnamePinyin);
        sb.append(", lpNameOld=").append(lpNameOld);
        sb.append(", lpName=").append(lpName);
        sb.append(", identityTypeOld=").append(identityTypeOld);
        sb.append(", identityType=").append(identityType);
        sb.append(", identityIdOld=").append(identityIdOld);
        sb.append(", identityId=").append(identityId);
        sb.append(", identityUrlOld=").append(identityUrlOld);
        sb.append(", identityUrl=").append(identityUrl);
        sb.append(", orgTypeOld=").append(orgTypeOld);
        sb.append(", orgType=").append(orgType);
        sb.append(", compOrgnNumOld=").append(compOrgnNumOld);
        sb.append(", compOrgnNum=").append(compOrgnNum);
        sb.append(", compTypeOld=").append(compTypeOld);
        sb.append(", compType=").append(compType);
        sb.append(", compProvinceOld=").append(compProvinceOld);
        sb.append(", compProvince=").append(compProvince);
        sb.append(", compCityOld=").append(compCityOld);
        sb.append(", compCity=").append(compCity);
        sb.append(", compDistrictOld=").append(compDistrictOld);
        sb.append(", compDistrict=").append(compDistrict);
        sb.append(", compAddrOld=").append(compAddrOld);
        sb.append(", compAddr=").append(compAddr);
        sb.append(", businessLicenseUrlOld=").append(businessLicenseUrlOld);
        sb.append(", businessLicenseUrl=").append(businessLicenseUrl);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}