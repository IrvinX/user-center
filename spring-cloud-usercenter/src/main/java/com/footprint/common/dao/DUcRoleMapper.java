package com.footprint.common.dao;

import com.footprint.common.model.DUcRole;
import com.footprint.common.model.DUcRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcRoleMapper {
    long countByExample(DUcRoleExample example);

    int deleteByExample(DUcRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcRole record);

    int insertSelective(DUcRole record);

    List<DUcRole> selectByExample(DUcRoleExample example);

    DUcRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcRole record, @Param("example") DUcRoleExample example);

    int updateByExample(@Param("record") DUcRole record, @Param("example") DUcRoleExample example);

    int updateByPrimaryKeySelective(DUcRole record);

    int updateByPrimaryKey(DUcRole record);
}