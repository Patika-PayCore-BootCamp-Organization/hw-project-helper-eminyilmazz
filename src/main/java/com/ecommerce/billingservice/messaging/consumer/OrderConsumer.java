package com.ecommerce.billingservice.messaging.consumer;

import com.ecommerce.billingservice.config.RabbitMQConfig;
import com.ecommerce.billingservice.model.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Order order) {
        System.out.println("order = " + order.toString());
    }
}
