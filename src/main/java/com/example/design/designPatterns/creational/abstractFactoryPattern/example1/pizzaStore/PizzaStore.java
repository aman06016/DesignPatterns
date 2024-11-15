package com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizzaStore;

import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizza.Pizza;

public abstract class PizzaStore {

    protected Pizza pizza;

    public Pizza orderPizza(String type){
        this.pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
