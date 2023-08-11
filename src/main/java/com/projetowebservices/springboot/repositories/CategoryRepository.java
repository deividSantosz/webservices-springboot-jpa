package com.projetowebservices.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservices.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
