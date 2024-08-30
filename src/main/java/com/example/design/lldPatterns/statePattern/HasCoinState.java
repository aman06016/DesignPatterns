package com.example.design.lldPatterns.statePattern;


// Concrete State - Has Coin State
class HasCoinState implements VendingMachineState {

  @Override
  public void insertCoin(VendingMachine machine) {
    System.out.println("Coin already inserted. Please select a product.");
  }

  @Override
  public void returnCoin(VendingMachine machine) {
    machine.setState(new IdleState());
    System.out.println("Coin returned.");
  }

  @Override
  public void selectProduct(VendingMachine machine, String product) {
    if (machine.hasProduct(product)) {
      machine.setState(new SoldoutState());
      machine.dispenseProduct(product);
    } else {
      System.out.println("Product not available.");
    }
  }

  @Override
  public void dispenseProduct(VendingMachine machine) {
    System.out.println("Please select a product first.");
  }
}