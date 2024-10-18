package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
@Table(name = "Reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int rating;
    private String comment;
    private Timestamp createdAt;

    // Getters and Setters
}
