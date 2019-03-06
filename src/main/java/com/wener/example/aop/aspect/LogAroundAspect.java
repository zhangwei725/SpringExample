package com.wener.example.aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Aspect
//@Component
public class LogAroundAspect {

    /**
     * @Pointcut() 切入点表达式
     */
    @Pointcut("execution(* com.wener.example.aop.aspect.*.*(..))")
    public void logPointcut() {
        // log方法表示切入点签名
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

}
