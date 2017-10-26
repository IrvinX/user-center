package irvin.api.domain;

import java.io.Serializable;

public class UcPermission implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限表达式
     */
    private String expression;

    /**
     * 权限状态
     */
    private Integer status;

    /**
     * url
     */
    private String url;

    /**
     * uc_permission
     */
    private static final long serialVersionUID = 1L;

    public UcPermission(String id, String name, String expression, Integer status, String url) {
        this.id = id;
        this.name = name;
        this.expression = expression;
        this.status = status;
        this.url = url;
    }

    public UcPermission() {
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
     * 权限名称
     * @return name 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 权限名称
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 权限表达式
     * @return expression 权限表达式
     */
    public String getExpression() {
        return expression;
    }

    /**
     * 权限表达式
     * @param expression 权限表达式
     */
    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    /**
     * 权限状态
     * @return status 权限状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 权限状态
     * @param status 权限状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * url
     * @return url url
     */
    public String getUrl() {
        return url;
    }

    /**
     * url
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", expression=").append(expression);
        sb.append(", status=").append(status);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}