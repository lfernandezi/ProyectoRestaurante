package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Pedido;

public interface PedidoService {
	
	List<Pedido> listar();
	List<Pedido> listarxCliente(int codcliente);
	List<Pedido> listarxEnvio(int codenvio);
	List<Pedido> listarxEstado(String estado);
	
	Pedido buscar(int codpedido);
	
	void registrar (Pedido pedido);
	
	void actualizar (Pedido pedido);
	
	void eliminar (int codpedido);
	
	
	void actualizarEstado (int codpedido, String estado);
	

	

}
