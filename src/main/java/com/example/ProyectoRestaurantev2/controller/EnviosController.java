package com.example.ProyectoRestaurantev2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoRestaurantev2.model.Envios;
import com.example.ProyectoRestaurantev2.services.EnviosService;
 

//http://localhost:8087/proyrestaurante/envios
@RestController
@RequestMapping("/envios")
public class EnviosController {
	
	@Autowired
	private EnviosService evservice;
	
	@GetMapping
	private List<Envios> listar(){
		return evservice.listar();
	}
	

}
