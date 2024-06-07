package com.example.paymentservice.controller;

import com.example.paymentservice.dto.PaymentDto;
import com.example.paymentservice.service.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("payment")
    public String initiatePayment(@RequestBody PaymentDto payment) throws StripeException {
        return paymentService.initiatePayment(payment);

    }
}
