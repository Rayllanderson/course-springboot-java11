package com.ray.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ray.spring.boot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
