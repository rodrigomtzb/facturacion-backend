package com.facturacion.controllers.proveedores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturacion.entitys.Proveedor;
import com.facturacion.services.impl.ProveedorServiceImpl;

@RestController
@CrossOrigin(allowedHeaders="*")
@RequestMapping("/api/proveedores")
public class ProveedoresController {
	
	@Autowired
	private ProveedorServiceImpl proveedorService;
	
	
	@PostMapping("/")
	public ResponseEntity<?> addProveedor(@RequestBody Proveedor proveedor ) {
		try {
			Proveedor newProv = proveedorService.save(proveedor);
			return new ResponseEntity<Proveedor>(newProv,null,HttpStatus.CREATED);
			
		}catch(Exception e) {
			return new ResponseEntity<Proveedor>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping(path="/",  produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Proveedor>> findAll(){
		List<Proveedor> lst = proveedorService.findAll();
		return new ResponseEntity<List<Proveedor>>(lst,null,HttpStatus.OK);
	}
}
