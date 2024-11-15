package com.example.design.designPatterns.decoratorPattern;

class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0; // Base cost of the simple coffee
    }
}
