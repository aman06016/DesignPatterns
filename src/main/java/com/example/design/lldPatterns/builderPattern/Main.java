package com.example.design.lldPatterns.builderPattern;

import java.io.PrintStream;

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
