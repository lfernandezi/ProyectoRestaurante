package com.example.ProyectoRestaurantev2.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoRestaurantev2.model.Clientes;

public interface ClientesService {
	
	
	
	List<Clientes> listar();
	
	List<Clientes> listarxEstado(String estado);
	
	Clientes buscarxEmail(String email);
	
	Clientes buscar (int codcliente);
	
	void registrar (Clientes cli);
	
	void editar (Clientes cli);
	
	void eliminar (int codcliente);

	

}
