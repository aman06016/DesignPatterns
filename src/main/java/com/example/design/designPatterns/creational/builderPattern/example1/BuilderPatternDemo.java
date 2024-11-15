package com.example.design.designPatterns.creational.builderPattern.example1;


// The Builder Pattern is a creational design pattern that provides a flexible
// way to construct complex objects. It allows you to create objects step-by-step
// by configuring various parts of the object and then “building” it all at once.
// This pattern is especially useful when an object has multiple optional properties
// or requires a lot of configuration.
//

public class BuilderPatternDemo {
    public static void main(String[] args) {

        // Creating an order with main dish, drink, and dessert
        Order order1 = new Order.OrderBuilder("Burger")
                .drink("Coke")
                .dessert("Ice Cream")
                .build();

        // Creating an order with main dish, side dish, drink, and extra options
        Order order2 = new Order.OrderBuilder("Pizza")
                .sideDish("Garlic Bread")
                .drink("Pepsi")
                .hasCutlery(true)
                .hasNapkin(true)
                .build();

        // Creating an order with only the main dish
        Order order3 = new Order.OrderBuilder("Salad")
                .build();

        // Print orders to verify
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}
