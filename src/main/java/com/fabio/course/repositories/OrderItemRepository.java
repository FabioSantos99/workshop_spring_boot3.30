package com.fabio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.course.entities.OrderItem;
import com.fabio.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

		

	
}

