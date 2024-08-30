package com.example.design.lldPatterns.singletonPattern;

public class EagerSingleton {
    // Eagerly creating the singleton instance
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {}

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

