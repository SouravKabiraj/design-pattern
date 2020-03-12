package com.company;

public class Investor {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public void listen(Stock stock) {
        System.out.println( name+ " is listening : Change in " + stock.getSymbol() + " PRICE: " + stock.getPrice());
    }
}
