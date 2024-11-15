package com.example.design.designPatterns.strategyPattern;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
