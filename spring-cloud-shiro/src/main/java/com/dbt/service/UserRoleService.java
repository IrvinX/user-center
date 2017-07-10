package com.dbt.service;

import com.dbt.model.UserRole;

/**
 * Created by irvin on 2017/7/9.
 */
public interface UserRoleService extends IService<UserRole> {

    public void addUserRole(UserRole userRole);
}
