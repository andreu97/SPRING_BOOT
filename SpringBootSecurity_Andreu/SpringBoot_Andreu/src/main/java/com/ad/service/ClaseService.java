package com.ad.service;

import java.util.List;

import com.ad.DTO.ClassDTO;

public interface ClaseService {
	ClassDTO saveClase(ClassDTO claseDTO);
	ClassDTO getClaseById(int id);
	List<ClassDTO> listAllClases();
	void deleteClase(int id);
}
