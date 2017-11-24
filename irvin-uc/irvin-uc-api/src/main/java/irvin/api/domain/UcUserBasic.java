package irvin.api.domain;

import java.io.Serializable;
import java.util.Date;

public class UcUserBasic implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private Date birth;

    /**
     * 
     */
    private String mobile;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String englishName;

    /**
     * 
     */
    private Integer gender;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 
     */
    private Integer version;

    /**
     * uc_user_basic
     */
    private static final long serialVersionUID = 1L;

    public UcUserBasic(String id, String name, Integer age, Date birth, String mobile, String email, String englishName, Integer gender, Integer status, Integer version) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.mobile = mobile;
        this.email = email;
        this.englishName = englishName;
        this.gender = gender;
        this.status = status;
        this.version = version;
    }

    public UcUserBasic() {
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
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return age 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 
     * @return birth 
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 
     * @param birth 
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 
     * @return mobile 
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile 
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 
     * @return english_name 
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 
     * @param englishName 
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * 
     * @return gender 
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 
     * @param gender 
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 用户状态
     * @return status 用户状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户状态
     * @param status 用户状态
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
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", birth=").append(birth);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", englishName=").append(englishName);
        sb.append(", gender=").append(gender);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}