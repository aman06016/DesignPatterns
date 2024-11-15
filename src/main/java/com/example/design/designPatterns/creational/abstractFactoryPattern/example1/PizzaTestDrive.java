package com.example.design.designPatterns.creational.abstractFactoryPattern.example1;

import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizza.Pizza;
import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizzaStore.ChicagoStylePizzaStore;
import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizzaStore.NYStylePizzaStore;
import com.example.design.designPatterns.creational.abstractFactoryPattern.example1.pizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

    }
}
