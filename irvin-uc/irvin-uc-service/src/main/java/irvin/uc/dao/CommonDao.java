package irvin.uc.dao;

import irvin.api.domain.Module;
import irvin.api.domain.Role;
import irvin.api.domain.User;
import irvin.uc.common.util.CommonSqlProvide;
import org.apache.ibatis.annotations.Mapper;
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