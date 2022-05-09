package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Empleados;

public interface EmpleadosService {

	List<Empleados> listar ();
	
	Empleados buscar(int codigo);
	
	Empleados buscarxdni(String dni);
	
	void registrar (Empleados emp);
	
	void editar (Empleados emp);
	
	void eliminar (int codigo);
	
}
