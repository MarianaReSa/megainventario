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
@Table(name = "entrada")
public class Entrada {

	@Id
	@GeneratedValue
	@Column(name = "id_entrada")
	private int idEntrada;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "fecha_entrada")
	private Date fechaEntrada;
	
	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "sucursal")
	private Sucursal sucursal;
	
	@ManyToOne
	@JoinColumn(name = "proveedor")
	private Proveedor proveedor;

	public Entrada(int idEntrada, int cantidad, Date fechaEntrada, Producto producto, Sucursal sucursal,
			Proveedor proveedor) {
		super();
		this.idEntrada = idEntrada;
		this.cantidad = cantidad;
		this.fechaEntrada = fechaEntrada;
		this.producto = producto;
		this.sucursal = sucursal;
		this.proveedor = proveedor;
	}

	public Entrada() {
	}

	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
}
