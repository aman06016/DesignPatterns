package com.example.design.designPatterns.chainOfResponsibility.example1;

// Interface defining the loan approval process


interface LoanApprover {
  void processLoan(LoanApplication application);
}