package com.wener.example.dao;

import com.wener.example.annotations.User;

/**
 * @author zhangwei
 */
public interface UserDao {
    User login(String username, String password);
}
