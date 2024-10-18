package com.example.shopThoiTrangNTS.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Promotions")
public class Promotions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long promotionId;

    private String code;
    private BigDecimal discountPercent;
    private Date startDate;
    private Date endDate;

    // Getters and Setters
}
