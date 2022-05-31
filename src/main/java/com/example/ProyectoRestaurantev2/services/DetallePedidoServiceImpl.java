package com.example.ProyectoRestaurantev2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.DetallePedido;
import com.example.ProyectoRestaurantev2.repository.DetallePedidoRepository;


@Service
public class DetallePedidoServiceImpl implements DetallePedidoService{
	
	@Autowired
	private DetallePedidoRepository detarepo;

	@Override
	public List<DetallePedido> listar(int codpedido) {
		
		return detarepo.verDetallePedido(codpedido);
	}

	@Override
	public void registrar(List<DetallePedido> listaped) {
		for(DetallePedido detalle: listaped) {
			detarepo.ingresarDetallePedido(detalle.getCodproducto(),detalle.getCantidad(), detalle.getSubtotal());
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(DetallePedido detalleped) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int codpedido) {
		// TODO Auto-generated method stub
		
	}

}
