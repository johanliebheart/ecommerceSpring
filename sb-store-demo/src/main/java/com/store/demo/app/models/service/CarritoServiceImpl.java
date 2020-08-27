package com.store.demo.app.models.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.demo.app.models.dao.ICarritoDao;
import com.store.demo.app.models.entity.Carrito;

@Service
public class CarritoServiceImpl implements ICarritoService{

	private ICarritoDao carritoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Carrito> findAll() {
		return (List< Carrito>) carritoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Carrito carrito) {
		carritoDao.save(carrito);
		
	}

	@Override
	public int saveGetId(Carrito carrito) {
		Carrito carri= new Carrito();
		carri=carritoDao.save(carrito);
		return carri.getIdCarrito();
	}

	@Override
	@Transactional(readOnly = true)
	public Carrito findOne(int id) {
		
		return carritoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		carritoDao.deleteById(id);
		
	}


	
	
}
