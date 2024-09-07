package com.facturacion.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.entitys.UltimasExistencias;
import com.facturacion.repositories.UltimasExistenciasDao;

@Service
public class UltimasExistenciasService {

	@Autowired
	private UltimasExistenciasDao dao;
	
	public List<UltimasExistencias> getLastExistencias( ) {
		
		return dao.findAll();
		
	}
	
	public List<UltimasExistencias> getProductByProvider( Integer proveedor_id ) {
		
		return dao.getUltimasExistenciasByProveedorId(proveedor_id);
		
	}
	
	public List<UltimasExistencias> getExistenciasByNombreProductoLike( String nameProduct ){
		return dao.getUltimasExistenciasByNombreProductoLike(nameProduct);
	}
	
}
