package com.example.design.lldPatterns.strategyPattern;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("i cant fly");
    }
}
