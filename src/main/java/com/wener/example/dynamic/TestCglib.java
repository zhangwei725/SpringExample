package com.wener.example.dynamic;

public class TestCglib {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        //通过生成子类的方式创建代理类
        UserDaoImpl dao = (UserDaoImpl) proxy.getProxy(UserDaoImpl.class);
        dao.add();
    }
}
