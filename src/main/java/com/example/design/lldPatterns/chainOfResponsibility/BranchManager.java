package com.example.design.lldPatterns.chainOfResponsibility;

class BranchManager extends AbstractLoanApprover {

  public BranchManager(LoanApprover nextApprover) {
    super(nextApprover);
  }

  @Override
  protected boolean handleApproval(LoanApplication application) {
    return application.getAmount() <= 10000;
  }
}