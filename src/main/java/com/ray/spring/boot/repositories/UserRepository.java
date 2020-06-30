package com.ray.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ray.spring.boot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
