package com.example.design.lldPatterns.chainOfResponsibility;

// Concrete loan approver for very high loan amounts
class HeadOffice extends AbstractLoanApprover {

  public HeadOffice() {
    super(null); // No further approver for Head Office
  }

  @Override
  protected boolean handleApproval(LoanApplication application) {
    return true; // Head Office approves all remaining applications
  }
}