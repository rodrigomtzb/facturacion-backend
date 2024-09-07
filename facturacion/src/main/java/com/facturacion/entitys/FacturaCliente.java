package com.facturacion.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facturasClientes")
public class FacturaCliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer facCliId; //` INT UNSIGNED NOT NULL AUTO_INCREMENT,
	@Column
	private String numeroFactura; //` VARCHAR(45) NULL,
	@Column
	private String cliente; //` VARCHAR(200) NULL,
	@Column
	private Date fechaEntrega; //` DATETIME NULL,
	@Column
	private Date fechaFactura; //` DATETIME NULL,
	@Column
	private Date fechaVencimiento; //` DATETIME NULL,
	@Column
	private Double importe; //` DECIMAL(12,2) NULL,
	@Column
	private Double descuento; //` DECIMAL(12,2) NULL,
	@Column
	private Double deposito; //` DECIMAL(12,2) NULL,
	@Column
	private Double total; //` DECIMAL(12,2) NULL,
	@Column
	private String nota; //` VARCHAR(500) NULL,
	@Column
	private String comentarios; //` VARCHAR(500) NULL,
	
	public Integer getFacCliId() {
		return facCliId;
	}
	public void setFacCliId(Integer facCliId) {
		this.facCliId = facCliId;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Double getDeposito() {
		return deposito;
	}
	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
