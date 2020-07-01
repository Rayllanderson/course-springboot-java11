package com.ray.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ray.spring.boot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
