package com.wener.example.aop.base;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.rmi.RemoteException;

/**
 * 该接口上没有任何方法，但是实现了这个接口的类必须至少实现以下4个方法中的一个
 * 1.public void afterThrowing(Exception ex)
 * 2.public void afterThrowing(RemoteException)
 * 3.public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
 * 4.public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)
 */
public class TestThrowingAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        System.out.println("5.抛出异常" + ex.getMessage());
    }

//    public void afterThrowing(RemoteException re) {
//        System.out.println("5.抛出异常" + re.getMessage());
//
//    }

    /**
     * @param method 执行的方法
     * @param args   方法参数
     * @param target 代理的目标对象
     * @param ex     产生的异常
     */
//    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
//        System.out.println("出错的方法是: " + method.getName());
//        for (Object o : args) {
//            System.out.println("方法的参数：   " + o.toString());
//        }
//        System.out.println("目标对象的名称: " + target.getClass().getSimpleName());
//        System.out.println("错误的信息" + ex.getMessage());
//    }
//    public void afterThrowing(Method method, Object[] args, Object target, ServletException ex){
//
//    }


}
