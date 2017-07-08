package com.footprint.common.dao;

import com.footprint.common.model.DUcUserPermission;
import com.footprint.common.model.DUcUserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcUserPermissionMapper {
    long countByExample(DUcUserPermissionExample example);

    int deleteByExample(DUcUserPermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcUserPermission record);

    int insertSelective(DUcUserPermission record);

    List<DUcUserPermission> selectByExample(DUcUserPermissionExample example);

    DUcUserPermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcUserPermission record, @Param("example") DUcUserPermissionExample example);

    int updateByExample(@Param("record") DUcUserPermission record, @Param("example") DUcUserPermissionExample example);

    int updateByPrimaryKeySelective(DUcUserPermission record);

    int updateByPrimaryKey(DUcUserPermission record);
}