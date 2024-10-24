package com.example.design.lldPatterns.strategyPattern;

import java.util.Map;

public class Operate {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setQuackBehaviour(new Squeak());
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.quack();

        ModelDuck modelDuck = new ModelDuck(new FlyNoWay(), new Squeak() );
        modelDuck.swim();
        modelDuck.fly();
        modelDuck.quack();

    }
}
