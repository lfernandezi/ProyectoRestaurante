package com.example.ProyectoRestaurantev2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import lombok.Data;

@Entity
@Table (name="cliente")
public class Clientes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8295344666433158719L;

	@Id
	private int codcliente;
	@Column(name = "dni")
	private String xdni;
	
	@Column(name = "nombre")
	private String xnombre;
	
	@Column(name = "apellido")
	private String xapellido;
	
	@Column(name = "email")
	private String xemail;
	
	@Column(name = "contraseña")
	private String xcontrasenia;
	
	@Column(name = "direccion")
	private String xdireccion;
	
	@Column(name = "telefono")
	private String xtelefono;
	
	@Column(name = "estado")
	private String xestado;
	
	public int getCodcliente() {
		return codcliente;
	}
	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}
	public String getXdni() {
		return xdni;
	}
	public void setXdni(String xdni) {
		this.xdni = xdni;
	}
	public String getXnombre() {
		return xnombre;
	}
	public void setXnombre(String xnombre) {
		this.xnombre = xnombre;
	}
	public String getXapellido() {
		return xapellido;
	}
	public void setXapellido(String xapellido) {
		this.xapellido = xapellido;
	}
	public String getXemail() {
		return xemail;
	}
	public void setXemail(String xemail) {
		this.xemail = xemail;
	}
	public String getXcontrasenia() {
		return xcontrasenia;
	}
	public void setXcontrasenia(String xcontrasenia) {
		this.xcontrasenia = xcontrasenia;
	}
	public String getXdireccion() {
		return xdireccion;
	}
	public void setXdireccion(String xdireccion) {
		this.xdireccion = xdireccion;
	}
	public String getXtelefono() {
		return xtelefono;
	}
	public void setXtelefono(String xtelefono) {
		this.xtelefono = xtelefono;
	}
	public String getXestado() {
		return xestado;
	}
	public void setXestado(String xestado) {
		this.xestado = xestado;
	}
	
	public Clientes(int codcliente, String xdni, String xnombre, String xapellido, String xemail,
			String xcontrasenia, String xdireccion, String xtelefono, String xestado) {
		super();
		this.codcliente = codcliente;
		this.xdni = xdni;
		this.xnombre = xnombre;
		this.xapellido = xapellido;
		this.xemail = xemail;
		this.xcontrasenia = xcontrasenia;
		this.xdireccion = xdireccion;
		this.xtelefono = xtelefono;
		this.xestado = xestado;
	}
	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
