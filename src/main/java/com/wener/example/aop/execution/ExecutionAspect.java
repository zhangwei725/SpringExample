package com.wener.example.aop.execution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExecutionAspect {
    @Pointcut("execution(public * com.wener.example.aop.execution.ExecutionService.test())")
    public void execuPoint() {

    }

    @Before("execution(public * com.wener.example.aop.execution.ExecutionService.add(..))")
    public void execuBefore() {
        System.out.println("核心方法之前!!!");
    }

    @Before("execution(public * com.wener.example.aop.execution.ExecutionService.test(..))")
    public void execuAfter() {
        System.out.println("核心方法之前!!!");
    }

}
