package com.example.paymentservice.client;

import com.example.paymentservice.dto.PaymentDto;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.model.Price;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PriceCreateParams;
import org.springframework.stereotype.Component;

import java.util.Currency;

@Component
public class StripeAPIPayment implements PaymentGateWay {
    @Override
    public String getPaymentLink(PaymentDto paymentDto) throws StripeException {

        Stripe.apiKey = "sk_test_5****j";

        PaymentLinkCreateParams params =
                PaymentLinkCreateParams.builder()
                        .addLineItem(
                                PaymentLinkCreateParams.LineItem.builder()
                                        .setPrice(price(paymentDto.getAmount()).getId())
                                        .setQuantity(1L)
                                        .build()
                        )
                        .build();

        PaymentLink paymentLink = PaymentLink.create(params);
        return paymentLink.getUrl();
    }


    public Price price(Long amount) throws StripeException {

        PriceCreateParams priceCreateParams = PriceCreateParams.builder().setCurrency("usd").setUnitAmount(amount).setRecurring(PriceCreateParams.Recurring.builder()
                .setInterval(PriceCreateParams.Recurring.Interval.MONTH)
                .build()).setProductData( PriceCreateParams.ProductData.builder().setName("Gold Plan").build()).build();

        Price price = Price.create(priceCreateParams);

        return price;



    }
}
