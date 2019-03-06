package com.wener.example.aop.base;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置通知
 */
public class TestAfterAdvice implements AfterReturningAdvice {
    /**
     * @param returnValue 返回值
     * @param method      被调用的方法
     * @param args        方法参数
     * @param target      被代理对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("5.后置通知");
    }
}
