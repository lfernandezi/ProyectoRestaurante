package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Productos;

public interface ProductosService {
	
	List<Productos> listar();
	
	void registrar(Productos producto);
	
	void editar (Productos producto);
	
	void eliminar (int codproducto);
	
	Productos buscar (int codproducto);

}
