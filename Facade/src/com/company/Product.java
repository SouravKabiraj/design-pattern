package com.company;

public class Product {
    private int cost;

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                '}';
    }

    public int getCost() {
        return cost;
    }

    Product(int cost) {
        this.cost = cost;
    }
}
