package com.example.ProyectoRestaurantev2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="detallepedido")
public class DetallePedido {
	
	
	@JoinColumn(name ="codpedido",
			foreignKey=@ForeignKey(foreignKeyDefinition = "foreign key(codpedido) references pedido(codpedido)"))
	private int codpedido;
	
	@Id
	private int codproducto;
	
	
	@Column(name ="cantidad")
	private int cantidad;
	

	
	@Column(name ="precio")
	private double precio;



	public int getCodpedido() {
		return codpedido;
	}

	public void setCodpedido(int codpedido) {
		this.codpedido = codpedido;
	}

	public int getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(int codproducto) {
		this.codproducto = codproducto;
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

	public DetallePedido(int codpedido, int codproducto, int cantidad, double precio) {
		super();
		this.codpedido = codpedido;
		this.codproducto = codproducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public DetallePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
