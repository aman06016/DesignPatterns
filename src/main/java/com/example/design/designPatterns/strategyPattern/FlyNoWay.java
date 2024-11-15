package com.example.design.designPatterns.strategyPattern;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("i cant fly");
    }
}
