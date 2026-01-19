package com.carla.springbootjpacrudapi.repositories;

import com.carla.springbootjpacrudapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
