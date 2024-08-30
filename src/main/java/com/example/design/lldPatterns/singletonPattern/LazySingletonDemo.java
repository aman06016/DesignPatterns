package com.example.design.lldPatterns.singletonPattern;

public class LazySingletonDemo {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        LazySingleton lazySingleton = LazySingleton.getInstance();

        // Call a method on the instance
        lazySingleton.showMessage();
    }
}
