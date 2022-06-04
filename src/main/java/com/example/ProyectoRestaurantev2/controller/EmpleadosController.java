package com.example.ProyectoRestaurantev2.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.example.ProyectoRestaurantev2.model.Empleados;
import com.example.ProyectoRestaurantev2.services.EmpleadosService;



//http://localhost:8087/proyrestaurante/empleados
@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

	@Autowired
	private EmpleadosService emplserv;
	
	@GetMapping 
	public ResponseEntity<List<Empleados>> listar(){
		return new ResponseEntity <List<Empleados>> (emplserv.listar(), HttpStatus.OK);
	}
	
	@GetMapping ("/listarxarea/{codarea}")
	public ResponseEntity<List<Empleados>> listarxArea(@PathVariable ("codarea") int codarea){
		if (emplserv.listarxArea(codarea).isEmpty()) {
			return new ResponseEntity <List<Empleados>> (new ArrayList<>(), HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity <List<Empleados>> (emplserv.listarxArea(codarea), HttpStatus.OK);
		}	
	}
	
	
	@GetMapping ("/listarxcargo/{codcargo}")
	public ResponseEntity<List<Empleados>> listarxCargo(@PathVariable ("codcargo") int codcargo){
		if (emplserv.listarxCargo(codcargo).isEmpty()) {
			return new ResponseEntity <List<Empleados>> (new ArrayList<>(), HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity <List<Empleados>> (emplserv.listarxCargo(codcargo), HttpStatus.OK);
		}
	}
	
	
	@GetMapping("buscar")
	public ResponseEntity<Empleados> buscar(@RequestParam("codempleado")int codempleado) {
		if(emplserv.buscar(codempleado)!= null) {
			return new ResponseEntity<Empleados> (emplserv.buscar(codempleado),HttpStatus.OK);
		}else {
			return new ResponseEntity<Empleados>(new Empleados (),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/buscarxdni")
	public ResponseEntity<Empleados> buscarxdni(@RequestParam("dni") String dni) {
		if(emplserv.buscarxdni(dni)!= null) {
			return new ResponseEntity<Empleados> (emplserv.buscarxdni(dni),HttpStatus.OK);
		}else {
			return new ResponseEntity<Empleados>(new Empleados (),HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Void> registrar(@RequestBody Empleados emple){
		emplserv.registrar(emple);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@PutMapping
	public ResponseEntity <Void> editar (@RequestBody Empleados emp){
		if (emplserv.buscar(emp.getCodempleado())!=null) {
			emplserv.eliminar(emp.getCodempleado());
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<Void> (HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping("eliminar/{codempleado}")
	public ResponseEntity <Void> eliminar(@PathVariable ("codempleado")int codempleado){
		if (emplserv.buscar(codempleado)!=null) {
			emplserv.eliminar(codempleado);
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<Void> (HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
	
}
