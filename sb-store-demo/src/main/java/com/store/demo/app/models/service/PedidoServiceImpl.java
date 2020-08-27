package com.store.demo.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.demo.app.models.dao.IPedidoDao;
import com.store.demo.app.models.entity.Pedido;
@Service
public class PedidoServiceImpl implements IPedidoService{

	@Autowired
	private IPedidoDao pedidoDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Pedido> findAll() {
		return (List<Pedido>) pedidoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Pedido pedido) {
		pedidoDao.save(pedido);
	}

	@Override
	@Transactional
	public int saveGetId(Pedido pedido) {
		Pedido pedi= new Pedido();
		pedi=pedidoDao.save(pedido);
		return pedi.getIdPedido();
	}

	@Override
	@Transactional(readOnly = true)
	public Pedido findOne(int id) {
			return pedidoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		pedidoDao.deleteById(id);
		
	}

}
