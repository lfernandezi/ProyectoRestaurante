package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import com.example.ProyectoRestaurantev2.model.Pedido;

public interface PedidoService {
	
	List<Pedido> listar();
	List<Pedido> listarxCliente(int codcliente);
	List<Pedido> listarxEnvio(int codenvio);
	List<Pedido> listarxEstado(String estado);
	
	Pedido listarUltimoPedidoxCliente(int codcliente);
	
	Pedido buscar(int codpedido);
	
	void registrar (Pedido pedido);
	
	void editar (Pedido pedido);
	
	void eliminar (int codpedido);
	

}
