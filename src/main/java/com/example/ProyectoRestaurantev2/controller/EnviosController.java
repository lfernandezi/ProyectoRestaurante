package com.example.ProyectoRestaurantev2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.Clientes;
import com.example.ProyectoRestaurantev2.model.Envios;
import com.example.ProyectoRestaurantev2.services.EnviosService;

//http://localhost:8087/proyrestaurante/envios
@RestController
@RequestMapping("/envios")
public class EnviosController {

	@Autowired
	private EnviosService evservice;

	@GetMapping
	private ResponseEntity<List<Envios>> listar() {
		return new ResponseEntity<List<Envios>>(evservice.listar(), HttpStatus.OK);
	}



	// http://localhost:8087/proyrestaurante/clientes/buscar?codcliente=2
	@GetMapping("/buscar")
	public ResponseEntity<Envios> buscar(@RequestParam("codenvio") int codenvio) {
		if (evservice.buscar(codenvio) != null) {
			return new ResponseEntity<Envios>(evservice.buscar(codenvio), HttpStatus.OK);
		} else {

			return new ResponseEntity<Envios>(evservice.buscar(codenvio), HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Void> registrar(@RequestBody Envios e) {
		evservice.registrar(e);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Void> editar(Envios e) {
		if (evservice.buscar(e.getCodenvio()) != null) {
			evservice.editar(e);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping
	public ResponseEntity<Void> eliminar(int codenvio) {
		if (evservice.buscar(codenvio) != null) {
			evservice.eliminar(codenvio);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	

}
