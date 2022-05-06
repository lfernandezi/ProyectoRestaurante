package com.example.ProyectoRestaurantev2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.Clientes;
import com.example.ProyectoRestaurantev2.services.ClientesService;

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
	
	/*lic Clientes buscar(int codcliente) {
		if(cliserv.buscar(codcliente)!= null) {
			
		}
		
		return ;
	}*/
}
