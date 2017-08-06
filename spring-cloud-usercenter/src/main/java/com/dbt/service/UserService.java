package com.dbt.service;

import com.dbt.bean.User;
import com.dbt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
	private UserDao userDao;
	
	public List<User> getByMap(Map<String,Object> map) {
	    return userDao.getByMap(map);
	}
	
	public User getById(Integer id) {
		return userDao.getById(id);
	}

}