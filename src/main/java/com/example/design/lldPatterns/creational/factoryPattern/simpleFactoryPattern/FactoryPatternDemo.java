package com.example.design.lldPatterns.creational.factoryPattern.simpleFactoryPattern;

// Using the Factory pattern

//1. Factory Pattern
//The Factory Pattern is used to create instances of a single family of classes. It defines an interface for creating objects but lets subclasses alter the type of objects that will be created. The Factory Pattern is commonly used when:
//
//You have a superclass with multiple sub-classes and based on some input, you want to return one of the sub-classes.
//You need a simple way to create instances without exposing the instantiation logic.

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle object and draw it
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get a Rectangle object and draw it
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
