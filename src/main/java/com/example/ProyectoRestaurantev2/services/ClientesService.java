package com.example.ProyectoRestaurantev2.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoRestaurantev2.model.Clientes;

public interface ClientesService {
	
	Clientes registrar (Clientes cli);
	
	List<Clientes> listar();
	
	Optional<Clientes> buscar (int codcliente);

}
