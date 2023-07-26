package com.microservicio.app.producto.models.services;

import java.util.List;

import com.microservicio.app.producto.models.entity.Producto;

public interface ProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
