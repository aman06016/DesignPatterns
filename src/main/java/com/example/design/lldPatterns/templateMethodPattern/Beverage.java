package com.example.design.lldPatterns.templateMethodPattern;

abstract class Beverage {

  public final void prepareBeverage() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
    cleanUp();
  }

  // Template methods to be overridden by subclasses
  public abstract void brew();
  public abstract void addCondiments();

  // Default implementations (can be overridden)
  public void boilWater() {
    System.out.println("Boiling water...");
  }

  public void pourInCup() {
    System.out.println("Pouring into cup...");
  }

  public void cleanUp() {
    System.out.println("Cleaning up...");
  }

  // Hook method to check for condiments (can be overridden)
  public boolean customerWantsCondiments() {
    return true;
  }
}