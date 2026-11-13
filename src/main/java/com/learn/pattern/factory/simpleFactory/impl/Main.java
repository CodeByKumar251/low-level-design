package com.learn.pattern.factory.simpleFactory.impl;

public class Main {

    public static void main(String[] args) {
        OrderService service = new OrderService();

        service.makePayment("UPI", 1000);
    }
}
