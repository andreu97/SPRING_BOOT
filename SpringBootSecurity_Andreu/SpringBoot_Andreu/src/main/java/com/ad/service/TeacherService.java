package com.ad.service;

import java.util.List;

import com.ad.DTO.TeacherDTO;

public interface TeacherService {
	void saveTeacher(TeacherDTO teacherDTO);
	TeacherDTO getTeacherById(int id);
	List<TeacherDTO> listAllTeachers();
	void deleteTeacher(int id);
}
