package com.ray.spring.boot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ray.spring.boot.entities.Order;
import com.ray.spring.boot.entities.User;
import com.ray.spring.boot.entities.enums.OrderStatus;
import com.ray.spring.boot.repositories.OrderRepository;
import com.ray.spring.boot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
	User u1 = new User(null, "Maria Casmurra", "maria@gmail.com", "988888888", "123456");
	User u2 = new User(null, "João Casmurro", "joao@gmail.com", "977777777", "123456");
	
	Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.SHIPPED);
	Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.PAID);
	Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.DELIVRED); 
	
	userRepository.saveAll(Arrays.asList(u1, u2));
	orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
