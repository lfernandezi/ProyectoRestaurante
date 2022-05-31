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
	public List<Envios> listar() {
		// TODO Auto-generated method stub
		return enviorepo.findAll();
	}
	
	@Override
	public Envios buscar(int codenvio) {
		// TODO Auto-generated method stub
		return enviorepo.findById(codenvio).orElse(null);
	}


	@Override
	public void registrar(Envios e) {
		// TODO Auto-generated method stub
		enviorepo.save(e);
	}
	
	@Override
	public void editar(Envios e) {
		// TODO Auto-generated method stub
		enviorepo.saveAndFlush(e);
		
	}

	@Override
	public void eliminar(int codenvio) {
		// TODO Auto-generated method stub
		enviorepo.deleteById(codenvio);	
	}
 
	
}
