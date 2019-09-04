package com.eam.megainventario.inventario.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salida")
public class Salida {

	@Id
	@GeneratedValue
	@Column(name = "id_salida")
	private int idSalida;
	
	@Column(name = "fecha_salida")
	private Date fechaSalida;
	
	@Column(name = "total_venta")
	private double totalVenta;
	
	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;

	public Salida(int idSalida, Date fechaSalida, double totalVenta, Cliente cliente) {
		super();
		this.idSalida = idSalida;
		this.fechaSalida = fechaSalida;
		this.totalVenta = totalVenta;
		this.cliente = cliente;
	}

	public Salida() {
	}

	public int getIdSalida() {
		return idSalida;
	}

	public void setIdSalida(int idSalida) {
		this.idSalida = idSalida;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
