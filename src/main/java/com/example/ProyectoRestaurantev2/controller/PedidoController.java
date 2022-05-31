package com.example.ProyectoRestaurantev2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.DetallePedido;
import com.example.ProyectoRestaurantev2.model.Pedido;
import com.example.ProyectoRestaurantev2.services.DetallePedidoService;
import com.example.ProyectoRestaurantev2.services.PedidoService;

//http://localhost:8087/proyrestaurante/pedido
@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoserv;
	@Autowired
	private DetallePedidoService detaserv;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> listar() {
		return new ResponseEntity<List<Pedido>>(pedidoserv.listar(), HttpStatus.OK);
	}

	
	@GetMapping("/buscar")
	public ResponseEntity<Pedido> buscar(@RequestParam("codpedido") int codpedido) {
		if (pedidoserv.buscar(codpedido) != null) {
			Pedido pedido=pedidoserv.buscar(codpedido);
			List<DetallePedido> listadetalle=detaserv.listar(codpedido);
			pedido.setDetalle(listadetalle);
			return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
		} else {
			return new ResponseEntity<Pedido>(new Pedido(), HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/registrar")
	public ResponseEntity<Void> registrar(@RequestBody Pedido p) {
		pedidoserv.registrar(p);
		detaserv.registrar(p.getDetalle());
		return new ResponseEntity<Void>(HttpStatus.CREATED);

	}

}
