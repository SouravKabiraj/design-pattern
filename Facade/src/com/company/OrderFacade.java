package com.company;

public class OrderFacade {
    public static void createOrder(Product product, String customer) {
        Payment payment = new Payment();
        payment.makePayment(customer, "Amazon", product.getCost());
        Order order = new Order(product, payment);
        System.out.println(order.getDetails());
    }
}
