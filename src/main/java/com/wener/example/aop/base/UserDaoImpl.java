package com.wener.example.aop.base;

import com.wener.example.annotations.User;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("3.保存用户");
    }

    @Override
    public void testException() throws Exception {
        throw new Exception("Exception happened!");
    }

}