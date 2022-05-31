package com.example.ProyectoRestaurantev2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{
	
	@Query(value="{call sp_ListarProductoxCategorias(:codcategoria)}",
			nativeQuery=true)
	List<Productos> listarProductoxCategoria (@Param("codcategoria")int codcategoria);

	@Query(value="{call sp_ListarProductoxPalabra(:palabra)}",
			nativeQuery=true)
	List<Productos> ListarProductoxPalabra (@Param("palabra") String palabra);

	
}
