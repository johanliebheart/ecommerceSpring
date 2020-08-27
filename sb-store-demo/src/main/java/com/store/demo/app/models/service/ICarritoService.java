package com.store.demo.app.models.service;

import java.util.List;

import com.store.demo.app.models.entity.Carrito;

public interface ICarritoService {

	public List<Carrito> findAll();

	public void save(Carrito carrito);

	public int saveGetId(Carrito carrito);

	public Carrito findOne(int id);

	public void delete(int id);

}
