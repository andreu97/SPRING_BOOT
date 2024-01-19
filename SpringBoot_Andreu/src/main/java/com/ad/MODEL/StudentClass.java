package com.ad.MODEL;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class StudentClass implements Serializable{
    static final long serialVersionUID = 137L;


    @Id
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student studentId;

    @Id
    @ManyToOne
    @JoinColumn(name = "classId")
    private Clase classId;
    
    
    
    public StudentClass(Student studentId, Clase classId, Student student) {
		super();
		this.studentId = studentId;
		this.classId = classId;
		this.student = student;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public Clase getClassId() {
		return classId;
	}

	public void setClassId(Clase classId) {
		this.classId = classId;
	}

	public StudentClass() {
		// TODO Auto-generated constructor stub
	}

    @ManyToOne
    @JoinColumn(name = "studentId", referencedColumnName = "studentId", insertable = false, updatable = false)
    private Student student;

	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}