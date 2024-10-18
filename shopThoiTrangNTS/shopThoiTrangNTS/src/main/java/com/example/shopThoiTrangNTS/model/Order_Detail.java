package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Order_Details")
public class Order_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    private int quantity;
    private BigDecimal price;

    // Getters and Setters
}
