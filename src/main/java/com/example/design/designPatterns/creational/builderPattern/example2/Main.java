package com.example.design.designPatterns.creational.builderPattern.example2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withId("1")
                .withAddress("noida")
                .withAge(12)
                .build();
        System.out.println(person);
    }

}
