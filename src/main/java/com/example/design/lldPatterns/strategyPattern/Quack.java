package com.example.design.lldPatterns.strategyPattern;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
