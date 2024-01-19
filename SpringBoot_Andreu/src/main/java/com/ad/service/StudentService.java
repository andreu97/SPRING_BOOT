package com.ad.service;

import java.util.List;

import com.ad.DTO.StudentDTO;

public interface StudentService {
	void saveStudent(StudentDTO studentDTO);
	StudentDTO getStudentById(int id);
	List<StudentDTO> listAllStudents();
	void deleteStudent(int id);
}
