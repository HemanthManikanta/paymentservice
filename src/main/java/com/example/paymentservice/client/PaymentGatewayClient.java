package com.example.paymentservice.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayClient {

    @Autowired
    StripeAPIPayment stripeAPIPayment;

    public PaymentGateWay getPaymentGateWay(String gateway) {
        if (gateway.equals("stripe")) {
            return stripeAPIPayment;
        }

        if (gateway.equals("razorpay")) {
            return null;
        }

        throw  new RuntimeException("no payment gateway available");

    }
}
