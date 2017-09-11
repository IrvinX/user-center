package irvin.uc.common.util;

public class CommonSqlProvide {

    public String findUserById(Integer uid) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from user where uid = #{uid}");
        return sql.toString();
    }

    public String findUserByAccount(String username) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from user where username = #{username}");
        System.out.println(sql.toString());
        return sql.toString();
    }

    public String findRolesByUserId(Integer uid) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from role where role.rid in (select rid from user_role where uid=  #{uid})");
        return sql.toString();
    }

    public String findModulesByRoleId(Integer rid) {
        StringBuffer sql = new StringBuffer();
        sql.append("select * from module where module.mid in (select mid from module_role where rid= #{rid})");
        return sql.toString();
    }
}
