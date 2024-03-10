package com.week2.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.week2.project3.models.Orders;
import com.week2.project3.repositories.OrderRepository;

@Controller
public class OrderController {
	@Autowired
	OrderRepository orderRepository;
	
	@GetMapping("/orders")
	ResponseEntity getAll() {
		return new ResponseEntity(orderRepository.findAll(),HttpStatus.OK);
	}
	@GetMapping("/findById/{id}")
	ResponseEntity findById(@PathVariable(name = "id") long id){
		Orders results = orderRepository.findById(id).get();
		return new ResponseEntity(results, HttpStatus.OK);
	}
	
}
