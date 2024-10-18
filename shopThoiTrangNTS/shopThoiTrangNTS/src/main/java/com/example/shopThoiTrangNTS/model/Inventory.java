package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    private int quantityIn;
    private int quantityOut;
    private Date date;

    // Getters and Setters
}
