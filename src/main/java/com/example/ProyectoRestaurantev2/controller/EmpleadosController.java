package com.example.ProyectoRestaurantev2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.Empleados;
import com.example.ProyectoRestaurantev2.services.EmpleadosService;



//http://localhost:8087/proyrestaurante/empleados
@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

	@Autowired
	private EmpleadosService emplserv;
	
	@GetMapping
	public List<Empleados> listar(){
		return emplserv.listar();
	}
}
