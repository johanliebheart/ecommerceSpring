package com.store.demo.app.models.service;

import java.util.List;

import com.store.demo.app.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public int saveGetId(Cliente cliente);
	
	public Cliente findOne(int id);
	
	public void delete(int id);

}
