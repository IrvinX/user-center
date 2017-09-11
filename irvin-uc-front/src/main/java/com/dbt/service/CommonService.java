package com.dbt.service;

import irvin.common.domain.Module;
import irvin.common.domain.Role;
import irvin.common.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public User findUserByAccount(String username) {
		return new User(
				1,
				"admin",
				"admin"
		);
	}

	public List<Role> findRolesByUserId(Integer uid) {
		return new ArrayList<Role>() {
			{
				add(new Role(
						1,
						"管理员"
				));
			}
		};
	}

	public List<Module> findModulesByRoleId(Integer rid) {
		return new ArrayList<Module>() {
			{
				add(new Module(
						1,
						"admin"
				));
			}
		};
	}
}