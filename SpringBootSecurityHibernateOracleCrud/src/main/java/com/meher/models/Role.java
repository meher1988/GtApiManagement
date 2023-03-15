package com.meher.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_role")
public class Role {

	@Id
 	@Column(name="ID")
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="UPDATED_BY")
	private Integer updatedBy;

	public Role() {
		super();
	}

	public Role(Integer id, String name, Integer updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.updatedBy = updatedBy;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", updatedBy=" + updatedBy + "]";
	}
	
	
	
	
}
