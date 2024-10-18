package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Timestamp createdAt;

    // Getters and Setters

    public enum PaymentMethod {
        PAYMENT, ATM, MOMO, VNPAY
    }

    public enum Status {
        PENDING, COMPLETED
    }
}
