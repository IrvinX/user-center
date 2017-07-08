package com.footprint.common.model;

import java.io.Serializable;
import java.util.Date;

public class DUcBusinessSystem implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 版本号
     */
    private Short verid;

    /**
     * 系统图标
     */
    private String iconUrl;

    /**
     * 背景
     */
    private String bannerUrl;

    /**
     * 主题
     */
    private String theme;

    /**
     * 根目录
     */
    private String basepath;

    /**
     * 系统状态
     */
    private Short sysStatus;

    /**
     * 系统类别
     */
    private Short sysType;

    /**
     * 系统名称
     */
    private String sysName;

    /**
     * 系统标题
     */
    private String sysTitle;

    /**
     * 系统描述
     */
    private String sysDesc;

    /**
     * 业务系统顺序
     */
    private Short sysOrder;

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
     * D_UC_BUSINESS_SYSTEM
     */
    private static final long serialVersionUID = 1L;

    public DUcBusinessSystem(String id, Short verid, String iconUrl, String bannerUrl, String theme, String basepath, Short sysStatus, Short sysType, String sysName, String sysTitle, String sysDesc, Short sysOrder, Date createtime, String createuser, Date updatetime, String updateuser) {
        this.id = id;
        this.verid = verid;
        this.iconUrl = iconUrl;
        this.bannerUrl = bannerUrl;
        this.theme = theme;
        this.basepath = basepath;
        this.sysStatus = sysStatus;
        this.sysType = sysType;
        this.sysName = sysName;
        this.sysTitle = sysTitle;
        this.sysDesc = sysDesc;
        this.sysOrder = sysOrder;
        this.createtime = createtime;
        this.createuser = createuser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
    }

    public DUcBusinessSystem() {
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
     * 系统图标
     * @return ICON_URL 系统图标
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 系统图标
     * @param iconUrl 系统图标
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    /**
     * 背景
     * @return BANNER_URL 背景
     */
    public String getBannerUrl() {
        return bannerUrl;
    }

    /**
     * 背景
     * @param bannerUrl 背景
     */
    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    /**
     * 主题
     * @return THEME 主题
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 主题
     * @param theme 主题
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * 根目录
     * @return BASEPATH 根目录
     */
    public String getBasepath() {
        return basepath;
    }

    /**
     * 根目录
     * @param basepath 根目录
     */
    public void setBasepath(String basepath) {
        this.basepath = basepath == null ? null : basepath.trim();
    }

    /**
     * 系统状态
     * @return SYS_STATUS 系统状态
     */
    public Short getSysStatus() {
        return sysStatus;
    }

    /**
     * 系统状态
     * @param sysStatus 系统状态
     */
    public void setSysStatus(Short sysStatus) {
        this.sysStatus = sysStatus;
    }

    /**
     * 系统类别
     * @return SYS_TYPE 系统类别
     */
    public Short getSysType() {
        return sysType;
    }

    /**
     * 系统类别
     * @param sysType 系统类别
     */
    public void setSysType(Short sysType) {
        this.sysType = sysType;
    }

    /**
     * 系统名称
     * @return SYS_NAME 系统名称
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * 系统名称
     * @param sysName 系统名称
     */
    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    /**
     * 系统标题
     * @return SYS_TITLE 系统标题
     */
    public String getSysTitle() {
        return sysTitle;
    }

    /**
     * 系统标题
     * @param sysTitle 系统标题
     */
    public void setSysTitle(String sysTitle) {
        this.sysTitle = sysTitle == null ? null : sysTitle.trim();
    }

    /**
     * 系统描述
     * @return SYS_DESC 系统描述
     */
    public String getSysDesc() {
        return sysDesc;
    }

    /**
     * 系统描述
     * @param sysDesc 系统描述
     */
    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc == null ? null : sysDesc.trim();
    }

    /**
     * 业务系统顺序
     * @return SYS_ORDER 业务系统顺序
     */
    public Short getSysOrder() {
        return sysOrder;
    }

    /**
     * 业务系统顺序
     * @param sysOrder 业务系统顺序
     */
    public void setSysOrder(Short sysOrder) {
        this.sysOrder = sysOrder;
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
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", bannerUrl=").append(bannerUrl);
        sb.append(", theme=").append(theme);
        sb.append(", basepath=").append(basepath);
        sb.append(", sysStatus=").append(sysStatus);
        sb.append(", sysType=").append(sysType);
        sb.append(", sysName=").append(sysName);
        sb.append(", sysTitle=").append(sysTitle);
        sb.append(", sysDesc=").append(sysDesc);
        sb.append(", sysOrder=").append(sysOrder);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser=").append(createuser);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateuser=").append(updateuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}