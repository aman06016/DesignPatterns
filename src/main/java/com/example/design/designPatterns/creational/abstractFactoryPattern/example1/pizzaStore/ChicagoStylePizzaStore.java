package com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizzaStore;

import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizza.ChicagoStyleCheesePizza;
import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizza.ChicagoStyleClamPizza;
import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizza.Pizza;



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