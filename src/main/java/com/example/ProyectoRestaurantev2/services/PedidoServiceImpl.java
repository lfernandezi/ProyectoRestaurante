package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.Pedido;
import com.example.ProyectoRestaurantev2.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService{
	
	@Autowired
	private PedidoRepository pedidorepo;

	@Override
	public List<Pedido> listar() {
		
		// TODO Auto-generated method stub
		return pedidorepo.findAll();
	}

	@Override
	public List<Pedido> listarxCliente(int codcliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> listarxEnvio(int codenvio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> listarxEstado(String estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido buscar(int codpedido) {
		// TODO Auto-generated method stub
		return pedidorepo.findById(codpedido).orElse(null);
	}

	@Override
	public void registrar(Pedido pedido) {
		// TODO Auto-generated method stub
		pedidorepo.ingresarPedido(pedido.getCodcliente(),pedido.getDireccion(),pedido.getMonto(),"RECIBIDO");
	}

	@Override
	public void actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		pedidorepo.saveAndFlush(pedido);
	}

	@Override
	public void eliminar(int codpedido) {
		// TODO Auto-generated method stub
	pedidorepo.deleteById(codpedido);	
	}

	@Override
	public void actualizarEstado(int codpedido, String estado) {
		// TODO Auto-generated method stub
		
	}

}
