package com.example.ProyectoRestaurantev2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleados {
	
	@Id
	private int codempleado; 
	
	@Column(name="nombre")
	private String nombre ;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="dni")
	private String dni ;
	
	@Column(name="cargo")
	private String cargo; 
	
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="fecha_ingreso")
	private Date fecha_ingreso ;
	
	@Column(name="area")
	private String area ;

	
	
	public Empleados () {}
	
	
	public Empleados(int codempleado, String nombre, String apellido, String dni, String cargo, String contrasena,
			Date fecha_ingreso, String area) {
		super();
		this.codempleado = codempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cargo = cargo;
		this.contrasena = contrasena;
		this.fecha_ingreso = fecha_ingreso;
		this.area = area;
	}

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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
}
