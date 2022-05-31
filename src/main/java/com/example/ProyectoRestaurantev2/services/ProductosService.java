package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Productos;

public interface ProductosService {
	
	List<Productos> listar();
	
	List<Productos> listarxCategorias(int codcategorias);
	
	List<Productos> listarxPalabra (String palabra);
	
	Productos buscar (int codproducto);
	
	void registrar(Productos producto);
	
	void editar (Productos producto);
	
	void eliminar (int codproducto);
	
	

}
