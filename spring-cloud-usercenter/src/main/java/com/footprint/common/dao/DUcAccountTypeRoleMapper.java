package com.footprint.common.dao;

import com.footprint.common.model.DUcAccountTypeRole;
import com.footprint.common.model.DUcAccountTypeRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcAccountTypeRoleMapper {
    long countByExample(DUcAccountTypeRoleExample example);

    int deleteByExample(DUcAccountTypeRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcAccountTypeRole record);

    int insertSelective(DUcAccountTypeRole record);

    List<DUcAccountTypeRole> selectByExample(DUcAccountTypeRoleExample example);

    DUcAccountTypeRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcAccountTypeRole record, @Param("example") DUcAccountTypeRoleExample example);

    int updateByExample(@Param("record") DUcAccountTypeRole record, @Param("example") DUcAccountTypeRoleExample example);

    int updateByPrimaryKeySelective(DUcAccountTypeRole record);

    int updateByPrimaryKey(DUcAccountTypeRole record);
}