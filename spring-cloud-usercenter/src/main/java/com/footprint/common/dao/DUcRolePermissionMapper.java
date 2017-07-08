package com.footprint.common.dao;

import com.footprint.common.model.DUcRolePermission;
import com.footprint.common.model.DUcRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcRolePermissionMapper {
    long countByExample(DUcRolePermissionExample example);

    int deleteByExample(DUcRolePermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcRolePermission record);

    int insertSelective(DUcRolePermission record);

    List<DUcRolePermission> selectByExample(DUcRolePermissionExample example);

    DUcRolePermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcRolePermission record, @Param("example") DUcRolePermissionExample example);

    int updateByExample(@Param("record") DUcRolePermission record, @Param("example") DUcRolePermissionExample example);

    int updateByPrimaryKeySelective(DUcRolePermission record);

    int updateByPrimaryKey(DUcRolePermission record);
}