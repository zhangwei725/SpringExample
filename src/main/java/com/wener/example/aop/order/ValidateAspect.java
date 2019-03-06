package com.wener.example.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidateAspect implements Ordered {
    @Override
    public int getOrder() {
        return 1;
    }
}
