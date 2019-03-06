package com.wener.example.aop.aspect;

import org.springframework.stereotype.Component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
//@Component
public class LogAspect {
    /**
     * @Pointcut() 切入点表达式
     */
    @Pointcut("execution(* com.wener.example.aop.aspect.*.*(..))")
    public void logPointcut() {

    }
    /**
     * @Before 前置通知
     * value：指定切入点表达式或命名切入点；
     * argNames：与Schema方式配置中的同义；
     */
    @Before("logPointcut()")
    public void before() {
        System.out.println("前置通知");
    }
    /**
     * @After 后置通知
     * value：指定切入点表达式或命名切入点；
     * argNames：与Schema方式配置中的同义；
     */
    @After(value = "logPointcut()")
    public void after() {
        System.out.println("后置通知");
    }
    /**
     * @Around 环绕通知
     * value：指定切入点表达式或命名切入点；
     * argNames：与Schema方式配置中的同义；
     */
    @Around(value = "logPointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知1");
        Object obj = pjp.proceed();
        System.out.println("环绕通知2");
        return obj;
    }
    /**
     *  @AfterReturning 返回通知
     *  参数说明
     *    value：指定切入点表达式或命名切入点；
     *    pointcut：指定切入点表达式或命名切入点，如果指定了将覆盖value属性指定的，pointcut具有高优先级；
     *    argNames：与Schema方式配置中的同义；
     *    returning：与Schema方式配置中的同义。
     */
    @AfterReturning(value = "logPointcut()")
    public Object afterReturning() {
        System.out.println("返回后通知");
        return null;
    }

    /**
     * @AfterThrowing 异常通知
     * 	value：指定切入点表达式或命名切入点；
     * 	pointcut：同样是指定切入点表达式或命名切入点，如果指定了将覆盖value属性指定的，pointcut具有高优先级；
     * 	argNames：参数名；
     * 	throwing：异常类型。
     */
    @AfterThrowing(value = "logPointcut()", throwing = "exception")
    public void afterThrowing(Exception exception) {
        System.out.println("异常通知");
    }
}