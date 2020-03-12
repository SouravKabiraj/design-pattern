package com.company;

import java.util.ArrayList;

public class Stock {
    private String symbol;
    private int price;
    private ArrayList<Investor> observers;

    public String getSymbol() {
        return symbol;
    }

    public int getPrice() {
        return price;
    }

    private void notifyObservers() {
        observers.forEach(observer -> {
            observer.listen(this);
        });
    }

    public Stock(String symbol) {
        this.symbol = symbol;
        this.observers = new ArrayList<Investor>();
    }

    public void addObserver(Investor investor) {
        observers.add(investor);
    }

    public void updatePrice(int price) {
        this.price = price;
        notifyObservers();
    }
}
