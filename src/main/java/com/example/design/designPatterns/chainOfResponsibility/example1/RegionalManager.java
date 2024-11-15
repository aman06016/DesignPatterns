package com.example.design.designPatterns.chainOfResponsibility.example1;

// Concrete loan approver for higher loan amounts
class RegionalManager extends AbstractLoanApprover {

  public RegionalManager(LoanApprover nextApprover) {
    super(nextApprover,"regional");
  }

  @Override
  protected boolean handleApproval(LoanApplication application) {
    return application.getAmount() <= 25000;
  }
}