package com.example.project3.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Friendship {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private User friend;

    private String status; // pending, accepted, blocked
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters...
}
