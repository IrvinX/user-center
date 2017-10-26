package irvin.uc.dao;

import irvin.api.domain.UcUserInternal;
import irvin.uc.common.domain.UcUserInternalExample;
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

public interface UcUserInternalMapper {
    @SelectProvider(type=UcUserInternalSqlProvider.class, method="countByExample")
    long countByExample(UcUserInternalExample example);

    @DeleteProvider(type=UcUserInternalSqlProvider.class, method="deleteByExample")
    int deleteByExample(UcUserInternalExample example);

    @Delete({
        "delete from uc_user_internal",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into uc_user_internal (id, user_basic_id, ",
        "status)",
        "values (#{id,jdbcType=VARCHAR}, #{userBasicId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(UcUserInternal record);

    @InsertProvider(type=UcUserInternalSqlProvider.class, method="insertSelective")
    int insertSelective(UcUserInternal record);

    @SelectProvider(type=UcUserInternalSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UcUserInternal> selectByExample(UcUserInternalExample example);

    @Select({
        "select",
        "id, user_basic_id, status",
        "from uc_user_internal",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="user_basic_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    UcUserInternal selectByPrimaryKey(String id);

    @UpdateProvider(type=UcUserInternalSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UcUserInternal record, @Param("example") UcUserInternalExample example);

    @UpdateProvider(type=UcUserInternalSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UcUserInternal record, @Param("example") UcUserInternalExample example);

    @UpdateProvider(type=UcUserInternalSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UcUserInternal record);

    @Update({
        "update uc_user_internal",
        "set user_basic_id = #{userBasicId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UcUserInternal record);
}