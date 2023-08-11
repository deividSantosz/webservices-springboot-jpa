package com.projetowebservices.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetowebservices.springboot.entities.Category;
import com.projetowebservices.springboot.repositories.CategoryRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		if(obj.isPresent()) {
			return obj.get();
		}
		else {
			throw new EntityNotFoundException("Category not found");
		}
	}
}
