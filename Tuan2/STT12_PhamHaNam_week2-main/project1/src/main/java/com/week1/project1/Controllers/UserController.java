package com.week1.project1.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.week1.project1.models.Users;
import com.week1.project1.repositories.UserRepository;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	@GetMapping("/users")
	ResponseEntity getUsers(){
		return new ResponseEntity(repository.findAll(),HttpStatus.OK);
	}
	@GetMapping("/user/{id}")
	Users getUserById(@PathVariable(name = "id") long id) {
		return repository.findById(id).get();
	}
	
}
