package com.ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ad.DTO.ClassDTO;
import com.ad.service.ClaseService;

@RestController
public class CRUDController {
	@Autowired
	private ClaseService claseService;
	
	@GetMapping("/clases")
	public List<ClassDTO> listClases(){
		List<ClassDTO> lasClases=claseService.listAllClases();
		return lasClases;
		}
	@PostMapping("/clases")
	public ResponseEntity<ClassDTO> addClase(@RequestBody ClassDTO newClas){
		ClassDTO laClase=claseService.saveClase(newClas);
		if(laClase==null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<>(laClase,HttpStatus.OK);
		
	}
	@PutMapping("/clases")
	public ResponseEntity<ClassDTO>updateClase(@RequestBody ClassDTO updClase){
		ClassDTO laClase=claseService.getClaseById(updClase.getClassId());
		if(laClase==null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else {
			ClassDTO laClaseUPD=claseService.saveClase(updClase);
		
			return new ResponseEntity<>(laClaseUPD,HttpStatus.OK);
		}
	}
	@DeleteMapping("/clases/{classId}")
	public ResponseEntity<String> deleteClase(@PathVariable Integer classId){
		claseService.deleteClase(classId);
		return new ResponseEntity<>("Clase borrada satisfactoriamente",HttpStatus.OK);
		
	}
}
