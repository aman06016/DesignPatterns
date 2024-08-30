package com.example.design.lldPatterns.chainOfResponsibility;


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