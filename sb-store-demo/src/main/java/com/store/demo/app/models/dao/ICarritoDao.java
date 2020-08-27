package com.store.demo.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.store.demo.app.models.entity.Carrito;

public interface ICarritoDao extends CrudRepository<Carrito, Integer>{

}
