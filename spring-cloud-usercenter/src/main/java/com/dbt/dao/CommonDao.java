package com.dbt.dao;


import com.dbt.bean.Module;
import com.dbt.bean.Role;
import com.dbt.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface CommonDao {

    @SelectProvider(type = CommonSqlProvide.class, method = "findUserById")
    User findUserById(@Param("uid") Integer uid);

    @SelectProvider(type = CommonSqlProvide.class, method = "findUserByAccount")
    User findUserByAccount(@Param("account") String account);

    @SelectProvider(type = CommonSqlProvide.class, method = "findRolesByUserId")
    List<Role> findRolesByUserId(@Param("uid") Integer uid);

    @SelectProvider(type = CommonSqlProvide.class, method = "findModulesByRoleId")
    List<Module> findModulesByRoleId(@Param("rid") Integer rid);

}