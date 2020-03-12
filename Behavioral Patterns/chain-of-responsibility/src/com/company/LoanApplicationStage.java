package com.company;

public abstract class LoanApplicationStage {
    private LoanApplicationStage successor;

    public LoanApplicationStage getSuccessor() {
        return successor;
    }

    public void setSuccessor(LoanApplicationStage successor) {
        this.successor = successor;
    }

    public abstract void processLoanApplication();

    public void processNextStage() {
        this.successor.processLoanApplication();
        if (this.successor.getSuccessor() != null) {
            this.successor.processNextStage();
        }
    }
}
