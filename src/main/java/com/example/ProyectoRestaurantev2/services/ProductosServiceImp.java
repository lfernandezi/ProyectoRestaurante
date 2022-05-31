package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.Productos;
import com.example.ProyectoRestaurantev2.repository.ProductosRepository;

@Service
public class ProductosServiceImp implements ProductosService{
	
	@Autowired
	private ProductosRepository prodrepo;

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return prodrepo.findAll();
	}


	@Override
	public List<Productos> listarxCategorias(int codcategorias) {
		// TODO Auto-generated method stub
		
		return prodrepo.listarProductoxCategoria(codcategorias);
	}
	
	

	@Override
	public List<Productos> listarxPalabra(String palabra) {
		// TODO Auto-generated method stub
		return prodrepo.ListarProductoxPalabra(palabra);
	}
	
	@Override
	public Productos buscar(int codproducto) {
		// TODO Auto-generated method stub
		
		return prodrepo.findById(codproducto).orElse(null);
	}
	
	
	@Override
	public void registrar(Productos producto) {
		// TODO Auto-generated method stub
		prodrepo.save(producto);
		
	}

	@Override
	public void editar(Productos producto) {
		// TODO Auto-generated method stub
		prodrepo.saveAndFlush(producto);
	}

	@Override
	public void eliminar(int codproducto) {
		// TODO Auto-generated method stub
		prodrepo.deleteById(codproducto);
	}



	



}
