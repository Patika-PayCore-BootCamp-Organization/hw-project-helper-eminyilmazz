package com.ecommerce.billingservice.service.impl;

import com.ecommerce.billingservice.dto.ProductDto;
import com.ecommerce.billingservice.model.Bill;
import com.ecommerce.billingservice.model.Order;
import com.ecommerce.billingservice.repository.BillRepository;
import com.ecommerce.billingservice.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class BillServiceImpl implements BillService {
    @Autowired
    BillRepository billRepository;

    @Override
    public void onReceived(Order order) {
        billRepository.save(Bill.builder()
                                .billingAddress(order.getAddress())
                                .chargedAmount(order.getTotalPrice())
                                .orderDetails(orderDetailsBuilder(order.getProductQuantity()))
                                .userPurchased(order.getUserPurchased())
                                .build());
    }
    @Override
    public String orderDetailsBuilder(Map<ProductDto, Integer> productQuantity) {
        StringBuilder stringBuilder = new StringBuilder();
        productQuantity.entrySet().stream().map(entry ->
                stringBuilder.append(entry.getValue() + "x --- " +
                                     entry.getKey().getName() + " --- " +
                                     entry.getKey().getPrice() + " --> " +
                                     entry.getKey().getPrice() * 3 + "\n"));
        return stringBuilder.toString();
    }
}
