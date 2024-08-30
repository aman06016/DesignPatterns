package com.example.design.lldPatterns.chainOfResponsibility;

// Concrete loan approver for higher loan amounts
class RegionalManager extends AbstractLoanApprover {

  public RegionalManager(LoanApprover nextApprover) {
    super(nextApprover);
  }

  @Override
  protected boolean handleApproval(LoanApplication application) {
    return application.getAmount() <= 25000;
  }
}