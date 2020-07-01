package com.ray.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.spring.boot.entities.Product;
import com.ray.spring.boot.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository ProductRepository;
    
    public List <Product> findAll (){
	return ProductRepository.findAll();
    }
    
    
    public Product findById(Long id) {
	Optional <Product> op = ProductRepository.findById(id);
	return op.get();
    }

}
