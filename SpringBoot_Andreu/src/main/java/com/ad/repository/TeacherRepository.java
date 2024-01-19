package com.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ad.MODEL.Teacher;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface TeacherRepository extends JpaRepository<Teacher,Integer>{

}
