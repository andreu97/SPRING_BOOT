package com.ad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ad.DTO.ClassDTO;
import com.ad.MODEL.Clase;
import com.ad.repository.ClassRepository;

@Service
public class ClaseServiceImpl implements ClaseService{

	@Autowired
	private ClassRepository classRepository;
	
	@Override
	public ClassDTO saveClase(ClassDTO claseDTO) {
		// TODO Auto-generated method stub
		Clase clase=ClassDTO.convertToEntity(claseDTO);
		classRepository.save(clase);
		return claseDTO;
	}

	@Override
	public ClassDTO getClaseById(int id) {
		// TODO Auto-generated method stub
		Optional<Clase> clase=classRepository.findById(id);
		if(clase.isPresent()) {
			return ClassDTO.convertToDTO(clase.get());
		}else {
			return null;
		}
		
	}

	@Override
	public List<ClassDTO> listAllClases() {
		// TODO Auto-generated method stub
		List<Clase> lista=classRepository.findAll();
		List<ClassDTO> listaResultado= new ArrayList<ClassDTO>();
		for (int i = 0; i < lista.size(); ++i) {
			listaResultado.add(ClassDTO.convertToDTO(lista.get(i)));
		}
		return listaResultado;
	}

	@Override
	public void deleteClase(int id) {
		// TODO Auto-generated method stub
		classRepository.deleteById(id);
	}
	
}
