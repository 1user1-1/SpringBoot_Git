package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
//    private String name;
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("dog bean is created");
    }

//    @PostConstruct
//    protected void init(){
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    private void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }

//    public String getName(){
//        return name;
//    }
//
//    public void set Name(String name){
//        this.name=name;
//    }
}
