package com.coursejavaspring.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaspring.myfirstproject.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
