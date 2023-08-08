package com.projetowebservices.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservices.springboot.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
