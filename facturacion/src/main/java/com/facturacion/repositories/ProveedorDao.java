package com.facturacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturacion.entitys.Proveedor;

public interface ProveedorDao extends JpaRepository<Proveedor, Integer> {

}
