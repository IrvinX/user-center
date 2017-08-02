package com.uc.dao;

import com.uc.bean.Permission;

import java.util.List;
import java.util.Map;

public interface PermissionDao {

    List<Permission> getByMap(Map<String, Object> map);

    Permission getById(Integer id);

    List<Permission> getList();

    List<Permission> getByUserId(Integer userId);

}