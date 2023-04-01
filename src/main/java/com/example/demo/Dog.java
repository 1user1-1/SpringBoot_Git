package com.example.demo;

public class Dog implements Pet{
//    private String name;
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("dog bean is created");
    }

    protected void init(){
        System.out.println("Class Dog: init method");
    }

    private void destroy(){
        System.out.println("Class Dog: destroy method");
    }

//    public String getName(){
//        return name;
//    }
//
//    public void set Name(String name){
//        this.name=name;
//    }
}
