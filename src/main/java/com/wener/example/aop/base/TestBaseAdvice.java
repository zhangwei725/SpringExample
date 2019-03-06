package com.wener.example.aop.base;

import com.wener.example.annotations.User;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author zhangwei
 */
public class TestBaseAdvice {
    public static void main(String[] args) throws Exception {
        //实例化Spring代理工厂
        ProxyFactory factory = new ProxyFactory();
        //设置被代理的对象
        factory.setTarget(new UserDaoImpl());
        //添加通知，横切逻辑
        factory.addAdvice(new TestAfterAdvice());
        factory.addAdvice(new TestBeforeAdvice());
        factory.addAdvice(new TestSurroundAdvice());
        factory.addAdvice(new TestThrowingAdvice());
        //从代理工厂中获得代理对象
        UserDao dao = (UserDao) factory.getProxy();
        dao.save(new User());
        dao.testException();

    }
}
