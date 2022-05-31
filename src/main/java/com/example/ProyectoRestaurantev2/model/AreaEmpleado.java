package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="area_empleado")
public class AreaEmpleado {
	
	@Id
	private int codarea;
	
	@Column
	private String area;

	public int getCodarea() {
		return codarea;
	}

	public void setCodarea(int codarea) {
		this.codarea = codarea;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public AreaEmpleado(int codarea, String area) {
		super();
		this.codarea = codarea;
		this.area = area;
	}

	
}
