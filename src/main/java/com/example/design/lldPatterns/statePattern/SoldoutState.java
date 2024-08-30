package com.example.design.lldPatterns.statePattern;

// Concrete State - Sold Out State
class SoldoutState implements VendingMachineState {

  @Override
  public void insertCoin(VendingMachine machine) {
    System.out.println("Machine is sold out. Please come back later.");
  }

  @Override
  public void returnCoin(VendingMachine machine) {
    System.out.println("Machine is sold out. No coin to return.");
  }

  @Override
  public void selectProduct(VendingMachine machine, String product) {
    System.out.println("Machine is sold out.");
  }

  @Override
  public void dispenseProduct(VendingMachine machine) {
    System.out.println("Machine is sold out.");
  }
}