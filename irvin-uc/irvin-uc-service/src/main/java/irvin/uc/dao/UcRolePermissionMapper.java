package irvin.uc.dao;

import irvin.api.domain.UcRolePermission;
import irvin.uc.common.domain.UcRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UcRolePermissionMapper {
    @SelectProvider(type=UcRolePermissionSqlProvider.class, method="countByExample")
    long countByExample(UcRolePermissionExample example);

    @DeleteProvider(type=UcRolePermissionSqlProvider.class, method="deleteByExample")
    int deleteByExample(UcRolePermissionExample example);

    @Delete({
        "delete from uc_role_permission",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into uc_role_permission (id, role_id, ",
        "permission_id, status)",
        "values (#{id,jdbcType=VARCHAR}, #{roleId,jdbcType=VARCHAR}, ",
        "#{permissionId,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(UcRolePermission record);

    @InsertProvider(type=UcRolePermissionSqlProvider.class, method="insertSelective")
    int insertSelective(UcRolePermission record);

    @SelectProvider(type=UcRolePermissionSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="role_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="permission_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UcRolePermission> selectByExample(UcRolePermissionExample example);

    @Select({
        "select",
        "id, role_id, permission_id, status",
        "from uc_role_permission",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="role_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="permission_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    UcRolePermission selectByPrimaryKey(String id);

    @UpdateProvider(type=UcRolePermissionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcRolePermission record, @Param("example") UcRolePermissionExample example);

    @UpdateProvider(type=UcRolePermissionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UcRolePermission record, @Param("example") UcRolePermissionExample example);

    @UpdateProvider(type=UcRolePermissionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcRolePermission record);

    @Update({
        "update uc_role_permission",
        "set role_id = #{roleId,jdbcType=VARCHAR},",
          "permission_id = #{permissionId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcRolePermission record);
}