package irvin.uc.dao;

import irvin.api.domain.UcPermission;
import irvin.uc.common.domain.UcPermissionExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UcPermissionMapper {
    @SelectProvider(type=UcPermissionSqlProvider.class, method="countByExample")
    long countByExample(UcPermissionExample example);

    @DeleteProvider(type=UcPermissionSqlProvider.class, method="deleteByExample")
    int deleteByExample(UcPermissionExample example);

    @Delete({
        "delete from uc_permission",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into uc_permission (id, name, ",
        "expression, status, ",
        "url, version)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{expression,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{url,jdbcType=VARCHAR}, #{version,jdbcType=INTEGER})"
    })
    int insert(UcPermission record);

    @InsertProvider(type=UcPermissionSqlProvider.class, method="insertSelective")
    int insertSelective(UcPermission record);

    @SelectProvider(type=UcPermissionSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expression", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="version", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UcPermission> selectByExample(UcPermissionExample example);

    @Select({
        "select",
        "id, name, expression, status, url, version",
        "from uc_permission",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="expression", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="version", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    UcPermission selectByPrimaryKey(String id);

    @UpdateProvider(type=UcPermissionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcPermission record, @Param("example") UcPermissionExample example);

    @UpdateProvider(type=UcPermissionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UcPermission record, @Param("example") UcPermissionExample example);

    @UpdateProvider(type=UcPermissionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcPermission record);

    @Update({
        "update uc_permission",
        "set name = #{name,jdbcType=VARCHAR},",
          "expression = #{expression,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "url = #{url,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcPermission record);
}