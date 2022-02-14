package com.ecommerce.billingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bill")
public class Bill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id", nullable = false)
    private Long billId;

    @Column(name = "billing_address")
    private String billingAddress;

    @Column(name = "user_purchased")
    private String userPurchased;

    @CreationTimestamp
    @Column(name = "creation_date")
    private LocalDateTime createdAt;

    @Column(name = "charged_amount")
    private double chargedAmount;

    @Column
    private String orderDetails;
}
