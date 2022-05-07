package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.DetallePedido;

public interface DetallePedidoService {
	
	List<DetallePedido> listar (int codpedido);
	
	void registrar (List<DetallePedido> listaped);
	
	void editar (DetallePedido detalleped);
	
	void eliminar (int codpedido);

}
