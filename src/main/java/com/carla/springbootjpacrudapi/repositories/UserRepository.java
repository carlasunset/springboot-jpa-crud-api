package com.carla.springbootjpacrudapi.repositories;

import com.carla.springbootjpacrudapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
