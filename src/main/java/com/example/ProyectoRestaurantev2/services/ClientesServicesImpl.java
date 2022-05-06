package com.example.ProyectoRestaurantev2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.Clientes;
import com.example.ProyectoRestaurantev2.repository.ClientesRepository;

@Service
public class ClientesServicesImpl implements ClientesService{

	@Autowired
	ClientesRepository clirepo;
	
	@Override
	public Clientes registrar(Clientes cli) {
		// TODO Auto-generated method stub
		return clirepo.save(cli);
	}

	@Override
	public List<Clientes> listar() {
		// TODO Auto-generated method stub
		return clirepo.findAll();
	}

	@Override
	public Optional<Clientes> buscar(int codcliente) {
		// TODO Auto-generated method stub
		return clirepo.findById(codcliente);
	}

	

}
