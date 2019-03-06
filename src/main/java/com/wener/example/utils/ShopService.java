package com.wener.example.utils;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */
@Component
public class ShopService {
    @Resource
    DBManager dbManager;

    public void save(String name) {
        dbManager.open();
        dbManager.colse();
    }
}
