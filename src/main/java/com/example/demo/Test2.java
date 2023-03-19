package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet1 = context.getBean("myPet", Pet.class);
        pet1.say();
        Pet pet2 = context.getBean("myCat", Pet.class);
        pet2.say();

        context.close();
    }
}
