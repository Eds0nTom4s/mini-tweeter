package com.edsontomas.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "tb_tweet")
public class tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long tweeterId;
    private String content;
    @CreationTimestamp
    private Instant creationTimestamp;
}