package com.learn.pattern.factory.simpleFactory.factory;

import com.learn.pattern.factory.simpleFactory.impl.CardPayment;
import com.learn.pattern.factory.simpleFactory.impl.Payment;
import com.learn.pattern.factory.simpleFactory.impl.PaypalPayment;
import com.learn.pattern.factory.simpleFactory.impl.UpiPayment;

public class PaymentFactory {

    public static Payment createPayment(String type) {

        return switch (type.toUpperCase()) {

            case "UPI" -> new UpiPayment();

            case "CARD" -> new CardPayment();

            case "PAYPAL" -> new PaypalPayment();

            default ->
                    throw new IllegalArgumentException(
                            "Unsupported payment type: " + type
                    );
        };
    }
}
