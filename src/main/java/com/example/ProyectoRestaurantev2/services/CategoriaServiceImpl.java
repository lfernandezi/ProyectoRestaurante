package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.CategoriaProducto;
import com.example.ProyectoRestaurantev2.repository.CategoriaRepositorio;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepositorio caterepo;

	@Override
	public List<CategoriaProducto> listar() {
		// TODO Auto-generated method stub
		return caterepo.findAll();
		
	}
}
