package com.example.ProyectoRestaurantev2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.CargoEmpleado;

@Repository
public interface CargoEmpRepository extends JpaRepository<CargoEmpleado, Integer>{
	

}
