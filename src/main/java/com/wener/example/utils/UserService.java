package com.wener.example.utils;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */

public class UserService {
    private DBManager manager = new DBManager();

    public void save() {
        manager.open();
        manager.begin();
        System.out.println("保存用户信息");
        manager.commit();
        manager.colse();
    }

    public void delete() {
        manager.open();
        manager.begin();
        System.out.println("删除用户");
        manager.commit();
        manager.colse();
    }
}
