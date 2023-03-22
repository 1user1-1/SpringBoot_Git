package com.example.demo;

import java.sql.SQLOutput;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
