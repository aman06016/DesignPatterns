package com.example.design.lldPatterns.strategyPattern;

public class MallardDuck extends Duck{

    public MallardDuck(){
        super(new FlyWithWings(),new Quack());  // default style , u can change in main method , with using setter method.
    }

    @Override
    public void swim() {
        System.out.println("i am swimming in mallard style");
    }




}
