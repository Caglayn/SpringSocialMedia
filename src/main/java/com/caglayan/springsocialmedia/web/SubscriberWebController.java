package com.caglayan.springsocialmedia.web;

import com.caglayan.springsocialmedia.entity.Subscriber;
import com.caglayan.springsocialmedia.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscribers")
public class SubscriberWebController {
    private final SubscriberService subscriberService;

    @Autowired
    public SubscriberWebController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @GetMapping
    public String getAllSubscribers(Model model){
        List<Subscriber> subscribers = this.subscriberService.getAllSubscribers();
        model.addAttribute("subscribers", subscribers);
        return "subscribers";
    }

    @PostMapping("/create")
    public String createSubScriber(@RequestBody Subscriber subScriber ) {
        subscriberService.insertSubscriber(subScriber);

        return "Kayıt Başarılı";
    }



}
