package com.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ad.MODEL.StudentClass;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface StudentClaseRepository extends JpaRepository<StudentClass,Integer>{

}
