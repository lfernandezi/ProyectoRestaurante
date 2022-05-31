package com.example.ProyectoRestaurantev2.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.ResponseBody;
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
	public ResponseEntity<List<Productos>> listar() {
		return new ResponseEntity<List<Productos>>(prodserv.listar(), HttpStatus.OK);
	}
	
	@GetMapping("/listarxCategoria")
	public ResponseEntity<List<Productos>> listarxCategoría(@RequestParam("codcategoria") int codcategoria) {
		if (prodserv.listarxCategorias(codcategoria).isEmpty()) {
			return new ResponseEntity<List<Productos>>(new ArrayList<Productos>(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Productos>>(prodserv.listarxCategorias(codcategoria), HttpStatus.OK);
		}
	}
	
	@GetMapping("/listarxPalabra")
	public ResponseEntity<List<Productos>> listarxPalabra(@RequestParam("palabra") String palabra) {
		if (prodserv.listarxPalabra(palabra).isEmpty()) {
			return new ResponseEntity<List<Productos>>(new ArrayList<Productos>(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Productos>>(prodserv.listarxPalabra(palabra), HttpStatus.OK);
		}
	}

	
	@GetMapping("/buscar")
	public ResponseEntity<Productos> buscar(@RequestParam("codproducto") int codproducto) {
		if (prodserv.buscar(codproducto) != null) {
			return new ResponseEntity<Productos>(prodserv.buscar(codproducto), HttpStatus.OK);
		} else {
			return new ResponseEntity<Productos>(new Productos(), HttpStatus.NOT_FOUND);
		}

	}

	
	@PostMapping
	public ResponseEntity<Void> registrar(@RequestBody Productos producto) {
		prodserv.registrar(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);

	}

	@PutMapping
	public ResponseEntity<Void> editar(@RequestBody Productos producto) {
		if (prodserv.buscar(producto.getCodproducto()) != null) {
			prodserv.editar(producto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping
	public ResponseEntity<Void> eliminar(@RequestParam int codproducto) {

		if (prodserv.buscar(codproducto) != null) {
			prodserv.eliminar(codproducto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}

	

}
