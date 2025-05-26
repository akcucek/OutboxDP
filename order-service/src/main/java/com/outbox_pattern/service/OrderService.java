package com.outbox_pattern.service;

import com.outbox_pattern.common.OrderRequestDTO;
import com.outbox_pattern.common.mapper.OrderDTOtoEntityMapper;
import com.outbox_pattern.entity.Order;
import com.outbox_pattern.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDTOtoEntityMapper orderDTOtoEntityMapper;

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(OrderRequestDTO orderRequestDTO){

        Order order = orderDTOtoEntityMapper.map(orderRequestDTO);
        order = orderRepository.save(order);
        return null;
    }
}
