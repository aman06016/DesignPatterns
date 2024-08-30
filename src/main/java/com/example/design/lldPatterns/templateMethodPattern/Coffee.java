package com.example.design.lldPatterns.templateMethodPattern;

class Coffee extends Beverage {

  @Override
  public void brew() {
    System.out.println("Brewing coffee grinds...");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk to coffee...");
  }
}