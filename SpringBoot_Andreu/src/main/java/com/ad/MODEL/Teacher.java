package com.ad.MODEL;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class Teacher implements Serializable{
    static final long serialVersionUID = 137L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int teacherId;
    
    @Column
    private String name;
    
    @OneToMany(mappedBy="elTeacher",
            cascade=CascadeType.PERSIST,
            fetch=FetchType.LAZY)
    private Set<Clase> classes;

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





	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}