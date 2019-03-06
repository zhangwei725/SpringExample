package com.wener.example.dao.impl;

import com.wener.example.annotations.User;
import com.wener.example.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author zhangwei
 */
@Repository()
public class UserDaoImpl implements UserDao {

    @Override
    public User login(String username, String password) {
        return null;
    }
}
