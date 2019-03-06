package com.wener.example.aop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

@Aspect
@Component
public class LogAdviceParamsAspect {

    @Before(value = "execution(* com.wener.example.aop.aspect.*.*(..))&& args(id,name)", argNames = "id,name")
    public void testArgs(Object id, Object name) {
        System.out.println(id);
        System.out.println(name);
    }

    @Around(value = "execution(* com.wener.example.aop.aspect.*.*(..))&&(args(id,name,..))", argNames = "pjp,id,name")
    public Object testAroundArgs(ProceedingJoinPoint pjp, Object id, Object name) throws Throwable {
        System.out.println("Around之前");
        Object obj = pjp.proceed();
        System.out.println();
        return obj;
    }

}
