package com.example.design.lldPatterns.statePattern;

import java.util.HashMap;
import java.util.Map;










// Vending Machine Class (Context)
public class VendingMachine {

  private VendingMachineState state;
  private int coins;
  private Map<String, Integer> products;

  public VendingMachine() {
    this.state = new IdleState();
    this.coins = 0;
    this.products = new HashMap<>();
    // Initialize product availability
  }

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public boolean hasProduct(String product) {
    return products.containsKey(product) && products.get(product) > 0;
  }

  public void dispenseProduct(String product) {
    products.put(product, products.get(product) - 1);
    System.out.println("Dispensing " + product);
  }

  // Delegate methods to handle user actions based on current state
  public void insertCoin(String product) {
    state.insertCoin(this);
  }

  public void returnCoin() {
    state.returnCoin(this);
  }

  public void selectProduct(String product) {
    state.selectProduct(this, product);
  }
}

// Usage Example (optional)

