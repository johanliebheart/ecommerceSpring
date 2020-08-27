package com.store.demo.app.models.service;

import java.util.List;

import com.store.demo.app.models.entity.Product;

public interface IProductService {

	public List<Product> findAll();
	
	public void save(Product product);
	
	public int saveGetId(Product product);
	
	public Product findOne(int id);
	
	public void delete(int id);
}
