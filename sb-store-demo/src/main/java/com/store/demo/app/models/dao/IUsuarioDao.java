package com.store.demo.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.store.demo.app.models.entity.User;

public interface IUsuarioDao extends CrudRepository<User, Integer>{

}
