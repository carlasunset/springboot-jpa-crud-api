package com.carla.springbootjpacrudapi.repositories;

import com.carla.springbootjpacrudapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
