package com.dbt.mapper;

import com.dbt.model.Role;
import com.dbt.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}