package com.facturacion.controllers.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturacion.entitys.Existencias;
import com.facturacion.entitys.UltimasExistencias;
import com.facturacion.services.impl.ExistenciasServiceImpl;
import com.facturacion.services.impl.UltimasExistenciasService;

@RestController
@CrossOrigin(allowedHeaders="*")
@RequestMapping("/api/productos")
public class Inventario {
	
	@Autowired
	private ExistenciasServiceImpl existenciasSrvc;
	
	@Autowired
	private UltimasExistenciasService ultExistenciasSrvc;
	
	@PostMapping("/")
	public ResponseEntity<?> addExistenciasProveedor(@RequestBody List<Existencias> existencias ) {
		try {
			
			List<Existencias> lst = existenciasSrvc.saveListExtsencias(existencias);
			
			return new ResponseEntity<List<Existencias>>(lst,null,HttpStatus.CREATED);
			
		}catch(Exception e) {
			return new ResponseEntity<List<Existencias>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getLastProducts( ) {
		try {
			
			List<UltimasExistencias> lst = ultExistenciasSrvc.getLastExistencias();
			
			return new ResponseEntity<List<UltimasExistencias>>(lst,null,HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<List<UltimasExistencias>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping(value="/proveedor/{proveedorID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getLastProductsByProvider(@PathVariable("proveedorID") Integer proveedorID){
		List<UltimasExistencias> lst = ultExistenciasSrvc.getProductByProvider(proveedorID);
		return new ResponseEntity<List<UltimasExistencias>>(lst,null,HttpStatus.OK);
	}
	
	@GetMapping(value="/{productName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getLastProductsByProvider(@PathVariable("productName") String productName){
		List<UltimasExistencias> lst = ultExistenciasSrvc.getExistenciasByNombreProductoLike(productName);
		return new ResponseEntity<List<UltimasExistencias>>(lst,null,HttpStatus.OK);
	}
	
	@GetMapping(value="/proveedor/historic/{proveedorID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getProductsByProvider(@PathVariable("proveedorID") Integer proveedorID){
		List<Existencias> lst = existenciasSrvc.getProductByProvider(proveedorID);
		return new ResponseEntity<List<Existencias>>(lst,null,HttpStatus.OK);
	}
	
	@GetMapping(value="/historic/{productName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getProductsByProvider(@PathVariable("productName") String productName){
		List<Existencias> lst = existenciasSrvc.getExistenciasByNombreProductoLike(productName);
		return new ResponseEntity<List<Existencias>>(lst,null,HttpStatus.OK);
	}

}
