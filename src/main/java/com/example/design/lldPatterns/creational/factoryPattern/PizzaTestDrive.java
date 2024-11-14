package com.example.design.lldPatterns.creational.factoryPattern;

import com.example.design.lldPatterns.creational.factoryPattern.pizza.Pizza;
import com.example.design.lldPatterns.creational.factoryPattern.pizzaStore.ChicagoStylePizzaStore;
import com.example.design.lldPatterns.creational.factoryPattern.pizzaStore.NYStylePizzaStore;
import com.example.design.lldPatterns.creational.factoryPattern.pizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

    }
}
