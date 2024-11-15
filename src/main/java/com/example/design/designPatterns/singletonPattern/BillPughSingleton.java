package com.example.design.designPatterns.singletonPattern;

public class BillPughSingleton {
    // Private constructor to prevent instantiation
    private BillPughSingleton() {}

    // Static inner class responsible for holding the Singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}


