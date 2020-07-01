package com.ray.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.spring.boot.entities.Category;
import com.ray.spring.boot.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository CategoryRepository;
    
    public List <Category> findAll (){
	return CategoryRepository.findAll();
    }
    
    
    public Category findById(Long id) {
	Optional <Category> op = CategoryRepository.findById(id);
	return op.get();
    }

}
