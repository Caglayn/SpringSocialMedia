package com.caglayan.springsocialmedia.web;

import com.caglayan.springsocialmedia.entity.Subscriber;
import com.caglayan.springsocialmedia.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
    public String createSubScriber(@ModelAttribute Subscriber subscriber, Model model ) {
        subscriberService.insertSubscriber(subscriber);
        return "redirect:/";
    }

    @GetMapping("/create")
    public String createSubscriber(Model model){
        model.addAttribute("subscriber", new Subscriber());
        return "registersubscriber";
    }

    @GetMapping("/detail/{id}")
    public String getSubscriberDetail(@PathVariable Long id, Model model){
        model.addAttribute("subscriber", subscriberService.getSubscriberById(id));
        return "subscriberdetail";
    }

    @PostMapping("/update")
    public String updateSubScriber(@ModelAttribute Subscriber subscriber, Model model ) {
        subscriberService.updateSubscriber(subscriber);
        System.out.println("updated " + subscriber);
        return "redirect:/subscribers";
    }

    @GetMapping("/delete/{id}")
    public String deleteSubscriber(@PathVariable Long id){
        subscriberService.deleteSubscriber(id);
        return "redirect:/subscribers";
    }

}
