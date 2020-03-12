package com.company;

public class Main {

    public static void main(String[] args) {
        Stock google = new Stock("GOG");
        Stock microsoft = new Stock("MIC");

        google.addObserver(new Investor("A"));
        google.addObserver(new Investor("B"));
        google.addObserver(new Investor("C"));

        microsoft.addObserver(new Investor("M"));
        microsoft.addObserver(new Investor("N"));
        microsoft.addObserver(new Investor("O"));
        microsoft.addObserver(new Investor("P"));

        google.updatePrice(200);
        google.updatePrice(201);
        google.updatePrice(203);
        google.updatePrice(204);
        google.updatePrice(199);

        microsoft.updatePrice(199);
        microsoft.updatePrice(200);
        microsoft.updatePrice(203);
        microsoft.updatePrice(204);
        microsoft.updatePrice(199);
    }
}
