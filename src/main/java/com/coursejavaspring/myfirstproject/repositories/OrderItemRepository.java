package com.coursejavaspring.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaspring.myfirstproject.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
