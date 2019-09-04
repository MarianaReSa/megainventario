package com.eam.megainventario.inventario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Estado {

	@Id
	@GeneratedValue
	@Column(name = "id_status")
	private int id;

	@Column(name = "name")
	private String name;

	public Estado() {

	}

	public Estado(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
