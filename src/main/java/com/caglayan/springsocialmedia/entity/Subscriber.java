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
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subscriber_name")
    private String subscriberName;

    @Column(name = "subscriber_last_name")
    private String subscriberLastName;

    @Column(name = "subscriber_address")
    private String subscriberAddress;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date creationDate;
}
