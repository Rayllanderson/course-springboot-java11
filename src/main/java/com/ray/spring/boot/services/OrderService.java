package com.ray.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.spring.boot.entities.Order;
import com.ray.spring.boot.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    public List <Order> findAll (){
	return orderRepository.findAll();
    }
    
    
    public Order findById(Long id) {
	Optional <Order> op = orderRepository.findById(id);
	return op.get();
    }

}
