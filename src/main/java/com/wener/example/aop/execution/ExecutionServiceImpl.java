package com.wener.example.aop.execution;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("service")
public class ExecutionServiceImpl implements ExecutionService {


    @Override
    public void test() {
        System.out.println("测试方法核心代码!!!");
    }

    @Override
    public int add(String name) {
        System.out.println("添加的方法核心代码!!!");
        return 0;
    }
}
