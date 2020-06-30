package com.ray.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.spring.boot.entities.User;
import com.ray.spring.boot.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List <User> findAll (){
	return userRepository.findAll();
    }
    
    
    public User findById(Long id) {
	Optional <User> op = userRepository.findById(id);
	return op.get();
    }

}
