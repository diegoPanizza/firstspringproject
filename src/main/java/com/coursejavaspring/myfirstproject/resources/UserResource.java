package com.coursejavaspring.myfirstproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejavaspring.myfirstproject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Thaina Saes", "thainacristian1997@gmail.com", "998186826", "BananaAmassada97");
		return ResponseEntity.ok().body(u);
	}
}
