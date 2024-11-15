package com.example.design.designPatterns.chainOfResponsibility.example1;


// Class representing a Loan Application
class LoanApplication {
  private final double amount;

  public LoanApplication(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }
}