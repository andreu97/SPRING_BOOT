package com.ad.DTO;

import com.ad.MODEL.Teacher;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TeacherDTO {
	  	@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int teacherId;
	    
	    @Column
	    private String name;

		public int getTeacherId() {
			return teacherId;
		}

		public void setTeacherId(int teacherId) {
			this.teacherId = teacherId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    public static TeacherDTO convertToDTO(Teacher teacher) {
	    	TeacherDTO teacherDTO= new TeacherDTO();
	    	teacherDTO.setTeacherId(teacher.getTeacherId());
	    	teacherDTO.setName(teacher.getName());
	    	return teacherDTO;
	    }
	    public static Teacher converToEntity(TeacherDTO teacherdto) {
	    	Teacher teacher=new Teacher();
	    	teacher.setTeacherId(teacherdto.getTeacherId());
	    	teacher.setName(teacherdto.getName());
	    	return teacher;
	    }
	    
}
