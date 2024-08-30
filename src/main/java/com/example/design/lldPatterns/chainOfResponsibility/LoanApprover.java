package com.example.design.lldPatterns.chainOfResponsibility;

// Interface defining the loan approval process


interface LoanApprover {
  void processLoan(LoanApplication application, LoanApprover nextApprover);
}