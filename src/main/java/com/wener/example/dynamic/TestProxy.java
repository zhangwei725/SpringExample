package com.wener.example.dynamic;


public class TestProxy {
    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();

        UserDao userDao = (UserDao) proxy.newProxyInstance(new UserDaoImpl());
        userDao.add();
        userDao.delete();

        ShopDao shopDao = (ShopDao) proxy.newProxyInstance(new ShopDaoImpl());
        shopDao.addShop();

    }
}
