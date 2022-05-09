package com.example.ProyectoRestaurantev2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.Empleados;

@Repository
public interface EmpleadosRepostory extends JpaRepository<Empleados, Integer>{
	
	
	@Query(value = "{call sp_buscarEmpleadoxdni(:dni)}",
    		nativeQuery = true)
    Empleados buscarxdni(@Param("dni")String dni);
	


}
