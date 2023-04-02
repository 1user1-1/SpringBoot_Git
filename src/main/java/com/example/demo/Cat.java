package com.example.demo;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say(){
        System.out.println("Meow-Meow");
    }

    public Cat() {
        System.out.println("Cat bean is created");
    }
}
