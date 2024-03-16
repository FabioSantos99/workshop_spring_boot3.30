package com.fabio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

