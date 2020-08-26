package com.store.demo.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.demo.app.models.dao.IClienteDao;
import com.store.demo.app.models.entity.Cliente;
@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	public int saveGetId(Cliente cliente) {
		Cliente clien=new Cliente();
		clien=clienteDao.save(cliente);
		return clien.getId();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(int id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(int id) {
		clienteDao.deleteById(id);
	}

}
