package com.footprint.common.dao;

import com.footprint.common.model.DUcUserRole;
import com.footprint.common.model.DUcUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcUserRoleMapper {
    long countByExample(DUcUserRoleExample example);

    int deleteByExample(DUcUserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcUserRole record);

    int insertSelective(DUcUserRole record);

    List<DUcUserRole> selectByExample(DUcUserRoleExample example);

    DUcUserRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcUserRole record, @Param("example") DUcUserRoleExample example);

    int updateByExample(@Param("record") DUcUserRole record, @Param("example") DUcUserRoleExample example);

    int updateByPrimaryKeySelective(DUcUserRole record);

    int updateByPrimaryKey(DUcUserRole record);
}