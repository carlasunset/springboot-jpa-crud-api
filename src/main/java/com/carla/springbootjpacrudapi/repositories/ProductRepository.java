package com.carla.springbootjpacrudapi.repositories;

import com.carla.springbootjpacrudapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
