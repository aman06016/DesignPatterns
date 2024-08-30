package com.example.design.lldPatterns.strategyPattern;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("i am flying with wings");
    }
}
