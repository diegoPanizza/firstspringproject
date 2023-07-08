package com.coursejavaspring.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaspring.myfirstproject.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
