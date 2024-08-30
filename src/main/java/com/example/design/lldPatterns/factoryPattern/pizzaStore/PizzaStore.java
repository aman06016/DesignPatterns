package com.example.design.lldPatterns.factoryPattern.pizzaStore;

import com.example.design.lldPatterns.factoryPattern.pizza.Pizza;

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
