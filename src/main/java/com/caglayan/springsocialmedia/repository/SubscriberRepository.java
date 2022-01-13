package com.caglayan.springsocialmedia.repository;

import com.caglayan.springsocialmedia.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {

    Iterable<Subscriber> findBySubscriberAddress(String address);
}
