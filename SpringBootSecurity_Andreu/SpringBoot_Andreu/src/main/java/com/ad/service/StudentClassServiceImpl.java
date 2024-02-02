package com.ad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ad.DTO.StudentClassDTO;
import com.ad.MODEL.StudentClass;
import com.ad.repository.StudentClaseRepository;

public class StudentClassServiceImpl implements StudentClassService{
	@Autowired
	private StudentClaseRepository studentClassRepository;
	
	@Override
	public void saveStudentClass(StudentClassDTO studentClassDTO) {
		// TODO Auto-generated method stub
		StudentClass studentClass=StudentClassDTO.convertToEntity(studentClassDTO);
		studentClassRepository.save(studentClass);
		
	}

	@Override
	public StudentClassDTO getStudentClassById(int id) {
		// TODO Auto-generated method stub
		Optional<StudentClass>studentClass=studentClassRepository.findById(id);
		if(studentClass.isPresent()) {
			return StudentClassDTO.convertToDTO(studentClass.get());
			
		}else {
			return null;
		}
		
	}

	@Override
	public List<StudentClassDTO> listAllStudentClasses() {
		// TODO Auto-generated method stub
		List<StudentClass>lista=studentClassRepository.findAll();
		List<StudentClassDTO>listaResultado=new ArrayList<StudentClassDTO>();
		for (int i = 0; i < lista.size(); ++i) {
			listaResultado.add(StudentClassDTO.convertToDTO(lista.get(i)));
			
		}
		return listaResultado;
		
	}

	@Override
	public void deleteStudentClass(int id) {
		// TODO Auto-generated method stub
		studentClassRepository.deleteById(id);
	}

}
