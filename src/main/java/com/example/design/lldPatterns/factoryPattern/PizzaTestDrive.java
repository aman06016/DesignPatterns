package com.example.design.lldPatterns.factoryPattern;

import com.example.design.lldPatterns.factoryPattern.pizza.Pizza;
import com.example.design.lldPatterns.factoryPattern.pizzaStore.ChicagoStylePizzaStore;
import com.example.design.lldPatterns.factoryPattern.pizzaStore.NYStylePizzaStore;
import com.example.design.lldPatterns.factoryPattern.pizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

    }
}
