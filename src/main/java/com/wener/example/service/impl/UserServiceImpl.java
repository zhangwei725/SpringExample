package com.wener.example.service.impl;

import com.wener.example.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Component
public class UserServiceImpl implements UserService {
    @Override
    public boolean save(String name) {
        System.out.println("开启事务");
        System.out.println("保存对象--->" + name);
        System.out.println("关闭事务");
        return false;
    }
    
    @Override
    public boolean delete(Long id) {
        System.out.println("开启事务");
        System.out.println("保存对象--->" + id);
        System.out.println("关闭事务");
        return false;
    }
}
