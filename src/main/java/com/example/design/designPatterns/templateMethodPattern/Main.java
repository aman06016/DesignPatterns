package com.example.design.designPatterns.templateMethodPattern;

// Abstract Beverage Class (Template)


// Coffee Class (Subclass)


// Tea Class (Subclass)


// Usage Example
public class Main {
  public static void main(String[] args) {
    Beverage coffee = new Coffee();
    coffee.prepareBeverage();

    System.out.println("-------");

    Beverage tea = new Tea();
    tea.prepareBeverage();
  }
}
