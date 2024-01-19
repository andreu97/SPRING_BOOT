package com.ad.service;

import java.util.List;

import com.ad.DTO.StudentClassDTO;

public interface StudentClassService {
	void saveStudentClass(StudentClassDTO studentClassDTO);
	StudentClassDTO getStudentClassById(int id);
	List<StudentClassDTO> listAllStudentClasses();
	void deleteStudentClass(int id);
}
