package com.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ad.MODEL.Clase;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ClassRepository extends JpaRepository<Clase,Integer>{

}
