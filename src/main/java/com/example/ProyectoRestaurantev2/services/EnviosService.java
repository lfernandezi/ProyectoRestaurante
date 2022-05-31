package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Envios;

public interface EnviosService {

	void registrar (Envios e);
	
	List<Envios> listar ();
	
	Envios buscar (int codenvio);
	
	void editar (Envios e);
	
	void eliminar (int codenvio);
	
	
}
