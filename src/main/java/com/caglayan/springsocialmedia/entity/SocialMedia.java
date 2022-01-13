package com.caglayan.springsocialmedia.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "social_media_name")
    private String socialMediaName;

    @Column(name = "social_media_icon")
    private String socialMediaIcon;

    @Column(name = "social_media_url")
    private String socialMediaUrl;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date creationDate;
}
