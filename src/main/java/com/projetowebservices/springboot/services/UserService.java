package com.projetowebservices.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetowebservices.springboot.entities.User;
import com.projetowebservices.springboot.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll () {
		return repository.findAll();
	}
	
	public User findById (Long id) {
		Optional <User> obj =  repository.findById(id);
		
		if(obj.isPresent()) {
			return obj.get();
		} 
		else {
			throw new EntityNotFoundException("User not found");
		}
	}
	
	public User insert (User obj) {
		return repository.save(obj);
	}
}
