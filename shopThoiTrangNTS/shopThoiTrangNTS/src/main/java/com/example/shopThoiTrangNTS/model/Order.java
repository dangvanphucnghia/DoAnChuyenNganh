package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Table(name = "Orders") // Sử dụng "Orders" thay vì "Order" vì từ "Order" có thể gây lỗi vì trùng với từ khóa SQL
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Status status;

    private BigDecimal totalAmount;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getters and Setters

    public enum Status {
        PROCESSING, SHIPPED, CANCELLED
    }
}
