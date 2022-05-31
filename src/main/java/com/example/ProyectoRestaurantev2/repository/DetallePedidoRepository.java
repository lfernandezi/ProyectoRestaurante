package com.example.ProyectoRestaurantev2.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.DetallePedido;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Integer>{
	
	@Query(value = "{call sp_VerDetallePedido(:codpedido)}",
			nativeQuery = true)
			List<DetallePedido> verDetallePedido(@Param("codpedido") int codpedido);
	
	@Transactional
	@Modifying
	@Query(value = "{call sp_IngresarDetallePedido(:codproducto,"
	+ ":cantidad,:subtotal)}", nativeQuery = true)
	void ingresarDetallePedido(@Param("codproducto") Integer codproducto, 
			@Param("cantidad") int cantidad, @Param("subtotal") Double subtotal);

}
