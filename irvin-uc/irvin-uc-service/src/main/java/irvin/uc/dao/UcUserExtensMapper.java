package irvin.uc.dao;

import irvin.api.domain.UcUserExtens;
import irvin.uc.common.domain.UcUserExtensExample;
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

public interface UcUserExtensMapper {
    @SelectProvider(type=UcUserExtensSqlProvider.class, method="countByExample")
    long countByExample(UcUserExtensExample example);

    @DeleteProvider(type=UcUserExtensSqlProvider.class, method="deleteByExample")
    int deleteByExample(UcUserExtensExample example);

    @Delete({
        "delete from uc_user_extens",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into uc_user_extens (id, password, ",
        "salt, user_basic_id, ",
        "type)",
        "values (#{id,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{salt,jdbcType=VARCHAR}, #{userBasicId,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=INTEGER})"
    })
    int insert(UcUserExtens record);

    @InsertProvider(type=UcUserExtensSqlProvider.class, method="insertSelective")
    int insertSelective(UcUserExtens record);

    @SelectProvider(type=UcUserExtensSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="salt", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UcUserExtens> selectByExample(UcUserExtensExample example);

    @Select({
        "select",
        "id, password, salt, user_basic_id, type",
        "from uc_user_extens",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="password", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="salt", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    UcUserExtens selectByPrimaryKey(String id);

    @UpdateProvider(type=UcUserExtensSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcUserExtens record, @Param("example") UcUserExtensExample example);

    @UpdateProvider(type=UcUserExtensSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UcUserExtens record, @Param("example") UcUserExtensExample example);

    @UpdateProvider(type=UcUserExtensSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcUserExtens record);

    @Update({
        "update uc_user_extens",
        "set password = #{password,jdbcType=VARCHAR},",
          "salt = #{salt,jdbcType=VARCHAR},",
          "user_basic_id = #{userBasicId,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcUserExtens record);
}