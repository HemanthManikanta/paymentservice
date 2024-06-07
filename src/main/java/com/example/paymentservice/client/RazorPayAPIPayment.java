package com.example.paymentservice.client;

import com.example.paymentservice.dto.PaymentDto;
import com.stripe.exception.StripeException;

public class RazorPayAPIPayment implements PaymentGateWay{
    @Override
    public String getPaymentLink(PaymentDto paymentDto) throws StripeException {
        return null;
    }
}
