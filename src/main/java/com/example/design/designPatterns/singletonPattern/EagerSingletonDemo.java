package com.example.design.designPatterns.singletonPattern;

public class EagerSingletonDemo {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        // Call a method on the instance
        eagerSingleton.showMessage();
    }
}
