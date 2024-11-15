package com.example.design.lldPatterns.creational.factoryPattern.example1.pizza;

public class CheesePizza extends Pizza{
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