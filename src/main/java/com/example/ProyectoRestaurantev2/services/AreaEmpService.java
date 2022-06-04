package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.AreaEmpleado;

public interface AreaEmpService {
	
	List<AreaEmpleado> listar();
	
	AreaEmpleado buscar(int codarea);
	
	

}
