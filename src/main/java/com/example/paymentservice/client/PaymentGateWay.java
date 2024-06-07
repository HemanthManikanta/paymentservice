package com.example.paymentservice.client;

import com.example.paymentservice.dto.PaymentDto;
import com.stripe.exception.StripeException;

public interface PaymentGateWay {

    String getPaymentLink(PaymentDto paymentDto) throws StripeException;
}
