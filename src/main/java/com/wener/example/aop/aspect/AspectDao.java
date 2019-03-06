package com.wener.example.aop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
public interface AspectDao {
    public void test();

    public void testParams(int id, String name);

}