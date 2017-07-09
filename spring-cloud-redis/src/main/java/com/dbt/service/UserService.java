package com.dbt.service;

import com.github.pagehelper.PageInfo;
import com.dbt.model.User;

/**
 * Created by irvin on 2017/7/9.
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
