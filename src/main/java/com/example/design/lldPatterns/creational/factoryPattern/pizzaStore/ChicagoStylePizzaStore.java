package com.example.design.lldPatterns.creational.factoryPattern.pizzaStore;

import com.example.design.lldPatterns.creational.factoryPattern.pizza.ChicagoStyleCheesePizza;
import com.example.design.lldPatterns.creational.factoryPattern.pizza.ChicagoStyleClamPizza;
import com.example.design.lldPatterns.creational.factoryPattern.pizza.Pizza;



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