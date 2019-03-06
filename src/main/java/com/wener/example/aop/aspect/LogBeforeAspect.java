package com.wener.example.aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Aspect
//@Component
public class LogBeforeAspect {

    /**
     * @Pointcut() 切入点表达式
     */
    @Pointcut(value = "execution(* com.wener.example.aop.aspect.*.*(..))")
    public void logPointcut() {
        // log方法表示切入点签名
    }

    //    @Before("execution(* com.wener.example.aop.aspect.*.*(..))")
    //    public void before() {
    //        System.out.println("前置通知");
    //    }

    /**
     * 前置通知
     * value：指定切入点表达式或命名切入点；
     * argNames：用于接受目标方法的参数；
     * 使用注意
     *args()是用来匹配并且接收目标方法的参数的.
     *
     * argNames(用在注解中)与arg-names(用在XML中),他们是同一个东西.
     *
     * argNames用来接收AspectJ表达式中的参数(其中也包含args).
     *
     *可以通过调整argNames参数名的顺序,来调整参数传值的顺序
     *
     */
    @Before(value = "execution(* com.wener.example.aop.aspect.*.*(..))&& args(id,name)", argNames = "id, name")
    public void before(int id, String name) {
        System.out.println("前置通知带参数");
    }


}
