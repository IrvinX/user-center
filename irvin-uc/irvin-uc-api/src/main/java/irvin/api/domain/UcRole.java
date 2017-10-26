package irvin.api.domain;

import java.io.Serializable;

public class UcRole implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 角色表达式
     */
    private String expression;

    /**
     * 角色状态
     */
    private Integer status;

    /**
     * 角色名
     */
    private String name;

    /**
     * uc_role
     */
    private static final long serialVersionUID = 1L;

    public UcRole(String id, String expression, Integer status, String name) {
        this.id = id;
        this.expression = expression;
        this.status = status;
        this.name = name;
    }

    public UcRole() {
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
     * 角色表达式
     * @return expression 角色表达式
     */
    public String getExpression() {
        return expression;
    }

    /**
     * 角色表达式
     * @param expression 角色表达式
     */
    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    /**
     * 角色状态
     * @return status 角色状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 角色状态
     * @param status 角色状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 角色名
     * @return name 角色名
     */
    public String getName() {
        return name;
    }

    /**
     * 角色名
     * @param name 角色名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", expression=").append(expression);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}