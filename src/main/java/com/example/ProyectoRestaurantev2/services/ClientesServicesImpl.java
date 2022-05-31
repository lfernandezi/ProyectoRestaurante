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
	public List<Clientes> listar() {
		// TODO Auto-generated method stub
		return clirepo.findAll();
	}

	@Override
	public List<Clientes> listarxEstado(String estado) {
		// TODO Auto-generated method stub
		return clirepo.listarxEstado(estado);
	}
	
	@Override
	public Clientes buscar(int codcliente) {
		// TODO Auto-generated method stub
		return clirepo.findById(codcliente).orElse(null);
	}

	@Override
	public Clientes buscarxEmail(String email) {
		// TODO Auto-generated method stub
		return clirepo.buscarxEmail(email);
	}

	@Override
	public void registrar(Clientes cli) {
		// TODO Auto-generated method stub
		clirepo.save(cli);
	}

	@Override
	public void editar(Clientes cli) {
		// TODO Auto-generated method stub
		clirepo.saveAndFlush(cli);
	}

	@Override
	public void eliminar(int codcliente) {
		// TODO Auto-generated method stub
		clirepo.deleteById(codcliente);
	}


	

	


}
