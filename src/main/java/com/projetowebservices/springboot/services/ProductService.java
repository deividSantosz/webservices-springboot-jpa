package com.projetowebservices.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetowebservices.springboot.entities.Product;
import com.projetowebservices.springboot.repositories.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		if(obj.isPresent()) {
			return obj.get();
		}
		else {
			throw new EntityNotFoundException("Product not found");
		}
	}
	
}
