package com.example.design.designPatterns.chainOfResponsibility.example1;

class BranchManager extends AbstractLoanApprover {

  public BranchManager(LoanApprover nextApprover) {
    super(nextApprover, "branchManger");
  }

  @Override
  protected boolean handleApproval(LoanApplication application) {
    return application.getAmount() <= 10000;
  }
}