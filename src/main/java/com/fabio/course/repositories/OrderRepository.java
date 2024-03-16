package com.fabio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

