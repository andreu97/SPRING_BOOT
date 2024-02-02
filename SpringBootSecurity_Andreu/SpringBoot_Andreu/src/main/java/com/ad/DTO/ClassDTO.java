package com.ad.DTO;

import com.ad.MODEL.Clase;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ClassDTO {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int classId;
    @Column
    private String className;
    
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
    
	 
	public static ClassDTO convertToDTO(Clase clase) {
		 ClassDTO classDTO= new ClassDTO();
		 classDTO.setClassId(clase.getClassId());
		 classDTO.setClassName(clase.getClassName());
		 return classDTO;
	 }
	public static Clase convertToEntity(ClassDTO classdto) {
		Clase clase=new Clase();
		clase.setClassId(classdto.getClassId());
		clase.setClassName(classdto.getClassName());
		return clase;
	}
	
    
    
	 
}
