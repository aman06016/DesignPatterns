package com.example.design.designPatterns.singletonPattern;

public class DoubleCheckedSingletonDemo {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();

        // Call a method on the instance
        doubleCheckSingleton.showMessage();
    }
}