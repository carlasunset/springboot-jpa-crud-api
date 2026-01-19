package com.carla.springbootjpacrudapi.repositories;

import com.carla.springbootjpacrudapi.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
