package com.dbt.mapper;

import com.dbt.model.UserRole;
import com.dbt.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}