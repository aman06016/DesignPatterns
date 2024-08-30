package com.example.design.lldPatterns.chainOfResponsibility;

// Abstract base class for concrete loan approvers
abstract class AbstractLoanApprover implements LoanApprover {

  private final LoanApprover nextApprover;

  public AbstractLoanApprover(LoanApprover nextApprover) {
    this.nextApprover = nextApprover;
  }

  @Override
  public void processLoan(LoanApplication application, LoanApprover nextApprover) {
    boolean approved = handleApproval(application);
    if (approved && nextApprover != null) {
      nextApprover.processLoan(application, null); // No further approver needed after approval
    } else if (!approved) {
      System.out.println("Loan application denied at " + this.getClass().getSimpleName() + " " + application.getAmount());
    }
  }

  abstract boolean handleApproval(LoanApplication application);
}