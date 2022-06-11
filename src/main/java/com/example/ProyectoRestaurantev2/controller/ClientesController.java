package com.example.ProyectoRestaurantev2.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.Clientes;
import com.example.ProyectoRestaurantev2.services.ClientesService;

//http://localhost:8087/proyrestaurante/clientes
@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	ClientesService cliserv;

	@GetMapping
	public ResponseEntity<List<Clientes>> listar() {
		return new ResponseEntity<List<Clientes>>(cliserv.listar(), HttpStatus.OK);
	}
	
	@GetMapping("/listarxEstado")
	public ResponseEntity<List<Clientes>> listarxEstado(@RequestParam ("estado") String estado){
		return new ResponseEntity<List<Clientes>>(cliserv.listarxEstado(estado),HttpStatus.OK);
	}
	
	// http://localhost:8087/proyrestaurante/clientes/buscar?codcliente=2
	@GetMapping("/buscar")
	public ResponseEntity<Clientes> buscar(@RequestParam("codcliente") int codcliente) {
		if (cliserv.buscar(codcliente) != null) {
			return new ResponseEntity<Clientes>(cliserv.buscar(codcliente), HttpStatus.OK);
		} else {
			return new ResponseEntity<Clientes>(new Clientes(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/buscarxEmail/{email}")
	public ResponseEntity<Clientes> buscarxEmail(@PathVariable("email") String email) {
		if (cliserv.buscarxEmail(email) != null) {
			return new ResponseEntity<Clientes>(cliserv.buscarxEmail(email), HttpStatus.OK);
		} else {

			return new ResponseEntity<Clientes>(new Clientes(), HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/registrar")
	public ResponseEntity<Void> registrar(@RequestBody Clientes cli) {
		if (cliserv.buscarxEmail(cli.getXemail()) != null) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		} else {
			Clientes clibd= new Clientes();
			clibd.setXnombre(cli.getXnombre());
			clibd.setXapellido(cli.getXapellido());
			clibd.setXdni(cli.getXdni());
			clibd.setXdireccion(cli.getXdireccion());
			clibd.setXtelefono(cli.getXtelefono());
			clibd.setXemail(cli.getXemail());
			clibd.setXcontrasenia(cli.getXcontrasenia());	
			clibd.setXestado(cli.getXestado());
			cliserv.registrar(clibd);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}

	}
	
	@PutMapping("/desactivar")
	public ResponseEntity<Void> desactivar(@RequestParam ("codcliente") int codcliente) {
		if (cliserv.buscar(codcliente) != null) {
			Clientes cliente=cliserv.buscar(codcliente);
			cliente.setXestado("INACTIVO");
			cliserv.editar(cliente);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping
	public ResponseEntity<Void> editar(@RequestBody Clientes cli) {
		if (cliserv.buscar(cli.getCodcliente()) != null) {
			cliserv.editar(cli);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}
	
	
	@DeleteMapping
	public ResponseEntity<Void> eliminar(@RequestParam ("codcliente") int codcliente) {
		if (cliserv.buscar(codcliente) != null) {
			cliserv.eliminar(codcliente);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}




}
