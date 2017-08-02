package com.us.api;

import com.us.bean.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> getByMap(Map<String, Object> map);

    User getById(Integer id);

    User getByAccount(String account);
}