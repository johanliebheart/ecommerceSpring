package com.store.demo.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.store.demo.app.models.entity.Product;

public interface IProductDao extends CrudRepository<Product, Integer>{

}
