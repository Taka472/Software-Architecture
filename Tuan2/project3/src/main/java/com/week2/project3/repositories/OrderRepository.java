package com.week2.project3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.week2.project3.models.Orders;

import jakarta.persistence.criteria.Order;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
