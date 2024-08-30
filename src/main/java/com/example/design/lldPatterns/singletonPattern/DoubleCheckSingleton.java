package com.example.design.lldPatterns.singletonPattern;

public class DoubleCheckSingleton {
    // Volatile keyword ensures visibility of changes to variables across threads
    private static volatile DoubleCheckSingleton instance;

    // Private constructor to prevent instantiation
    private DoubleCheckSingleton() {}

    // Public method to provide access to the instance
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}


