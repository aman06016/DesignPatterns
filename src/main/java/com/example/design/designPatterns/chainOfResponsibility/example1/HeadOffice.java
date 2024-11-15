package com.example.design.designPatterns.chainOfResponsibility.example1;

// Concrete loan approver for very high loan amounts
class HeadOffice extends AbstractLoanApprover {

  public HeadOffice() {
    super(null,"head"); // No further approver for Head Office
  }

  @Override
  protected boolean handleApproval(LoanApplication application) {
    return application.getAmount() <= 50000;
  }
}