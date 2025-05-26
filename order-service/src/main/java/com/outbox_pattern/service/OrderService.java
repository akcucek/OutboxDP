package com.outbox_pattern.service;

import com.outbox_pattern.common.OrderRequestDTO;
import com.outbox_pattern.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order createOrder(OrderRequestDTO orderRequestDTO){

        Order order =new Order();
        order.setName(orderRequestDTO.getName());
        order.
    }
}
