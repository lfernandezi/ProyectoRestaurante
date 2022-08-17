package com.example.ProyectoRestaurantev2.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ProyectoRestaurantev2.model.Clientes;
import com.example.ProyectoRestaurantev2.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

	@Transactional
	@Modifying
	@Query(value = "{call sp_IngresarPedido(:codcliente,"
	+ ":direccion,:ubicacion,:monto,:estado)}", nativeQuery = true)
	void ingresarPedido(@Param("codcliente") Integer codcliente, @Param("direccion") String direccion,
			@Param("ubicacion") String ubicacion,@Param("monto") Double monto, @Param("estado") String estado);
	
	
	
	@Query(value = "{call sp_ListarPedidoxCliente(:codcliente)}",
			nativeQuery = true)
			List<Pedido> listarPedidoxCliente(
			@Param("codcliente") int codcliente);
	
	@Query(value = "{call sp_ListarPedidoxEnvio(:codenvio)}",
			nativeQuery = true)
			List<Pedido> listarPedidoxEnvio(
			@Param("codenvio") int codenvio);
	
	@Query(value = "{call sp_ListarPedidoxEstado(:estado)}",
			nativeQuery = true)
			List<Pedido> listarPedidoxEstado(
			@Param("estado") String estado);
	
	@Query(value = "{call sp_ListarUltimoPedidoxCliente(:codcliente)}",
			nativeQuery = true)
			Pedido listaroUltimoPedidoxCliente(
			@Param("codcliente") int codcliente);
}
