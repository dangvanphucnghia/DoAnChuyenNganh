package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String description;
    private BigDecimal price;
    private int stockQuantity;
    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getters and Setters
}
