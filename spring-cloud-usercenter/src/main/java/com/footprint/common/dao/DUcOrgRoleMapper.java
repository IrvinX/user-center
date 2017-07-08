package com.footprint.common.dao;

import com.footprint.common.model.DUcOrgRole;
import com.footprint.common.model.DUcOrgRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgRoleMapper {
    long countByExample(DUcOrgRoleExample example);

    int deleteByExample(DUcOrgRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrgRole record);

    int insertSelective(DUcOrgRole record);

    List<DUcOrgRole> selectByExample(DUcOrgRoleExample example);

    DUcOrgRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrgRole record, @Param("example") DUcOrgRoleExample example);

    int updateByExample(@Param("record") DUcOrgRole record, @Param("example") DUcOrgRoleExample example);

    int updateByPrimaryKeySelective(DUcOrgRole record);

    int updateByPrimaryKey(DUcOrgRole record);
}