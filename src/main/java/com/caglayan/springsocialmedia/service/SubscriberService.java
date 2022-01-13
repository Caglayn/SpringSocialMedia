package com.caglayan.springsocialmedia.service;

import com.caglayan.springsocialmedia.entity.Subscriber;
import com.caglayan.springsocialmedia.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberService {
    private final SubscriberRepository subscriberRepository;

    @Autowired
    public SubscriberService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    public void insertSubscriber(Subscriber subscriber){
        subscriberRepository.save(subscriber);
    }

    public List<Subscriber> getAllSubscribers(){
        List<Subscriber> subscribers = this.subscriberRepository.findAll();
        return subscribers;
    }

    public Subscriber getSubscriberById(Long id){
        return subscriberRepository.getById(id);
    }

    public void updateSubscriber(Subscriber subscriber){
        Subscriber tempSubscriber = subscriberRepository.getById(subscriber.getId());
        if (tempSubscriber != null){
            tempSubscriber.setSubscriberName(subscriber.getSubscriberName());
            tempSubscriber.setSubscriberLastName(subscriber.getSubscriberLastName());
            tempSubscriber.setSubscriberAddress(subscriber.getSubscriberAddress());
            subscriberRepository.save(tempSubscriber);
        }
    }

    public void deleteSubscriber(Long id){
        subscriberRepository.deleteById(id);
    }
}
