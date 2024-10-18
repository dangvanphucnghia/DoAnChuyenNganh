package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.security.Timestamp;
import java.util.Date;

@Entity
@Table(name = "Rentals")
public class Rentals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentalId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    private Date rentalStartDate;
    private Date rentalEndDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Timestamp createdAt;

    // Getters and Setters

    public enum Status {
        ACTIVE, RETURNED, LATE
    }
}
