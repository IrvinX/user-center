package com.footprint.common.dao;

import com.footprint.common.model.DUcSysRole;
import com.footprint.common.model.DUcSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcSysRoleMapper {
    long countByExample(DUcSysRoleExample example);

    int deleteByExample(DUcSysRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcSysRole record);

    int insertSelective(DUcSysRole record);

    List<DUcSysRole> selectByExample(DUcSysRoleExample example);

    DUcSysRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcSysRole record, @Param("example") DUcSysRoleExample example);

    int updateByExample(@Param("record") DUcSysRole record, @Param("example") DUcSysRoleExample example);

    int updateByPrimaryKeySelective(DUcSysRole record);

    int updateByPrimaryKey(DUcSysRole record);
}