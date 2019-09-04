package com.eam.megainventario.inventario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salida_producto")
public class SalidaProducto {

	@Id
	@GeneratedValue
	@Column(name = "id_salida_producto")
	private int idSalidaProducto;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "sucursal")
	private Sucursal sucursal;
	
	@ManyToOne
	@JoinColumn(name = "salida")
	private Salida salida;

	public SalidaProducto(int idSalidaProducto, int cantidad, Producto producto, Sucursal sucursal, Salida salida) {
		super();
		this.idSalidaProducto = idSalidaProducto;
		this.cantidad = cantidad;
		this.producto = producto;
		this.sucursal = sucursal;
		this.salida = salida;
	}

	public SalidaProducto() {
	}

	public int getIdSalidaProducto() {
		return idSalidaProducto;
	}

	public void setIdSalidaProducto(int idSalidaProducto) {
		this.idSalidaProducto = idSalidaProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

	public Salida getSalida() {
		return salida;
	}

	public void setSalida(Salida salida) {
		this.salida = salida;
	}
	
}
