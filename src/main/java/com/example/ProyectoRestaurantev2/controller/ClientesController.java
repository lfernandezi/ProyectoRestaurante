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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.Clientes;
import com.example.ProyectoRestaurantev2.services.ClientesService;


////http://localhost:8087/proyrestaurante/clientes
@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	ClientesService cliserv;
	
	@GetMapping
	public ResponseEntity <List<Clientes>> listar(){
		return new ResponseEntity<List<Clientes>> (cliserv.listar(),HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Void> registrar(@RequestBody Clientes cli){
		cliserv.registrar(cli);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//http://localhost:8087/proyrestaurante/clientes/buscar?codcliente=2
	@GetMapping("buscar")
	public ResponseEntity<Clientes> buscar(@RequestParam("codcliente")int codcliente) {
		if(cliserv.buscar(codcliente)!= null) {
			return new ResponseEntity<Clientes> (cliserv.buscar(codcliente),HttpStatus.OK);
		}
		
		return new ResponseEntity<Clientes>(new Clientes (),HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("buscarxEmail")
	public ResponseEntity<Clientes> buscarxEmail(@RequestParam("email") String email) {
		if(cliserv.buscarxEmail(email)!= null) {
			return new ResponseEntity<Clientes> (cliserv.buscarxEmail(email),HttpStatus.OK);
		}else {
		
			return new ResponseEntity<Clientes>(new Clientes (),HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping
	public ResponseEntity <Void> eliminar(int codcliente){
		if (cliserv.buscar(codcliente)!=null) {
			cliserv.eliminar(codcliente);
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<Void> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping
	public ResponseEntity <Void> editar (Clientes cli){
		if (cliserv.buscar(cli.getCodcliente())!=null) {
			cliserv.editar(cli);
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<Void> (HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	
	
}
