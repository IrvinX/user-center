package com.dbt.service;

import com.dbt.bean.Permission;
import com.dbt.dao.PermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PermissionService {
    @Autowired
	private PermissionDao permissionDao;
	
	public List<Permission> getByMap(Map<String,Object> map) {
	    return permissionDao.getByMap(map);
	}
	
	public Permission getById(Integer id) {
		return permissionDao.getById(id);
	}
    
}