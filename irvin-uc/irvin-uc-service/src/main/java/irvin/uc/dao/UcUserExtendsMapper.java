package irvin.uc.dao;

import irvin.api.domain.UcUserExtends;
import irvin.uc.common.domain.UcUserExtendsExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UcUserExtendsMapper {
    @SelectProvider(type = UcUserExtendsSqlProvider.class, method = "countByExample")
    long countByExample(UcUserExtendsExample example);

    @DeleteProvider(type = UcUserExtendsSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UcUserExtendsExample example);

    @Delete({
            "delete from uc_user_extends",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into uc_user_extends (id, password, ",
            "salt, user_basic_id, ",
            "type, version)",
            "values (#{id,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
            "#{salt,jdbcType=VARCHAR}, #{userBasicId,jdbcType=VARCHAR}, ",
            "#{type,jdbcType=INTEGER}, #{version,jdbcType=INTEGER})"
    })
    int insert(UcUserExtends record);

    @InsertProvider(type = UcUserExtendsSqlProvider.class, method = "insertSelective")
    int insertSelective(UcUserExtends record);

    @SelectProvider(type = UcUserExtendsSqlProvider.class, method = "selectByExample")
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "user_basic_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "type", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
    })
    List<UcUserExtends> selectByExample(UcUserExtendsExample example);

    @Select({
            "select",
            "id, password, salt, user_basic_id, type, version",
            "from uc_user_extends",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "user_basic_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "type", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
    })
    UcUserExtends selectByPrimaryKey(String id);

    @UpdateProvider(type = UcUserExtendsSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcUserExtends record, @Param("example") UcUserExtendsExample example);

    @UpdateProvider(type = UcUserExtendsSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") UcUserExtends record, @Param("example") UcUserExtendsExample example);

    @UpdateProvider(type = UcUserExtendsSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcUserExtends record);

    @Update({
            "update uc_user_extends",
            "set password = #{password,jdbcType=VARCHAR},",
            "salt = #{salt,jdbcType=VARCHAR},",
            "user_basic_id = #{userBasicId,jdbcType=VARCHAR},",
            "type = #{type,jdbcType=INTEGER},",
            "version = #{version,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcUserExtends record);
}