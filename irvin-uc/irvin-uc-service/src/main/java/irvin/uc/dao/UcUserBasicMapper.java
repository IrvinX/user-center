package irvin.uc.dao;

import irvin.api.domain.UcUserBasic;
import irvin.uc.common.domain.UcUserBasicExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface UcUserBasicMapper {
    @SelectProvider(type = UcUserBasicSqlProvider.class, method = "countByExample")
    long countByExample(UcUserBasicExample example);

    @DeleteProvider(type = UcUserBasicSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UcUserBasicExample example);

    @Delete({
            "delete from uc_user_basic",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into uc_user_basic (id, name, ",
            "age, birth, mobile, ",
            "email, english_name, ",
            "gender, status, ",
            "version)",
            "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{age,jdbcType=INTEGER}, #{birth,jdbcType=DATE}, #{mobile,jdbcType=VARCHAR}, ",
            "#{email,jdbcType=VARCHAR}, #{englishName,jdbcType=VARCHAR}, ",
            "#{gender,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, ",
            "#{version,jdbcType=INTEGER})"
    })
    int insert(UcUserBasic record);

    @InsertProvider(type = UcUserBasicSqlProvider.class, method = "insertSelective")
    int insertSelective(UcUserBasic record);

    @SelectProvider(type = UcUserBasicSqlProvider.class, method = "selectByExample")
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "age", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "birth", javaType = Date.class, jdbcType = JdbcType.DATE),
            @Arg(column = "mobile", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "english_name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "gender", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "status", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
    })
    List<UcUserBasic> selectByExample(UcUserBasicExample example);

    @Select({
            "select",
            "id, name, age, birth, mobile, email, english_name, gender, status, version",
            "from uc_user_basic",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column = "id", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true),
            @Arg(column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "age", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "birth", javaType = Date.class, jdbcType = JdbcType.DATE),
            @Arg(column = "mobile", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "english_name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "gender", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "status", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "version", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
    })
    UcUserBasic selectByPrimaryKey(String id);

    @UpdateProvider(type = UcUserBasicSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcUserBasic record, @Param("example") UcUserBasicExample example);

    @UpdateProvider(type = UcUserBasicSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") UcUserBasic record, @Param("example") UcUserBasicExample example);

    @UpdateProvider(type = UcUserBasicSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcUserBasic record);

    @Update({
            "update uc_user_basic",
            "set name = #{name,jdbcType=VARCHAR},",
            "age = #{age,jdbcType=INTEGER},",
            "birth = #{birth,jdbcType=DATE},",
            "mobile = #{mobile,jdbcType=VARCHAR},",
            "email = #{email,jdbcType=VARCHAR},",
            "english_name = #{englishName,jdbcType=VARCHAR},",
            "gender = #{gender,jdbcType=INTEGER},",
            "status = #{status,jdbcType=INTEGER},",
            "version = #{version,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcUserBasic record);
}