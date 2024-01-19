package com.ad.DTO;


import com.ad.MODEL.Clase;
import com.ad.MODEL.Student;
import com.ad.MODEL.StudentClass;

import jakarta.persistence.Column;

public class StudentClassDTO {
	@Column
    private Student studentId;
    
    @Column
    private Clase classId;

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student student) {
		this.studentId = student;
	}

	public Clase getClassId() {
		return classId;
	}

	public void setClassId(Clase clase) {
		this.classId = clase;
	}

    
	public static StudentClassDTO convertToDTO(StudentClass studentclass) {
		 StudentClassDTO studentclassDTO= new StudentClassDTO();
		 studentclassDTO.setStudentId(studentclass.getStudentId());
		 studentclassDTO.setClassId(studentclass.getClassId());
		 return studentclassDTO;
	 }
	public static StudentClass convertToEntity(StudentClassDTO studentclassdto) {
		StudentClass studentclass=new StudentClass();
		studentclass.setStudentId(studentclassdto.getStudentId());
		studentclass.setClassId(studentclassdto.getClassId());
		return studentclass;
	} 
}
