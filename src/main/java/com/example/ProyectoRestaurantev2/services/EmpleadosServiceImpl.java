package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.Empleados;
import com.example.ProyectoRestaurantev2.repository.EmpleadosRepostory;
import com.example.ProyectoRestaurantev2.repository.EnviosRepository;

@Service
public class EmpleadosServiceImpl implements EmpleadosService{

	@Autowired
	private EmpleadosRepostory emplrepo;

	@Override
	public Empleados registrar(Empleados emp) {
		// TODO Auto-generated method stub
		return emplrepo.save(emp);
	}

	@Override
	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		return emplrepo.findAll();
	}
}
