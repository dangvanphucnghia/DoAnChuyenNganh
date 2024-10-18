package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
@Table(name = "Banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bannerId;

    private String image;
    private String link;
    private String description;
    private Timestamp createdAt;

    // Getters and Setters
}
