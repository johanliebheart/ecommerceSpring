package com.store.demo.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.store.demo.app.models.dao.IProductDao;
import com.store.demo.app.models.entity.Product;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductDao productDao;

	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) productDao.findAll();
	}

	@Override
	@Transactional
	public void save(Product product) {
		productDao.save(product);		
	}

	@Override
	@Transactional
	public int saveGetId(Product product) {
		Product produ=new Product();
		produ=productDao.save(product);
		return produ.getIdProduct();
	}

	@Override
	@Transactional(readOnly = true)
	public Product findOne(int id) {
		return productDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productDao.deleteById(id);
	}
	

	

}
