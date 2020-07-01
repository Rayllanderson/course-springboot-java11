package com.ray.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ray.spring.boot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
