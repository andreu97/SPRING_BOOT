package com.ad.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ad.MODEL.Role;
import com.ad.MODEL.Role.ERole;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
	Optional<Role> findByName(ERole name);

}
