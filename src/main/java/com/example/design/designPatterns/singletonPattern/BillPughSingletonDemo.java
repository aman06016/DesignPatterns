package com.example.design.designPatterns.singletonPattern;

public class BillPughSingletonDemo {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();

        // Call a method on the instance
        billPughSingleton.showMessage();
    }
}