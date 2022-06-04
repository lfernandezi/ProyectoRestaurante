package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.AreaEmpleado;
import com.example.ProyectoRestaurantev2.repository.AreaEmpRepository;

@Service
public class AreaEmpServiceImpl implements AreaEmpService {
	
	@Autowired
	private AreaEmpRepository arearepo;

	@Override
	public List<AreaEmpleado> listar() {
		// TODO Auto-generated method stub
		return arearepo.findAll();
	}

	@Override
	public AreaEmpleado buscar(int codarea) {
		// TODO Auto-generated method stub
		return arearepo.findById(codarea).orElse(null);
	}

}
