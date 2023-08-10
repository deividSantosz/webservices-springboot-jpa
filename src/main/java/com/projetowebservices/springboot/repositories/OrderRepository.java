package com.projetowebservices.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservices.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
