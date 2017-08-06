package com.dbt.dao;


import com.dbt.bean.Module;
import com.dbt.bean.Role;
import com.dbt.bean.User;
import com.dbt.util.CommonSqlProvide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface CommonDao {

    @SelectProvider(type = CommonSqlProvide.class, method = "findUserById")
    User findUserById(Integer uid);

    @SelectProvider(type = CommonSqlProvide.class, method = "findUserByAccount")
    User findUserByAccount(String username);

    @SelectProvider(type = CommonSqlProvide.class, method = "findRolesByUserId")
    List<Role> findRolesByUserId(Integer uid);

    @SelectProvider(type = CommonSqlProvide.class, method = "findModulesByRoleId")
    List<Module> findModulesByRoleId(Integer rid);

}