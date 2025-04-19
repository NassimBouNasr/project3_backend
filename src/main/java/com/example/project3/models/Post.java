package com.example.project3.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User author;

    @Lob
    private String content;

    private LocalDateTime createdAt = LocalDateTime.now();
    private Boolean isPrivate = false;
    private Long groupId;

    // Getters and Setters...
}
