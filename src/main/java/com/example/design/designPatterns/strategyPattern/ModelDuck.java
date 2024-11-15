package com.example.design.designPatterns.strategyPattern;

public class ModelDuck extends Duck{

    public ModelDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void swim() {
        System.out.println("i cant swim too");
    }
}
