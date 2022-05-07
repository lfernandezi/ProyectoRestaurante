package com.example.ProyectoRestaurantev2.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoRestaurantev2.model.Clientes;

public interface ClientesService {
	
	void registrar (Clientes cli);
	
	List<Clientes> listar();
	
	Clientes buscar (int codcliente);
	
	void editar (Clientes cli);
	
	void eliminar (int codcliente);

}
