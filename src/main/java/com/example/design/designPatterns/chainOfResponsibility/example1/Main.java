package com.example.design.designPatterns.chainOfResponsibility.example1;





// Concrete loan approver for basic loan amounts









// Usage Example
public class Main {
  public static void main(String[] args) {
    LoanApprover headOffice = new HeadOffice();
    LoanApprover regionalManager = new RegionalManager(headOffice);
    LoanApprover branchManager = new BranchManager(regionalManager);

    LoanApplication application1 = new LoanApplication(5000); // Approved by Branch Manager
    LoanApplication application2 = new LoanApplication(15000); // Approved by Regional Manager
    LoanApplication application3 = new LoanApplication(30000); // Approved by Head Office

    branchManager.processLoan(application1);
    branchManager.processLoan(application2);
    branchManager.processLoan(application3);
  }
}
