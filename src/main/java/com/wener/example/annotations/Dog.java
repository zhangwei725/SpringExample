package com.wener.example.annotations;

import com.wener.example.annotations.Animal;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Component
public class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("狗在走!!!");
    }
}
