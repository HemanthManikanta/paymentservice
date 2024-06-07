package com.example.paymentservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

    private Long amount;

    private String phoneNumber;

    private String email;

    private String name;

    private String orderId;
}
