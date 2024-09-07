package com.facturacion.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="existencias")
public class Existencias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer existencia_id;
	@Column
	private Date caducidad; //: Mon Feb 28 2022 00:00:36 GMT-0600 (hora estándar central) {}
	@Column
	private String codigo; //: 7501287621009
	@Column
	private Integer existencias;// -- : 2259
	@Column
	private Date fechaCarga; //: Thu Feb 17 2022 01:43:08 GMT-0600 (hora estándar central) {}
	@Column
	private String nombreProducto; //: "ALDACTONE 100MG - TAB - 30              "
	@Column
	private Double precio;//: null
	@Column(name="proveedor_id")
	private Integer proveedorId; //: 2
	
	public Integer getExistencia_id() {
		return existencia_id;
	}
	public void setExistencia_id(Integer existencia_id) {
		this.existencia_id = existencia_id;
	}
	public Date getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getExistencias() {
		return existencias;
	}
	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}
	public Date getFechaCarga() {
		return fechaCarga;
	}
	public void setFechaCarga(Date fechaCarga) {
		this.fechaCarga = fechaCarga;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getProveedorId() {
		return proveedorId;
	}
	public void setProveedorId(Integer proveedorId) {
		this.proveedorId = proveedorId;
	}
	
}
