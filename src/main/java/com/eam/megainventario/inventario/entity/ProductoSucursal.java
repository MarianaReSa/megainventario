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
@Table(name = "producto_sucursal")
public class ProductoSucursal {

	@Id
	@GeneratedValue
	@Column(name = "id_producto_sucursal")
	private int idProductoSucursa;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "fecha_actualizacion")
	private Date fechaActualizacion;
	
	@Column(name = "precio_compra")
	private double precioCompra;
	
	@Column(name = "precio_venta")
	private double precioVenta;
	
	@ManyToOne
	@JoinColumn(name = "sucursal")
	private Sucursal sucursal;
	
	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;

	public ProductoSucursal(int idProductoSucursa, int cantidad, Date fechaActualizacion, double precioCompra,
			double precioVenta, Sucursal sucursal, Producto producto) {
		super();
		this.idProductoSucursa = idProductoSucursa;
		this.cantidad = cantidad;
		this.fechaActualizacion = fechaActualizacion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.sucursal = sucursal;
		this.producto = producto;
	}

	public ProductoSucursal() {
	}

	public int getIdProductoSucursa() {
		return idProductoSucursa;
	}

	public void setIdProductoSucursa(int idProductoSucursa) {
		this.idProductoSucursa = idProductoSucursa;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
}
