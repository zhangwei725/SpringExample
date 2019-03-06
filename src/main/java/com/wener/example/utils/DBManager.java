package com.wener.example.utils;

import org.springframework.stereotype.Component;

@Component
public class DBManager {

    public void open() {
        System.out.println("打开数据库...");
    }

    public void colse() {
        System.out.println("关闭数据库...");
    }

    public void begin() {
        System.out.println("开启事务");
    }

    public void commit() {
        System.out.println("提交事务");
    }
}
