package com.fabio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

		

	
}

