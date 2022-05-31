package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class CategoriaProducto {
	

	@Id
	private int codcategoria;
	
	@Column(name ="categoria")
	private String categoria;

	
	public CategoriaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCodcategoria() {
		return codcategoria;
	}


	public void setCodcategoria(int codcategoria) {
		this.codcategoria = codcategoria;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public CategoriaProducto(int codcategoria, String categoria) {
		super();
		this.codcategoria = codcategoria;
		this.categoria = categoria;
	}

}
