package com.facturacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facturacion.entitys.UltimasExistencias;

public interface UltimasExistenciasDao extends JpaRepository<UltimasExistencias, Integer> {
	
	//@Query("Select e from Existencias e where e.proveedor_id = ?1 ")
		public List<UltimasExistencias> getUltimasExistenciasByProveedorId( Integer proveedor_id ) ;
		@Query(value="select e.* from view_ultimas_cargas e where e.nombre_producto like %:nameProduct% order by e.codigo", nativeQuery=true)
		public List<UltimasExistencias> getUltimasExistenciasByNombreProductoLike( @Param("nameProduct") String nameProduct ) ;

}
