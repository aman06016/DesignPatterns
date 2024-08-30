package com.example.design.lldPatterns.statePattern;

// Concrete State - Idle State
class IdleState implements VendingMachineState {

  @Override
  public void insertCoin(VendingMachine machine) {
    machine.setState(new HasCoinState());
    System.out.println("Coin inserted. Now accepting product selection.");
  }

  @Override
  public void returnCoin(VendingMachine machine) {
    System.out.println("No coin to return. Machine is idle.");
  }

  @Override
  public void selectProduct(VendingMachine machine, String product) {
    System.out.println("Please insert a coin first.");
  }

  @Override
  public void dispenseProduct(VendingMachine machine) {
    System.out.println("No product selected or coin inserted.");
  }
}