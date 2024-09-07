package com.facturacion.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventarioProveedores")
public class InventarioProveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer invProvId;
	@Column
	private Integer proveedorId;
	@Column
	private Date fechaCarga;
	@Column
	private String codigo;
	@Column
	private String nombreProducto;
	@Column
	private Double precioProveedor;
	@Column
	private Integer numeroExistencias;
	@Column
	private Date caducidad;
	
	public Integer getInvProvId() {
		return invProvId;
	}
	public void setInvProvId(Integer invProvId) {
		this.invProvId = invProvId;
	}
	public Integer getProveedorId() {
		return proveedorId;
	}
	public void setProveedorId(Integer proveedorId) {
		this.proveedorId = proveedorId;
	}
	public Date getFechaCarga() {
		return fechaCarga;
	}
	public void setFechaCarga(Date fechaCarga) {
		this.fechaCarga = fechaCarga;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecioProveedor() {
		return precioProveedor;
	}
	public void setPrecioProveedor(Double precioProveedor) {
		this.precioProveedor = precioProveedor;
	}
	public Integer getNumeroExistencias() {
		return numeroExistencias;
	}
	public void setNumeroExistencias(Integer numeroExistencias) {
		this.numeroExistencias = numeroExistencias;
	}
	public Date getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}
	
	
}
