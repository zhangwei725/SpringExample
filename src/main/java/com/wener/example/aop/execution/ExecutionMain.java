package com.wener.example.aop.execution;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author zhangwei
 */
public class ExecutionMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aspect.xml");
        ExecutionService service = context.getBean("service", ExecutionService.class);
        service.add("1111");
        service.test();
    }


}
