package irvin.uc.dao;

import irvin.api.domain.UcUserOauth;
import irvin.uc.common.domain.UcUserOauthExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UcUserOauthMapper {
    @SelectProvider(type = UcUserOauthSqlProvider.class, method = "countByExample")
    long countByExample(UcUserOauthExample example);

    @DeleteProvider(type = UcUserOauthSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UcUserOauthExample example);

    @Delete({
            "delete from uc_user_oauth",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into uc_user_oauth (id, user_basic_id, ",
            "account_type, account, ",
            "status, version)",
            "values (#{id,jdbcType=VARCHAR}, #{userBasicId,jdbcType=VARCHAR}, ",
            "#{accountType,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
            "#{status,jdbcType=INTEGER}, #{version,jdbcType=INTEGER})"
    })
    int insert(UcUserOauth record);

    @InsertProvider(type = UcUserOauthSqlProvider.class, method = "insertSelective")
    int insertSelective(UcUserOauth record);

    @SelectProvider(type = UcUserOauthSqlProvider.class, method = "selectByExample")
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "user_basic_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "account_type", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "account", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
    })
    List<UcUserOauth> selectByExample(UcUserOauthExample example);

    @Select({
            "select",
            "id, user_basic_id, account_type, account, status, version",
            "from uc_user_oauth",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "user_basic_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "account_type", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "account", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
    })
    UcUserOauth selectByPrimaryKey(String id);

    @UpdateProvider(type = UcUserOauthSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcUserOauth record, @Param("example") UcUserOauthExample example);

    @UpdateProvider(type = UcUserOauthSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") UcUserOauth record, @Param("example") UcUserOauthExample example);

    @UpdateProvider(type = UcUserOauthSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcUserOauth record);

    @Update({
            "update uc_user_oauth",
            "set user_basic_id = #{userBasicId,jdbcType=VARCHAR},",
            "account_type = #{accountType,jdbcType=INTEGER},",
            "account = #{account,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "version = #{version,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcUserOauth record);
}