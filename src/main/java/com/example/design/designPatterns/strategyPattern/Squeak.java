package com.example.design.designPatterns.strategyPattern;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }
}
