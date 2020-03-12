package com.company;

public class Main {

    public static void main(String[] args) {
        Submitted submitted = new Submitted();
        KycInProgress kycInProgress = new KycInProgress();
        Approved approved = new Approved();
        submitted.setSuccessor(kycInProgress);
        kycInProgress.setSuccessor(approved);
        submitted.processLoanApplication();
    }
}
