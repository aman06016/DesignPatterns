package com.example.design.designPatterns.chainOfResponsibility.example1;

// Abstract base class for concrete loan approvers
abstract class AbstractLoanApprover implements LoanApprover {

  private final LoanApprover nextApprover;
  private String name ;

  public AbstractLoanApprover(LoanApprover nextApprover,String name) {
    this.nextApprover = nextApprover;
    this.name = name;
  }

  @Override
  public void processLoan(LoanApplication application) {
    boolean approved = handleApproval(application);

    if(approved){
      System.out.println(String.format("Loan application is approved by %s ",name));
    }
    else{
      if(nextApprover!=null){
        nextApprover.processLoan(application);
      }
      else{
        System.out.println("Loan application denied at " + this.getClass().getSimpleName() + " " + application.getAmount());
      }
    }
//    if (!approved && nextApprover != null) {
//      nextApprover.processLoan(application); // No further approver needed after approval
//    }
//    else if(approved && nextApprover != null){
//      System.out.println("load is approved by all 3 manager");
//    }
//    else if (!approved) {
//      System.out.println("Loan application denied at " + this.getClass().getSimpleName() + " " + application.getAmount());
//    }

  }

  abstract boolean handleApproval(LoanApplication application);
}