package com.fabio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

