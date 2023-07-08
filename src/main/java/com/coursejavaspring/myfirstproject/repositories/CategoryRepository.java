package com.coursejavaspring.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaspring.myfirstproject.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
