package irvin.uc.service;

import irvin.common.domain.Module;
import irvin.common.domain.Role;
import irvin.common.domain.User;
import irvin.uc.dao.CommonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {

	@Autowired
	CommonDao commonDao;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public User findUserByAccount(String username) {
		logger.debug("[findUserByAccount]\t param : {}", username);
		return commonDao.findUserByAccount(username);
	}

	public List<Role> findRolesByUserId(Integer uid) {
		logger.debug("[findRolesByUserId]\t param : {}", uid);
		return commonDao.findRolesByUserId(uid);
	}

	public List<Module> findModulesByRoleId(Integer rid) {
		logger.debug("[findModulesByRoleId]\t param : {}", rid);
		return commonDao.findModulesByRoleId(rid);
	}
}