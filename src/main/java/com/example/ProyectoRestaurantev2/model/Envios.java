package com.example.ProyectoRestaurantev2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="envios")
public class Envios {
	@Id
	private int codenvio;
	
	@Column(name="codempleado")
	private int codempleado;
	
	@Column(name="fecha_envio")
	private Date fecha_envio;
	
	@Column(name="estadoenvio")
	private String estadoenvio;

	
	public Envios() {}
	
	
	public Envios(int codenvio, int codempleado, Date fecha_envio, String estadoenvio) {
		super();
		this.codenvio = codenvio;
		this.codempleado = codempleado;
	
		this.fecha_envio = fecha_envio;
		this.estadoenvio = estadoenvio;
	}

	public int getCodenvio() {
		return codenvio;
	}

	public void setCodenvio(int codenvio) {
		this.codenvio = codenvio;
	}

	public int getCodempleado() {
		return codempleado;
	}

	public void setCodempleado(int codempleado) {
		this.codempleado = codempleado;
	}

	
	

	public Date getFecha_envio() {
		return fecha_envio;
	}

	public void setFecha_envio(Date fecha_envio) {
		this.fecha_envio = fecha_envio;
	}

	public String getEstadoenvio() {
		return estadoenvio;
	}

	public void setEstadoenvio(String estadoenvio) {
		this.estadoenvio = estadoenvio;
	}
	
	
	
}
