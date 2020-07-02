package com.ray.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.spring.boot.entities.OrderItem;
import com.ray.spring.boot.repositories.OrderItemRepository;

@Service
public class OrderItemService {
    
    @Autowired
    private OrderItemRepository OrderItemRepository;
    
    public List <OrderItem> findAll (){
	return OrderItemRepository.findAll();
    }
    
    
    public OrderItem findById(Long id) {
	Optional <OrderItem> op = OrderItemRepository.findById(id);
	return op.get();
    }

}
