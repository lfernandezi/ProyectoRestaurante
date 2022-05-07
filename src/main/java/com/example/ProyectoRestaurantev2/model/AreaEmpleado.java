package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AreaEmpleado {
	
	@Id
	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public AreaEmpleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AreaEmpleado(String area) {
		super();
		this.area = area;
	}
}
