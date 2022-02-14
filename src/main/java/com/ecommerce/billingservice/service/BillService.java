package com.ecommerce.billingservice.service;

import com.ecommerce.billingservice.dto.ProductDto;
import com.ecommerce.billingservice.model.Order;

import java.util.Map;

public interface BillService {

    void onReceived(Order order);

    String orderDetailsBuilder(Map<ProductDto, Integer> productQuantity);
}
