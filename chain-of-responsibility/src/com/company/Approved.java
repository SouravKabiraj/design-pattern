package com.company;

public class Approved extends LoanApplicationStage {
    @Override
    public void processLoanApplication() {
        System.out.println("Processing LoanApplication[APPROVED]..");
    }
}
