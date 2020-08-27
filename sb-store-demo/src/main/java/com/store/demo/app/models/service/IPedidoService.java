package com.store.demo.app.models.service;

import java.util.List;

import com.store.demo.app.models.entity.Pedido;

public interface IPedidoService {

	public List<Pedido> findAll();

	public void save(Pedido pedido);

	public int saveGetId(Pedido pedido);

	public Pedido findOne(int id);

	public void delete(int id);

}
