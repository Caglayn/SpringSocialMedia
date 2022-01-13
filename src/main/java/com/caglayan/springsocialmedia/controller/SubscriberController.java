package com.caglayan.springsocialmedia.controller;

import com.caglayan.springsocialmedia.entity.Subscriber;
import com.caglayan.springsocialmedia.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class SubscriberController {

    SubscriberService subscriberService;

    @Autowired
    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    public void insertOneSubscriber(){
         Subscriber subscriber = Subscriber
                 .builder()
                 .subscriberName("Ali")
                 .subscriberLastName("Veli")
                 .subscriberAddress("Ankara")
                 .creationDate(new Date(System.currentTimeMillis()))
                 .build();

         subscriberService.insertSubscriber(subscriber);
    }
}
