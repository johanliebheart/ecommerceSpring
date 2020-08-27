package com.store.demo.app.models.dao;
import org.springframework.data.repository.CrudRepository;
import com.store.demo.app.models.entity.Pedido;

public interface IPedidoDao extends CrudRepository<Pedido,Integer> {

}
