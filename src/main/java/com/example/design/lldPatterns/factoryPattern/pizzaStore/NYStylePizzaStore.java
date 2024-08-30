package com.example.design.lldPatterns.factoryPattern.pizzaStore;

import com.example.design.lldPatterns.factoryPattern.pizza.NYStyleCheesePizza;
import com.example.design.lldPatterns.factoryPattern.pizza.NYStyleClamPizza;
import com.example.design.lldPatterns.factoryPattern.pizza.Pizza;

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
