package com.footprint.common.dao;

import com.footprint.common.model.DUcPermission;
import com.footprint.common.model.DUcPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcPermissionMapper {
    long countByExample(DUcPermissionExample example);

    int deleteByExample(DUcPermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcPermission record);

    int insertSelective(DUcPermission record);

    List<DUcPermission> selectByExample(DUcPermissionExample example);

    DUcPermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcPermission record, @Param("example") DUcPermissionExample example);

    int updateByExample(@Param("record") DUcPermission record, @Param("example") DUcPermissionExample example);

    int updateByPrimaryKeySelective(DUcPermission record);

    int updateByPrimaryKey(DUcPermission record);
}