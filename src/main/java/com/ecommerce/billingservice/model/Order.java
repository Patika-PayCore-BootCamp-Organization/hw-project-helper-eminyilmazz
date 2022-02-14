package com.ecommerce.billingservice.model;

import com.ecommerce.billingservice.dto.ProductDto;
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
    private Map<ProductDto, Integer> productQuantity;
    private String address;
}