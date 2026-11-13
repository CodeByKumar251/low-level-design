package com.learn.pattern.factory.simpleFactory.impl;

public class PaypalPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paying Rs" + amount + " using Paypal");
    }
}
