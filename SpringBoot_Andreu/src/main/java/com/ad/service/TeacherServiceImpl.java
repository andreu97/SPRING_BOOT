package com.ad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ad.DTO.TeacherDTO;
import com.ad.MODEL.Teacher;
import com.ad.repository.TeacherRepository;

public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private TeacherRepository teacherRepository;
	@Override
	public void saveTeacher(TeacherDTO teacherDTO) {
		// TODO Auto-generated method stub
		Teacher teacher=TeacherDTO.converToEntity(teacherDTO);
		teacherRepository.save(teacher);
	}

	@Override
	public TeacherDTO getTeacherById(int id) {
		// TODO Auto-generated method stub
		Optional<Teacher>teacher=teacherRepository.findById(id);
		if(teacher.isPresent()) {
			return TeacherDTO.convertToDTO(teacher.get());
		}else {
			return null;
		}
		
	}

	@Override
	public List<TeacherDTO> listAllTeachers() {
		// TODO Auto-generated method stub
		List<Teacher> lista=teacherRepository.findAll();
		List<TeacherDTO>listaResultado=new ArrayList<TeacherDTO>();
		for (int i = 0; i < lista.size(); ++i) {
			listaResultado.add(TeacherDTO.convertToDTO(lista.get(i)));
		}
		return listaResultado;
	}

	@Override
	public void deleteTeacher(int id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
	}

}
