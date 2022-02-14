package com.ecommerce.billingservice.messaging.consumer;

import com.ecommerce.billingservice.config.RabbitMQConfig;
import com.ecommerce.billingservice.model.Order;
import com.ecommerce.billingservice.service.impl.BillServiceImpl;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @Autowired
    BillServiceImpl billService;
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Order order) {
        System.out.println("order = " + order.toString());
        billService.onReceived(order);
    }
}
