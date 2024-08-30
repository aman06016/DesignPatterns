package com.example.design.lldPatterns.statePattern;

// Interface for the Vending Machine State (Context)
interface VendingMachineState {
  void insertCoin(VendingMachine machine);
  void returnCoin(VendingMachine machine);
  void selectProduct(VendingMachine machine, String product);
  void dispenseProduct(VendingMachine machine);
}