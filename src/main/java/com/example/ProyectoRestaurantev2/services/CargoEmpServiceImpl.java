package com.example.ProyectoRestaurantev2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ProyectoRestaurantev2.model.CargoEmpleado;
import com.example.ProyectoRestaurantev2.repository.CargoEmpRepository;

@Service
public class CargoEmpServiceImpl implements CargoEmpService{
	
	private CargoEmpRepository cargorepo;

	@Override
	public List<CargoEmpleado> listar() {
		// TODO Auto-generated method stub
		return cargorepo.findAll();
	}

	@Override
	public CargoEmpleado buscarv(int codcargo) {
		// TODO Auto-generated method stub
		return cargorepo.findById(codcargo).orElse(null);
	}

}
