package com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizza;

public class ChicagoStyleClamPizza extends Pizza{
    @Override
    public void bake() {
        System.out.println("im baking");
    }

    @Override
    public void cut() {
        System.out.println("im cutting");
    }

    @Override
    public void box() {
        System.out.println("im boxing");
    }
}
