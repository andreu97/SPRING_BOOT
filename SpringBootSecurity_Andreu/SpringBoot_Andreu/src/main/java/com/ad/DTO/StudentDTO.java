package com.ad.DTO;



import com.ad.MODEL.Student;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class StudentDTO {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int studentId;
	 @Column
	 private String name;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static StudentDTO convertToDTO(Student student) {
		 StudentDTO studentDTO= new StudentDTO();
		 studentDTO.setStudentId(student.getStudentId());
		 studentDTO.setName(student.getName());
		 return studentDTO;
	 }
	public static Student convertToEntity(StudentDTO studentdto) {
		Student student=new Student();
		student.setStudentId(studentdto.getStudentId());
		student.setName(studentdto.getName());
		return student;
	}   
}
