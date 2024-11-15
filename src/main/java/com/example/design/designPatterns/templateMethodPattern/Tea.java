package com.example.design.designPatterns.templateMethodPattern;

class Tea extends Beverage {

  @Override
  public void brew() {
    System.out.println("Steeping the tea bag...");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon to tea...");
  }

  // Override hook method (optional)
  @Override
  public boolean customerWantsCondiments() {
    return false; // Tea might not always need condiments by default
  }
}