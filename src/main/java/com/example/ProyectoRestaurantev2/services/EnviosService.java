package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Envios;

public interface EnviosService {

	Envios registrar (Envios e);
	List<Envios> listar ();
}
