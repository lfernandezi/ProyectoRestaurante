package com.example.ProyectoRestaurantev2.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

	@Transactional
	@Modifying
	@Query(value = "{call sp_IngresarPedido(:codcliente,"
	+ ":direccion,:monto,:estado)}", nativeQuery = true)
	void ingresarPedido(@Param("codcliente") Integer codcliente, @Param("direccion") String direccion,
			@Param("monto") Double monto, @Param("estado") String estado);
	
	/*@Transactional
	@Modifying
	@Query(value="{call sp_ActualizarEstadoPedido(:codpedido, :estado)}",
			nativeQuery=true)
	void actualizarEstadoPedido (@Param("codpedido")Integer codpedido,
			                 @Param("estado")String estado);*/
}
