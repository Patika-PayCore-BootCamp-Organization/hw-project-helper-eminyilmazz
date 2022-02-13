package com.ecommerce.billingservice.model;

import lombok.*;

import java.io.Serializable;
import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Order implements Serializable {
    private String userPurchased;
    private double totalPrice;
    private Map<?, ?> productList;
    private String address;
}