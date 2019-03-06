package com.wener.example.aop.pojo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 普通的java bean 该类不再需要实现任何接口或继承抽象类
 * 方法可以带一个JoinPoint连接点参数，用于获得连接点信息，如方法名，参数，代理对象等
 */
public class PojoAspect {

    /**
     * 前置通知
     *
     * @param jp
     */
    public void before(JoinPoint jp) {
        System.out.println("前置通知");
        System.out.println("方法名：" + jp.getSignature());
        System.out.println("，参数：" + jp.getArgs().length);
        System.out.println("代理对象：" + jp.getTarget());
    }

    /**
     * 后置通知
     *
     * @param jp
     */
    public void after(JoinPoint jp) {
        System.out.println("后置通知");
    }

    /**
     * 返回值通知
     *
     * @param joinPoint
     */
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("返回值通知");
    }

    /**
     * 抛出异常通知
     *
     * @param joinPoint
     */
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("抛出异常通知");
    }

    /**
     * 环绕通知
     *
     * @param pjd ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
     *            而且环绕通知必须有返回值，返回值即为目标方法的返回值
     * @return
     */
    public Object surround(ProceedingJoinPoint pjd) {
        System.out.println("环绕通知");
        return null;
    }

}
