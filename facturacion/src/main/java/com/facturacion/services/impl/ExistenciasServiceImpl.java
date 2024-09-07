package com.facturacion.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.entitys.Existencias;
import com.facturacion.repositories.ExistenciasDao;

@Service
public class ExistenciasServiceImpl {

	@Autowired
	private ExistenciasDao dao;
	
	public List<Existencias> saveListExtsencias( List<Existencias> existencias ) {
		
		return dao.saveAll(existencias);
		
	}
	
	public List<Existencias> getProductByProvider( Integer proveedor_id ) {
		
		return dao.getExistenciasByProveedorId(proveedor_id);
		
	}
	
	public List<Existencias> getExistenciasByNombreProductoLike( String nameProduct ){
		return dao.getExistenciasByNombreProductoLike(nameProduct);
	}
	
	
	
	
}
