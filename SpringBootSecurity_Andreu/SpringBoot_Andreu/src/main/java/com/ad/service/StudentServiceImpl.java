package com.ad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ad.DTO.StudentDTO;
import com.ad.MODEL.Student;
import com.ad.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void saveStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		Student student=StudentDTO.convertToEntity(studentDTO);
		studentRepository.save(student);
	}

	@Override
	public StudentDTO getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student=studentRepository.findById(id);
		if(student.isPresent()) {
			return StudentDTO.convertToDTO(student.get());
		}else {
			return null;
		}
		
	}

	@Override
	public List<StudentDTO> listAllStudents() {
		// TODO Auto-generated method stub
		List<Student> lista=studentRepository.findAll();
		List<StudentDTO> listaResultado=new ArrayList<StudentDTO>();
		for (int i = 0; i < lista.size(); ++i) {
			listaResultado.add(StudentDTO.convertToDTO(lista.get(i)));
		}
		return listaResultado;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}
