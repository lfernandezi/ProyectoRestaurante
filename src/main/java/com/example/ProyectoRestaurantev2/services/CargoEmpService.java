package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.CargoEmpleado;

public interface CargoEmpService {
	
	List<CargoEmpleado> listar();
	
	CargoEmpleado buscarv (int codcargo);

}
