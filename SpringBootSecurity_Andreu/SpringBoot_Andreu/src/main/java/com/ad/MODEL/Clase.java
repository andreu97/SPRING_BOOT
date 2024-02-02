package com.ad.MODEL;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name="Class")
public class Clase implements Serializable{
    static final long serialVersionUID = 137L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int classId;
    @Column
    private String className;
    
    
    @OneToOne(cascade = CascadeType.PERSIST)
    
    
    @JoinColumn(name="teacherId", referencedColumnName = "classId",unique=true)
    
    private Student student;
    
    
    private Teacher elTeacher;
    
    @ManyToMany
    @JoinTable(
        name = "StudentClass",
        joinColumns = @JoinColumn(name = "studentId"),
        inverseJoinColumns = @JoinColumn(name = "classId"))
    private Set<Student> losStudents=new HashSet<>();

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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getElTeacher() {
		return elTeacher;
	}

	public void setElTeacher(Teacher elTeacher) {
		this.elTeacher = elTeacher;
	}

	public Set<Student> getLosStudents() {
		return losStudents;
	}

	public void setLosStudents(Set<Student> losStudents) {
		this.losStudents = losStudents;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	};
    
    
}
