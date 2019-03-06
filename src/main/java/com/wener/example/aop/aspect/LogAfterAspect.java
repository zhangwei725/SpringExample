package com.wener.example.aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Aspect
//@Component
public class LogAfterAspect {

    /**
     * @Pointcut() 切入点表达式
     */
    @Pointcut("execution(* com.wener.example.aop.aspect.*.*(..))")
    public void logPointcut() {
        // log方法表示切入点签名
    }

    /**
     * 前置通知
     * value：指定切入点表达式或命名切入点；
     * argNames：与Schema方式配置中的同义；
     */
    @Before("logPointcut()")
    public void before() {
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     * value：指定切入点表达式或命名切入点；
     * argNames：与Schema方式配置中的同义；
     */
    @After(value = "logPointcut()")
    public void after() {
        System.out.println("后置通知");
    }

    /**
     * 环绕通知
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
     *    value：指定切入点表达式或命名切入点；
     *    pointcut：同样是指定切入点表达式或命名切入点，如果指定了将覆盖value属性指定的，pointcut具有高优先级；
     *    argNames：与Schema方式配置中的同义；
     *    returning：与Schema方式配置中的同义。
     */
    @AfterReturning(value = "logPointcut()")
    public Object afterReturning() {
        System.out.println("返回后通知");
        return null;
    }

    /**
     * value：指定切入点表达式或命名切入点；
     * pointcut：同样是指定切入点表达式或命名切入点，如果指定了将覆盖value属性指定的，pointcut具有高优先级；
     * argNames：与Schema方式配置中的同义；
     * throwing：与Schema方式配置中的同义。
     */
    @AfterThrowing(value = "logPointcut()", throwing = "exception")
    public void afterThrowing(Exception exception) {
        System.out.println("异常通知");
        System.out.println(exception.getMessage());
    }

}
