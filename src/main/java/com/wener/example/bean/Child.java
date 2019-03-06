package com.wener.example.bean;

import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */

public class Child extends Parent {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
