package com.wener.example.aop.base;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知
 *
 * @author zhangwei
 */

public class TestBeforeAdvice implements MethodBeforeAdvice {
    /**
     * @param method 被调用的方法
     * @param args 方法参数
     * @param target 代理对象实例
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("1.前置通知");
    }

}
