package com.company;

public class KycInProgress extends LoanApplicationStage {
    @Override
    public void processLoanApplication() {
        System.out.println("Processing LoanApplication[KycInProgress]..");
    }
}
