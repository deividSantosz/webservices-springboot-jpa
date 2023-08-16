package com.projetowebservices.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservices.springboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
