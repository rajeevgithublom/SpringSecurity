package com.icicilombard.jwtauth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icicilombard.jwtauth.model.User;

public interface UseraaRepository extends JpaRepository<User, Integer>{
	
	

}
