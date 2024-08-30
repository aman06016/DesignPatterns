package com.example.design.lldPatterns.strategyPattern;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }
}
