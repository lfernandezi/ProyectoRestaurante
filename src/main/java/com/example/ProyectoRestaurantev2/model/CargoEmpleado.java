package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CargoEmpleado {
	
	@Id
	private String cargo;
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public CargoEmpleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoEmpleado(String cargo) {
		super();
		this.cargo = cargo;
	}
}
