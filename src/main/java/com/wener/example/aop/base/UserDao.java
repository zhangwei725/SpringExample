package com.wener.example.aop.base;

import com.wener.example.annotations.User;

/**
 * @author zhangwei
 */
public interface UserDao {
    /**
     * @param user
     */
    public void save(User user);

    public void testException() throws Exception;
}