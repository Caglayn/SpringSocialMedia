package com.caglayan.springsocialmedia.repository;

import com.caglayan.springsocialmedia.entity.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {
}