package com.ray.spring.boot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ray.spring.boot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
	User u = new User(1L, "João Lucas", "LucasMoreira@gmail.com", "9898989898", "12345");
	return ResponseEntity.ok().body(u);
    }

}
