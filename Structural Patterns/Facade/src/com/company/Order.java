package com.company;

public class Order {
    private Product product;
    private Payment payment;

    public Order(Product product, Payment payment) {
        this.product = product;
        this.payment = payment;
    }

    public String getDetails() {
        return "Order{" +
                "product=" + product.toString() +
                ", payment=" + payment +
                '}';
    }
}
