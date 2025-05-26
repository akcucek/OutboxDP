package com.outbox_pattern.repository;

import com.outbox_pattern.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
