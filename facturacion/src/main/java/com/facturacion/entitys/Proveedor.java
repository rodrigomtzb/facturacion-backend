package com.facturacion.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer proveedor_id;
	@Column
	private String nombre;
	@Column
	private String telefono;
	@Column
	private String email;
	@Column
	private String empresa;
	@Column
	private boolean avisoFunc;
	@Column
	private boolean rfc;
	@Column
	private boolean actaConst;
	@Column
	private boolean altaRespSani;
	@Column
	private boolean licSani;
	@Column
	private boolean identOfi;
	
	public Integer getProveedor_id() {
		return proveedor_id;
	}
	public void setProveedor_id(Integer proveedor_id) {
		this.proveedor_id = proveedor_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public boolean isAvisoFunc() {
		return avisoFunc;
	}
	public void setAvisoFunc(boolean avisoFunc) {
		this.avisoFunc = avisoFunc;
	}
	public boolean isRfc() {
		return rfc;
	}
	public void setRfc(boolean rfc) {
		this.rfc = rfc;
	}
	public boolean isActaConst() {
		return actaConst;
	}
	public void setActaConst(boolean actaConst) {
		this.actaConst = actaConst;
	}
	public boolean isAltaRespSani() {
		return altaRespSani;
	}
	public void setAltaRespSani(boolean altaRespSani) {
		this.altaRespSani = altaRespSani;
	}
	public boolean isLicSani() {
		return licSani;
	}
	public void setLicSani(boolean licSani) {
		this.licSani = licSani;
	}
	public boolean isIdentOfi() {
		return identOfi;
	}
	public void setIdentOfi(boolean identOfi) {
		this.identOfi = identOfi;
	}
}
