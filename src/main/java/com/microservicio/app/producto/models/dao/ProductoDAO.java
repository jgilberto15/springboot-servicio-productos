package com.microservicio.app.producto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.microservicio.app.producto.models.entity.Producto;

public interface ProductoDAO extends CrudRepository<Producto, Long>{

}
