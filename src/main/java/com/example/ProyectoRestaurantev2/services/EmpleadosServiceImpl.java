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
	public void registrar(Empleados emp) {
		// TODO Auto-generated method stub
		emplrepo.save(emp);
	}

	@Override
	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		return emplrepo.findAll();
	}

	@Override
	public Empleados buscar(int codigo) {
		// TODO Auto-generated method stub
		return emplrepo.findById(codigo).orElse(null);
	}

	@Override
	public Empleados buscarxdni(String dni) {
		// TODO Auto-generated method stub
		return emplrepo.buscarxdni(dni);
	}

	@Override
	public void editar(Empleados emp) {
		emplrepo.saveAndFlush(emp);
		
	}

	@Override
	public void eliminar(int codigo) {
		
		emplrepo.deleteById(codigo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empleados> listarxArea(int codarea) {
		// TODO Auto-generated method stub
		return emplrepo.listarEmpleadoxArea(codarea);
	}

	@Override
	public List<Empleados> listarxCargo(int codcargo) {
		// TODO Auto-generated method stub
		return emplrepo.listarEmpleadoxCargo(codcargo);
	}

	
}
