package irvin.uc.dao;

import irvin.api.domain.UcRole;
import irvin.uc.common.domain.UcRoleExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UcRoleMapper {
    @SelectProvider(type = UcRoleSqlProvider.class, method = "countByExample")
    long countByExample(UcRoleExample example);

    @DeleteProvider(type = UcRoleSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UcRoleExample example);

    @Delete({
            "delete from uc_role",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into uc_role (id, expression, ",
            "status, version, ",
            "name)",
            "values (#{id,jdbcType=VARCHAR}, #{expression,jdbcType=VARCHAR}, ",
            "#{status,jdbcType=INTEGER}, #{version,jdbcType=INTEGER}, ",
            "#{name,jdbcType=LONGVARCHAR})"
    })
    int insert(UcRole record);

    @InsertProvider(type = UcRoleSqlProvider.class, method = "insertSelective")
    int insertSelective(UcRole record);

    @SelectProvider(type = UcRoleSqlProvider.class, method = "selectByExampleWithBLOBs")
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "expression", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "name", javaType = String.class, jdbcType = JdbcType.LONGVARCHAR)
    })
    List<UcRole> selectByExampleWithBLOBs(UcRoleExample example);

    @SelectProvider(type = UcRoleSqlProvider.class, method = "selectByExample")
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "expression", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
    })
    List<UcRole> selectByExample(UcRoleExample example);

    @Select({
            "select",
            "id, expression, status, version, name",
            "from uc_role",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "expression", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "name", javaType = String.class, jdbcType = JdbcType.LONGVARCHAR)
    })
    UcRole selectByPrimaryKey(String id);

    @UpdateProvider(type = UcRoleSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcRole record, @Param("example") UcRoleExample example);

    @UpdateProvider(type = UcRoleSqlProvider.class, method = "updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") UcRole record, @Param("example") UcRoleExample example);

    @UpdateProvider(type = UcRoleSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") UcRole record, @Param("example") UcRoleExample example);

    @UpdateProvider(type = UcRoleSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcRole record);

    @Update({
            "update uc_role",
            "set expression = #{expression,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "version = #{version,jdbcType=INTEGER},",
            "name = #{name,jdbcType=LONGVARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(UcRole record);

    @Update({
            "update uc_role",
            "set expression = #{expression,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "version = #{version,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcRole record);
}