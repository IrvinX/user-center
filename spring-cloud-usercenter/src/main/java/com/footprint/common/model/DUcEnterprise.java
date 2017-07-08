package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcEnterprise implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 企业状态
     */
    private Short entpStatus;

    /**
     * 企业全称_英文
     */
    private String fullnameEng;

    /**
     * 企业全称
     */
    private String fullname;

    /**
     * 企业简称
     */
    private String shortname;

    /**
     * 企业全称拼音
     */
    private String fullnamePinyin;

    /**
     * 法人_姓名
     */
    private String lpName;

    /**
     * 法人_手机号
     */
    private String lpMbphone;

    /**
     * 法人_其它电话
     */
    private String lpTel;

    /**
     * 法人_电子邮箱
     */
    private String lpEmal;

    /**
     * 法人_传真
     */
    private String lpFax;

    /**
     * 法人身份证类型
     */
    private Short identityType;

    /**
     * 法人身份证号
     */
    private String identityId;

    /**
     * 法人身份证URL
     */
    private String identityUrl;

    /**
     * 企业_注册资金
     */
    private String compRegfund;

    /**
     * 组织机构代码证类型
     */
    private Short orgType;

    /**
     * 企业_组织机构代码证号
     */
    private String compOrgnNum;

    /**
     * 企业_税务登记证号
     */
    private String compTaxregcert;

    /**
     * 企业_注册地址_省
     */
    private String compProvince;

    /**
     * 企业_注册地址_市
     */
    private String compCity;

    /**
     * 企业_注册地址_区
     */
    private String compDistrict;

    /**
     * 企业_注册街道地址
     */
    private String compAddr;

    /**
     * 企业_通信地址_英文
     */
    private String compAddrEng;

    /**
     * 企业_通信地址_省
     */
    private String compProvinceComm;

    /**
     * 企业_通信地址_市
     */
    private String compCityComm;

    /**
     * 企业_通信地址_区
     */
    private String compDistrictComm;

    /**
     * 企业_通信街道地址
     */
    private String compAddrComm;

    /**
     * 企业_邮编
     */
    private String compPostcode;

    /**
     * 企业_电话
     */
    private String compTel;

    /**
     * 企业_传真
     */
    private String compFax;

    /**
     * 企业_邮箱
     */
    private String compMail;

    /**
     * 营业执照URL
     */
    private String businessLicenseUrl;

    /**
     * 税务登记证URL
     */
    private String taxLicenseUrl;

    /**
     * 组织机构代码证URL
     */
    private String orgCodeUrl;

    /**
     * 主营业务收入
     */
    private String maininCome;

    /**
     * 企业成立时间
     */
    private Date establishmentDate;

    /**
     * 公司性质
     */
    private String companyTypeVar;

    /**
     * 备注
     */
    private String memo;

    /**
     * 企业LOGO
     */
    private String entpLogoUrl;

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
     * D_UC_ENTERPRISE
     */
    private static final long serialVersionUID = 1L;

    public DUcEnterprise(String id, Short verid, Short entpStatus, String fullnameEng, String fullname, String shortname, String fullnamePinyin, String lpName, String lpMbphone, String lpTel, String lpEmal, String lpFax, Short identityType, String identityId, String identityUrl, String compRegfund, Short orgType, String compOrgnNum, String compTaxregcert, String compProvince, String compCity, String compDistrict, String compAddr, String compAddrEng, String compProvinceComm, String compCityComm, String compDistrictComm, String compAddrComm, String compPostcode, String compTel, String compFax, String compMail, String businessLicenseUrl, String taxLicenseUrl, String orgCodeUrl, String maininCome, Date establishmentDate, String companyTypeVar, String memo, String entpLogoUrl, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.entpStatus = entpStatus;
        this.fullnameEng = fullnameEng;
        this.fullname = fullname;
        this.shortname = shortname;
        this.fullnamePinyin = fullnamePinyin;
        this.lpName = lpName;
        this.lpMbphone = lpMbphone;
        this.lpTel = lpTel;
        this.lpEmal = lpEmal;
        this.lpFax = lpFax;
        this.identityType = identityType;
        this.identityId = identityId;
        this.identityUrl = identityUrl;
        this.compRegfund = compRegfund;
        this.orgType = orgType;
        this.compOrgnNum = compOrgnNum;
        this.compTaxregcert = compTaxregcert;
        this.compProvince = compProvince;
        this.compCity = compCity;
        this.compDistrict = compDistrict;
        this.compAddr = compAddr;
        this.compAddrEng = compAddrEng;
        this.compProvinceComm = compProvinceComm;
        this.compCityComm = compCityComm;
        this.compDistrictComm = compDistrictComm;
        this.compAddrComm = compAddrComm;
        this.compPostcode = compPostcode;
        this.compTel = compTel;
        this.compFax = compFax;
        this.compMail = compMail;
        this.businessLicenseUrl = businessLicenseUrl;
        this.taxLicenseUrl = taxLicenseUrl;
        this.orgCodeUrl = orgCodeUrl;
        this.maininCome = maininCome;
        this.establishmentDate = establishmentDate;
        this.companyTypeVar = companyTypeVar;
        this.memo = memo;
        this.entpLogoUrl = entpLogoUrl;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcEnterprise() {
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
     * 企业状态
     * @return ENTP_STATUS 企业状态
     */
    public Short getEntpStatus() {
        return entpStatus;
    }

    /**
     * 企业状态
     * @param entpStatus 企业状态
     */
    public void setEntpStatus(Short entpStatus) {
        this.entpStatus = entpStatus;
    }

    /**
     * 企业全称_英文
     * @return FULLNAME_ENG 企业全称_英文
     */
    public String getFullnameEng() {
        return fullnameEng;
    }

    /**
     * 企业全称_英文
     * @param fullnameEng 企业全称_英文
     */
    public void setFullnameEng(String fullnameEng) {
        this.fullnameEng = fullnameEng == null ? null : fullnameEng.trim();
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
     * 法人_手机号
     * @return LP_MBPHONE 法人_手机号
     */
    public String getLpMbphone() {
        return lpMbphone;
    }

    /**
     * 法人_手机号
     * @param lpMbphone 法人_手机号
     */
    public void setLpMbphone(String lpMbphone) {
        this.lpMbphone = lpMbphone == null ? null : lpMbphone.trim();
    }

    /**
     * 法人_其它电话
     * @return LP_TEL 法人_其它电话
     */
    public String getLpTel() {
        return lpTel;
    }

    /**
     * 法人_其它电话
     * @param lpTel 法人_其它电话
     */
    public void setLpTel(String lpTel) {
        this.lpTel = lpTel == null ? null : lpTel.trim();
    }

    /**
     * 法人_电子邮箱
     * @return LP_EMAL 法人_电子邮箱
     */
    public String getLpEmal() {
        return lpEmal;
    }

    /**
     * 法人_电子邮箱
     * @param lpEmal 法人_电子邮箱
     */
    public void setLpEmal(String lpEmal) {
        this.lpEmal = lpEmal == null ? null : lpEmal.trim();
    }

    /**
     * 法人_传真
     * @return LP_FAX 法人_传真
     */
    public String getLpFax() {
        return lpFax;
    }

    /**
     * 法人_传真
     * @param lpFax 法人_传真
     */
    public void setLpFax(String lpFax) {
        this.lpFax = lpFax == null ? null : lpFax.trim();
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
     * 企业_注册资金
     * @return COMP_REGFUND 企业_注册资金
     */
    public String getCompRegfund() {
        return compRegfund;
    }

    /**
     * 企业_注册资金
     * @param compRegfund 企业_注册资金
     */
    public void setCompRegfund(String compRegfund) {
        this.compRegfund = compRegfund == null ? null : compRegfund.trim();
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
     * 企业_税务登记证号
     * @return COMP_TAXREGCERT 企业_税务登记证号
     */
    public String getCompTaxregcert() {
        return compTaxregcert;
    }

    /**
     * 企业_税务登记证号
     * @param compTaxregcert 企业_税务登记证号
     */
    public void setCompTaxregcert(String compTaxregcert) {
        this.compTaxregcert = compTaxregcert == null ? null : compTaxregcert.trim();
    }

    /**
     * 企业_注册地址_省
     * @return COMP_PROVINCE 企业_注册地址_省
     */
    public String getCompProvince() {
        return compProvince;
    }

    /**
     * 企业_注册地址_省
     * @param compProvince 企业_注册地址_省
     */
    public void setCompProvince(String compProvince) {
        this.compProvince = compProvince == null ? null : compProvince.trim();
    }

    /**
     * 企业_注册地址_市
     * @return COMP_CITY 企业_注册地址_市
     */
    public String getCompCity() {
        return compCity;
    }

    /**
     * 企业_注册地址_市
     * @param compCity 企业_注册地址_市
     */
    public void setCompCity(String compCity) {
        this.compCity = compCity == null ? null : compCity.trim();
    }

    /**
     * 企业_注册地址_区
     * @return COMP_DISTRICT 企业_注册地址_区
     */
    public String getCompDistrict() {
        return compDistrict;
    }

    /**
     * 企业_注册地址_区
     * @param compDistrict 企业_注册地址_区
     */
    public void setCompDistrict(String compDistrict) {
        this.compDistrict = compDistrict == null ? null : compDistrict.trim();
    }

    /**
     * 企业_注册街道地址
     * @return COMP_ADDR 企业_注册街道地址
     */
    public String getCompAddr() {
        return compAddr;
    }

    /**
     * 企业_注册街道地址
     * @param compAddr 企业_注册街道地址
     */
    public void setCompAddr(String compAddr) {
        this.compAddr = compAddr == null ? null : compAddr.trim();
    }

    /**
     * 企业_通信地址_英文
     * @return COMP_ADDR_ENG 企业_通信地址_英文
     */
    public String getCompAddrEng() {
        return compAddrEng;
    }

    /**
     * 企业_通信地址_英文
     * @param compAddrEng 企业_通信地址_英文
     */
    public void setCompAddrEng(String compAddrEng) {
        this.compAddrEng = compAddrEng == null ? null : compAddrEng.trim();
    }

    /**
     * 企业_通信地址_省
     * @return COMP_PROVINCE_COMM 企业_通信地址_省
     */
    public String getCompProvinceComm() {
        return compProvinceComm;
    }

    /**
     * 企业_通信地址_省
     * @param compProvinceComm 企业_通信地址_省
     */
    public void setCompProvinceComm(String compProvinceComm) {
        this.compProvinceComm = compProvinceComm == null ? null : compProvinceComm.trim();
    }

    /**
     * 企业_通信地址_市
     * @return COMP_CITY_COMM 企业_通信地址_市
     */
    public String getCompCityComm() {
        return compCityComm;
    }

    /**
     * 企业_通信地址_市
     * @param compCityComm 企业_通信地址_市
     */
    public void setCompCityComm(String compCityComm) {
        this.compCityComm = compCityComm == null ? null : compCityComm.trim();
    }

    /**
     * 企业_通信地址_区
     * @return COMP_DISTRICT_COMM 企业_通信地址_区
     */
    public String getCompDistrictComm() {
        return compDistrictComm;
    }

    /**
     * 企业_通信地址_区
     * @param compDistrictComm 企业_通信地址_区
     */
    public void setCompDistrictComm(String compDistrictComm) {
        this.compDistrictComm = compDistrictComm == null ? null : compDistrictComm.trim();
    }

    /**
     * 企业_通信街道地址
     * @return COMP_ADDR_COMM 企业_通信街道地址
     */
    public String getCompAddrComm() {
        return compAddrComm;
    }

    /**
     * 企业_通信街道地址
     * @param compAddrComm 企业_通信街道地址
     */
    public void setCompAddrComm(String compAddrComm) {
        this.compAddrComm = compAddrComm == null ? null : compAddrComm.trim();
    }

    /**
     * 企业_邮编
     * @return COMP_POSTCODE 企业_邮编
     */
    public String getCompPostcode() {
        return compPostcode;
    }

    /**
     * 企业_邮编
     * @param compPostcode 企业_邮编
     */
    public void setCompPostcode(String compPostcode) {
        this.compPostcode = compPostcode == null ? null : compPostcode.trim();
    }

    /**
     * 企业_电话
     * @return COMP_TEL 企业_电话
     */
    public String getCompTel() {
        return compTel;
    }

    /**
     * 企业_电话
     * @param compTel 企业_电话
     */
    public void setCompTel(String compTel) {
        this.compTel = compTel == null ? null : compTel.trim();
    }

    /**
     * 企业_传真
     * @return COMP_FAX 企业_传真
     */
    public String getCompFax() {
        return compFax;
    }

    /**
     * 企业_传真
     * @param compFax 企业_传真
     */
    public void setCompFax(String compFax) {
        this.compFax = compFax == null ? null : compFax.trim();
    }

    /**
     * 企业_邮箱
     * @return COMP_MAIL 企业_邮箱
     */
    public String getCompMail() {
        return compMail;
    }

    /**
     * 企业_邮箱
     * @param compMail 企业_邮箱
     */
    public void setCompMail(String compMail) {
        this.compMail = compMail == null ? null : compMail.trim();
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
     * 税务登记证URL
     * @return TAX_LICENSE_URL 税务登记证URL
     */
    public String getTaxLicenseUrl() {
        return taxLicenseUrl;
    }

    /**
     * 税务登记证URL
     * @param taxLicenseUrl 税务登记证URL
     */
    public void setTaxLicenseUrl(String taxLicenseUrl) {
        this.taxLicenseUrl = taxLicenseUrl == null ? null : taxLicenseUrl.trim();
    }

    /**
     * 组织机构代码证URL
     * @return ORG_CODE_URL 组织机构代码证URL
     */
    public String getOrgCodeUrl() {
        return orgCodeUrl;
    }

    /**
     * 组织机构代码证URL
     * @param orgCodeUrl 组织机构代码证URL
     */
    public void setOrgCodeUrl(String orgCodeUrl) {
        this.orgCodeUrl = orgCodeUrl == null ? null : orgCodeUrl.trim();
    }

    /**
     * 主营业务收入
     * @return MAININ_COME 主营业务收入
     */
    public String getMaininCome() {
        return maininCome;
    }

    /**
     * 主营业务收入
     * @param maininCome 主营业务收入
     */
    public void setMaininCome(String maininCome) {
        this.maininCome = maininCome == null ? null : maininCome.trim();
    }

    /**
     * 企业成立时间
     * @return ESTABLISHMENT_DATE 企业成立时间
     */
    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     * 企业成立时间
     * @param establishmentDate 企业成立时间
     */
    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    /**
     * 公司性质
     * @return COMPANY_TYPE_VAR 公司性质
     */
    public String getCompanyTypeVar() {
        return companyTypeVar;
    }

    /**
     * 公司性质
     * @param companyTypeVar 公司性质
     */
    public void setCompanyTypeVar(String companyTypeVar) {
        this.companyTypeVar = companyTypeVar == null ? null : companyTypeVar.trim();
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
     * 企业LOGO
     * @return ENTP_LOGO_URL 企业LOGO
     */
    public String getEntpLogoUrl() {
        return entpLogoUrl;
    }

    /**
     * 企业LOGO
     * @param entpLogoUrl 企业LOGO
     */
    public void setEntpLogoUrl(String entpLogoUrl) {
        this.entpLogoUrl = entpLogoUrl == null ? null : entpLogoUrl.trim();
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
        sb.append(", entpStatus=").append(entpStatus);
        sb.append(", fullnameEng=").append(fullnameEng);
        sb.append(", fullname=").append(fullname);
        sb.append(", shortname=").append(shortname);
        sb.append(", fullnamePinyin=").append(fullnamePinyin);
        sb.append(", lpName=").append(lpName);
        sb.append(", lpMbphone=").append(lpMbphone);
        sb.append(", lpTel=").append(lpTel);
        sb.append(", lpEmal=").append(lpEmal);
        sb.append(", lpFax=").append(lpFax);
        sb.append(", identityType=").append(identityType);
        sb.append(", identityId=").append(identityId);
        sb.append(", identityUrl=").append(identityUrl);
        sb.append(", compRegfund=").append(compRegfund);
        sb.append(", orgType=").append(orgType);
        sb.append(", compOrgnNum=").append(compOrgnNum);
        sb.append(", compTaxregcert=").append(compTaxregcert);
        sb.append(", compProvince=").append(compProvince);
        sb.append(", compCity=").append(compCity);
        sb.append(", compDistrict=").append(compDistrict);
        sb.append(", compAddr=").append(compAddr);
        sb.append(", compAddrEng=").append(compAddrEng);
        sb.append(", compProvinceComm=").append(compProvinceComm);
        sb.append(", compCityComm=").append(compCityComm);
        sb.append(", compDistrictComm=").append(compDistrictComm);
        sb.append(", compAddrComm=").append(compAddrComm);
        sb.append(", compPostcode=").append(compPostcode);
        sb.append(", compTel=").append(compTel);
        sb.append(", compFax=").append(compFax);
        sb.append(", compMail=").append(compMail);
        sb.append(", businessLicenseUrl=").append(businessLicenseUrl);
        sb.append(", taxLicenseUrl=").append(taxLicenseUrl);
        sb.append(", orgCodeUrl=").append(orgCodeUrl);
        sb.append(", maininCome=").append(maininCome);
        sb.append(", establishmentDate=").append(establishmentDate);
        sb.append(", companyTypeVar=").append(companyTypeVar);
        sb.append(", memo=").append(memo);
        sb.append(", entpLogoUrl=").append(entpLogoUrl);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}