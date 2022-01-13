package com.caglayan.springsocialmedia.service;

import com.caglayan.springsocialmedia.entity.SocialMedia;
import com.caglayan.springsocialmedia.repository.SocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialMediaService {
    SocialMediaRepository socialMediaRepository;

    @Autowired
    public SocialMediaService(SocialMediaRepository socialMediaRepository) {
        this.socialMediaRepository = socialMediaRepository;
    }

    public void insertSocialMedia(SocialMedia socialMedia){

    }
}
