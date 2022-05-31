package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cargo_empleado")
public class CargoEmpleado {
	
	@Id
	private int codcargo;
	
	private String cargo;

	public int getCodcargo() {
		return codcargo;
	}

	public void setCodcargo(int codcargo) {
		this.codcargo = codcargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public CargoEmpleado(int codcargo, String cargo) {
		super();
		this.codcargo = codcargo;
		this.cargo = cargo;
	}
	
	
}
