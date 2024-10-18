package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private String email;
    private String fullName;
    private int phone;
    private String address;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getters and Setters

    public enum Status {
        ACTIVE, LOCKED
    }
}
