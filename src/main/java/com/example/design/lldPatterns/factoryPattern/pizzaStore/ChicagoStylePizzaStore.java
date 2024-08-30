package com.example.design.lldPatterns.factoryPattern.pizzaStore;

import com.example.design.lldPatterns.factoryPattern.pizza.*;


public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }
        else if(type.equals("clam")) {
            pizza =  new ChicagoStyleClamPizza();
        }
        return pizza;
    }
}