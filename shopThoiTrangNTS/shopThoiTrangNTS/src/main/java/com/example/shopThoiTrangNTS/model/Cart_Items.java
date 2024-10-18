package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cart_Items")
public class Cart_Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemId;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    private int quantity;

    // Getters and Setters
}
