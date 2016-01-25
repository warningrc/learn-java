package com.warningrc.test.mybatis.dao;

import java.util.List;

import com.warningrc.test.mybatis.entity.User;

public interface UserDao {
    User getUserById(long userId);

    List<User> getAllUser();
    
    User updateUser(User user);
}
