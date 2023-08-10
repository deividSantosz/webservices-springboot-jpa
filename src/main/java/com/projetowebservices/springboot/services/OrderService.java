package com.projetowebservices.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetowebservices.springboot.entities.Order;
import com.projetowebservices.springboot.repositories.OrderRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll () {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		if(obj.isPresent()) {
			return obj.get();
		}
		else {
			throw new EntityNotFoundException("Order not found");
		}
	}
}
