package irvin.uc.dao;

import irvin.api.domain.UcUserExternal;
import irvin.uc.common.domain.UcUserExternalExample;
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

public interface UcUserExternalMapper {
    @SelectProvider(type=UcUserExternalSqlProvider.class, method="countByExample")
    long countByExample(UcUserExternalExample example);

    @DeleteProvider(type=UcUserExternalSqlProvider.class, method="deleteByExample")
    int deleteByExample(UcUserExternalExample example);

    @Delete({
        "delete from uc_user_external",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into uc_user_external (id, user_basic_id, ",
        "status)",
        "values (#{id,jdbcType=VARCHAR}, #{userBasicId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(UcUserExternal record);

    @InsertProvider(type=UcUserExternalSqlProvider.class, method="insertSelective")
    int insertSelective(UcUserExternal record);

    @SelectProvider(type=UcUserExternalSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UcUserExternal> selectByExample(UcUserExternalExample example);

    @Select({
        "select",
        "id, user_basic_id, status",
        "from uc_user_external",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    UcUserExternal selectByPrimaryKey(String id);

    @UpdateProvider(type=UcUserExternalSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcUserExternal record, @Param("example") UcUserExternalExample example);

    @UpdateProvider(type=UcUserExternalSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UcUserExternal record, @Param("example") UcUserExternalExample example);

    @UpdateProvider(type=UcUserExternalSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcUserExternal record);

    @Update({
        "update uc_user_external",
        "set user_basic_id = #{userBasicId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcUserExternal record);
}