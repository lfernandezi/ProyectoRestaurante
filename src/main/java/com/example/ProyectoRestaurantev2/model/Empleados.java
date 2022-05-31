package com.example.ProyectoRestaurantev2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleados implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1677631929029134524L;

	@Id
	private int codempleado;	
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="dni")
	private String dni;
	
	
	@Column(name="contrasenia")
	private String contrasenia;
	
	@Column(name="fecha_ingreso")
	private Date fecha_ingreso;
	
	@Column(name="codcargo")
	private int codcargo;
	
	@Column(name="codarea")
	private int codarea;

	public int getCodempleado() {
		return codempleado;
	}

	public void setCodempleado(int codempleado) {
		this.codempleado = codempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasena(String contrasena) {
		this.contrasenia = contrasena;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	
	

	public Empleados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleados(int codempleado, String nombre, String apellido, String dni, String contrasenia,
			Date fecha_ingreso, int codcargo, int codarea) {
		super();
		this.codempleado = codempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.fecha_ingreso = fecha_ingreso;
		this.codcargo = codcargo;
		this.codarea = codarea;
	}

	public int getCodcargo() {
		return codcargo;
	}

	public void setCodcargo(int codcargo) {
		this.codcargo = codcargo;
	}

	public int getCodarea() {
		return codarea;
	}

	public void setCodarea(int codarea) {
		this.codarea = codarea;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	

	
}
