package com.wener.example.aop.aspect;


import org.aopalliance.intercept.Joinpoint;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Component("aspectDao")
public class AspectDaoImpl implements AspectDao {

    @Override
    public void test() {
        System.out.println("核心测试方法");
    }

    @Override
    public void testParams(int id, String name) {
        System.out.println("带参数的方法:" + "ID:" + id + "name:" + name);
    }




}