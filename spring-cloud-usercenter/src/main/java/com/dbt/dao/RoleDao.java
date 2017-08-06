package com.dbt.dao;



import com.dbt.bean.Role;

import java.util.List;
import java.util.Map;

public interface RoleDao {

    List<Role> getByMap(Map<String, Object> map);

    Role getById(Integer id);
}