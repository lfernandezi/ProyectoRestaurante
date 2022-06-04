package com.example.ProyectoRestaurantev2.repository;

import java.util.List;

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
	

	@Query(value = "{call sp_listarEmpleadoxArea(:codarea)}",
    		nativeQuery = true)
	List<Empleados> listarEmpleadoxArea(@Param("codarea")int codarea);
	
	
	@Query(value = "{call sp_listarEmpleadoxCargo(:codcargo)}",
    		nativeQuery = true)
	List<Empleados> listarEmpleadoxCargo(@Param("codcargo")int codcargo);


}
