package com.wener.example.annotations;

import com.wener.example.annotations.Animal;
import org.springframework.stereotype.Component;


@Component
public class Cat implements Animal {

    @Override
    public void walk() {
        System.out.println("猫在走!!!");
    }
}
