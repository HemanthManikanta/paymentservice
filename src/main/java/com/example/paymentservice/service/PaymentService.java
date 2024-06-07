package com.example.paymentservice.service;

import com.example.paymentservice.client.PaymentGateWay;
import com.example.paymentservice.client.PaymentGatewayClient;
import com.example.paymentservice.dto.PaymentDto;
import com.stripe.exception.StripeException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentService {

  @Autowired
    PaymentGatewayClient paymentGatewayClient;



    public String initiatePayment(PaymentDto paymentDto, String gateway) throws StripeException {
     PaymentGateWay paymentGateWay =  paymentGatewayClient.getPaymentGateWay(gateway);
     return paymentGateWay.getPaymentLink(paymentDto);

    }
}
