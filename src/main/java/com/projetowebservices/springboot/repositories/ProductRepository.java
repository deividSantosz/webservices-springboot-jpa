package com.projetowebservices.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservices.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
