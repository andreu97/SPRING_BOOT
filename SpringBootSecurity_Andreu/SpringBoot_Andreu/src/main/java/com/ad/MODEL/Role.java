package com.ad.MODEL;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
@Table(name="roles")
public class Role {
	public enum ERole{
		ROLE_USER,
		ROLE_MODERATOR,
		ROLE_ADMIN
	}
	private Integer id;
	private ERole name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ERole getName() {
		return name;
	}
	public void setName(ERole name) {
		this.name = name;
	}

	
}
