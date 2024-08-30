package com.example.design.lldPatterns.singletonPattern;

public class Main {
  public static void main(String[] args) {
    Logger logger1 = Logger.getInstance();
    logger1.log("This is the first log message.");

    Logger logger2 = Logger.getInstance(); // Retrieves the same instance
    logger2.log("This is the second log message.");


    System.out.println(logger1.hashCode());
    System.out.println(logger2.hashCode());
    // Both logger1 and logger2 will point to the same Logger object
  }
}