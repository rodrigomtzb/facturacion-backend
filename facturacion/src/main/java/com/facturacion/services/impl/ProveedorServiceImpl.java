package com.facturacion.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.entitys.Proveedor;
import com.facturacion.repositories.ProveedorDao;

@Service
public class ProveedorServiceImpl {

	@Autowired
	private ProveedorDao proveedorDao;
	
	public Proveedor save( Proveedor proveedor ) {
		return proveedorDao.save(proveedor);
	}
	
	public List<Proveedor> findAll( ) {
		return proveedorDao.findAll();
	}
	
}
