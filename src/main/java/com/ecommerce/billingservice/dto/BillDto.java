package com.ecommerce.billingservice.dto;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class BillDto {
    private String billingAddress;
    private String userPurchased;
    private double chargedAmount;
    private String orderDetails;
}
