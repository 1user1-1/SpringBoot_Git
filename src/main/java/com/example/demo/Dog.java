package com.example.demo;

public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("dog bean is created");
    }
}
