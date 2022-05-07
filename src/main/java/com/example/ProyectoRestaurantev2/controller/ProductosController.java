package com.example.ProyectoRestaurantev2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.Productos;
import com.example.ProyectoRestaurantev2.services.ProductosService;


//http://localhost:8087/proyrestaurante/productos
@RestController
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private ProductosService prodserv;
	
	@GetMapping
	public List<Productos>listar(){
		return prodserv.listar();
	}
	
	@PostMapping
	public void registrar(Productos producto) {
		prodserv.registrar(producto);
		
	}
	
	@PutMapping
	public void editar(Productos producto) {
		prodserv.editar(producto);
	}
	
	@DeleteMapping
	public void eliminar(int codproducto) {
		prodserv.eliminar(codproducto);
	}
	
	@GetMapping("buscar/")
	public Productos buscar(int codproducto) {
	
		return prodserv.buscar(codproducto);	
	}

}
