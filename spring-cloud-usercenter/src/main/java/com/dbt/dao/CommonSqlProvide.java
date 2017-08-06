package com.dbt.dao;

public class CommonSqlProvide {

    public String findUserById(String uid) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from user where uid = " + uid);
        return sql.toString();
    }

    public String findUserByAccount(String account) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from user where username = " + account);
        return sql.toString();
    }

    public String findRolesByUserId(String uid) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from role where role.rid in (select rid from user_role where uid= " + uid + ")");
        return sql.toString();
    }

    public String findModulesByRoleId(String rid) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from module where module.mid in (select mid from module_role where rid= " + rid + ")");
        return sql.toString();
    }
}
