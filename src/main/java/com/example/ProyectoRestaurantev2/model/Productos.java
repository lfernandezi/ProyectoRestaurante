package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Productos {
	
	@Id
	private int codproducto;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "precio")
	private Double precio;
	
	public int getCodproducto() {
		return codproducto;
	}
	public void setCodproducto(int codproducto) {
		this.codproducto = codproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Productos(int codproducto, String nombre, String descripcion, String categoria, Double precio) {
		super();
		this.codproducto = codproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
	}		

	
	

}
