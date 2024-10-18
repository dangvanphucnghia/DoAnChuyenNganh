package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
@Table(name = "Blog_Posts")
public class Blog_Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String title;
    private String content;
    private String image;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getters and Setters
}
