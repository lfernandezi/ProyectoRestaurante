package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detallepedido")
public class DetallePedido {
	
	@Column(name ="codpedido")
	private int codpedido;
	
	@Id
	private int codproducto;
	
	@Column(name ="nombreproducto")
	private String nombreproducto;
	
	@Column(name ="descripcion")
	private String descripcion;
	
	@Column(name ="cantidad")
	private int cantidad;
	
	@Column(name ="precio")
	private double precio;
	
	@Column(name ="subtotal")
	private double subtotal;
	
	
	public double getSubtotal() {
		return subtotal;
	}
	

	public DetallePedido(int codpedido, int codproducto, String nombreproducto, String descripcion, int cantidad,
			double precio, double subtotal) {
		super();
		this.codpedido = codpedido;
		this.codproducto = codproducto;
		this.nombreproducto = nombreproducto;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
	}


	public DetallePedido(int codproducto, String nombreproducto, String descripcion, int cantidad, double precio,
			double subtotal) {
		super();
		this.codproducto = codproducto;
		this.nombreproducto = nombreproducto;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
	}
	
	
	public int getCodpedido() {
		return codpedido;
	}


	public void setCodpedido(int codpedido) {
		this.codpedido = codpedido;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public int getCodproducto() {
		return codproducto;
	}
	public void setCodproducto(int codproducto) {
		this.codproducto = codproducto;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	public DetallePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
