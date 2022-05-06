package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Empleados;

public interface EmpleadosService {

	Empleados registrar (Empleados emp);
	
	List<Empleados> listar ();
}
