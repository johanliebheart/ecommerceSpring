package com.store.demo.app.models.service;

import java.util.List;

import com.store.demo.app.models.entity.User;

public interface IUserService {

	public List<User> findAll();

	public void save(User ususario);

	public int saveGetId(User usuario);

	public User findOne(int id);

	public void delete(int id);

}
