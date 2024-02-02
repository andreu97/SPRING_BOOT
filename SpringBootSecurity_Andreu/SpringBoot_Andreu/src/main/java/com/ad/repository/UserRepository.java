package com.ad.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ad.MODEL.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	Optional<User>findByUsername(String username);
	static Boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	static Boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
