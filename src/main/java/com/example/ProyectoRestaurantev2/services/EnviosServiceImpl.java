package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.Envios;
import com.example.ProyectoRestaurantev2.repository.EnviosRepository;

@Service
public class EnviosServiceImpl implements EnviosService {
	
	@Autowired
	private EnviosRepository enviorepo;

	@Override
	public Envios registrar(Envios e) {
		// TODO Auto-generated method stub
		return enviorepo.save(e);
	}

	@Override
	public List<Envios> listar() {
		// TODO Auto-generated method stub
		return enviorepo.findAll();
	}
 
	
}
