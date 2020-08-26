package com.store.demo.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.store.demo.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer>{

}
