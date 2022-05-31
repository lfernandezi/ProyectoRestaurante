package com.example.ProyectoRestaurantev2.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	private int codpedido;
	
	private Date fechacreacion;
	
	private String direccion;
	
	private double monto;
	
	private String estadopedido;
	
	private String  motivo;
	
	private int codenvio;
	
	private int codcliente;
	
	@OneToMany(mappedBy ="codpedido")
	private List<DetallePedido> detalle;

	public int getCodpedido() {
		return codpedido;
	}

	public void setCodpedido(int codpedido) {
		this.codpedido = codpedido;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEstadopedido() {
		return estadopedido;
	}

	public void setEstadopedido(String estadopedido) {
		this.estadopedido = estadopedido;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getCodenvio() {
		return codenvio;
	}

	public void setCodenvio(int codenvio) {
		
		this.codenvio = codenvio;
	}

	public int getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}

	public Pedido(int codpedido, Date fechacreacion, String direccion, double monto, String estadopedido, String motivo,
			int codenvio, int codcliente) {
		super();
		this.codpedido = codpedido;
		this.fechacreacion = fechacreacion;
		this.direccion = direccion;
		this.monto = monto;
		this.estadopedido = estadopedido;
		this.motivo = motivo;
		this.codenvio = codenvio;
		this.codcliente = codcliente;
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int codpedido, Date fechacreacion, String direccion, double monto, String estadopedido, String motivo,
			int codenvio, int codcliente, List<DetallePedido> detalle) {
		super();
		this.codpedido = codpedido;
		this.fechacreacion = fechacreacion;
		this.direccion = direccion;
		this.monto = monto;
		this.estadopedido = estadopedido;
		this.motivo = motivo;
		this.codenvio = codenvio;
		this.codcliente = codcliente;
		this.detalle = detalle;
	}

	public List<DetallePedido> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetallePedido> detalle) {
		this.detalle = detalle;
	}
	
	
	
}
