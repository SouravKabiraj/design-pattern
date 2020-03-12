package com.company;

public class Submitted extends LoanApplicationStage {

    @Override
    public void processLoanApplication() {
        System.out.println("Processing LoanApplication[SUBMITTED]..");
        this.processNextStage();
    }
}
