package com.facturacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facturacion.entitys.Existencias;

public interface ExistenciasDao  extends JpaRepository<Existencias,Integer> {

	//@Query("Select e from Existencias e where e.proveedor_id = ?1 ")
	public List<Existencias> getExistenciasByProveedorId( Integer proveedor_id ) ;
	@Query(value="select e.* from existencias e where e.nombre_producto like %:nameProduct% order by e.codigo", nativeQuery=true)
	public List<Existencias> getExistenciasByNombreProductoLike( @Param("nameProduct") String nameProduct ) ;
	
}
