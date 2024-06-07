package com.example.paymentservice.controller;


import com.stripe.model.Event;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class StripeAPIWebHookController {

    @PostMapping("events")
    public void  getStripeEvents(Event events){
        System.out.println(events);
    }
}
