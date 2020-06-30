package com.ray.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ray.spring.boot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
