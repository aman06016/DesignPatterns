package com.example.design.lldPatterns.creational.factoryPattern.example1.pizzaStore;

import com.example.design.lldPatterns.creational.factoryPattern.example1.pizza.NYStyleCheesePizza;
import com.example.design.lldPatterns.creational.factoryPattern.example1.pizza.NYStyleClamPizza;
import com.example.design.lldPatterns.creational.factoryPattern.example1.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals("clam")) {
            pizza =  new NYStyleClamPizza();
        }
        return pizza;
    }
}
