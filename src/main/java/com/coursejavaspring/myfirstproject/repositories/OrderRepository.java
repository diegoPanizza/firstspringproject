package com.coursejavaspring.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaspring.myfirstproject.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
