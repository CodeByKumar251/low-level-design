package com.learn.pattern.factory.simpleFactory.impl;

import com.learn.pattern.factory.simpleFactory.factory.PaymentFactory;
/*
Client
 */
public class OrderService {
    public void makePayment(String paymentType, double amount) {

        Payment payment =PaymentFactory.createPayment(paymentType);
        payment.pay(amount);
    }
}
