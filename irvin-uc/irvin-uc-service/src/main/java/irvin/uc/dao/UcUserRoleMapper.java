package irvin.uc.dao;

import irvin.api.domain.UcUserRole;
import irvin.uc.common.domain.UcUserRoleExample;
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

public interface UcUserRoleMapper {
    @SelectProvider(type=UcUserRoleSqlProvider.class, method="countByExample")
    long countByExample(UcUserRoleExample example);

    @DeleteProvider(type=UcUserRoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(UcUserRoleExample example);

    @Delete({
        "delete from uc_user_role",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into uc_user_role (id, user_basic_id, ",
        "role_id, status)",
        "values (#{id,jdbcType=VARCHAR}, #{userBasicId,jdbcType=VARCHAR}, ",
        "#{roleId,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(UcUserRole record);

    @InsertProvider(type=UcUserRoleSqlProvider.class, method="insertSelective")
    int insertSelective(UcUserRole record);

    @SelectProvider(type=UcUserRoleSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UcUserRole> selectByExample(UcUserRoleExample example);

    @Select({
        "select",
        "id, user_basic_id, role_id, status",
        "from uc_user_role",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    UcUserRole selectByPrimaryKey(String id);

    @UpdateProvider(type=UcUserRoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcUserRole record, @Param("example") UcUserRoleExample example);

    @UpdateProvider(type=UcUserRoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UcUserRole record, @Param("example") UcUserRoleExample example);

    @UpdateProvider(type=UcUserRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcUserRole record);

    @Update({
        "update uc_user_role",
        "set user_basic_id = #{userBasicId,jdbcType=VARCHAR},",
          "role_id = #{roleId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcUserRole record);
}