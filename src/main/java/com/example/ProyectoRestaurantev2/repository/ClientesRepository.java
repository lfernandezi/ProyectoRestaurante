package com.example.ProyectoRestaurantev2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.ProyectoRestaurantev2.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{
	
	@Query(value = "{call sp_buscarClienteEmail(:email)}",
			nativeQuery = true)
			Clientes buscarxEmail(
			@Param("email") String email);

	@Query(value = "{call sp_listarClientexEstado(:estado)}",
			nativeQuery = true)
			List<Clientes> listarxEstado(
			@Param("estado") String estado);
}
