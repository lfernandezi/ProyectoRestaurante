package com.example.ProyectoRestaurantev2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.CategoriaProducto;
import com.example.ProyectoRestaurantev2.services.CategoriaServiceImpl;


//http://localhost:8087/proyrestaurante/categoria

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaServiceImpl cateserv;
	
	@GetMapping
	public ResponseEntity<List<CategoriaProducto>>listar(){
		return new ResponseEntity<List<CategoriaProducto>>(cateserv.listar(),HttpStatus.OK);
	}

}
