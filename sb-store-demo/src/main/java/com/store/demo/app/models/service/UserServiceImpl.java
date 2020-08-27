package com.store.demo.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.demo.app.models.dao.IUsuarioDao;
import com.store.demo.app.models.entity.User;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return (List<User>) usuarioDao.findAll();
	}

	@Override
	@Transactional
	public void save(User ususario) {
		usuarioDao.save(ususario);
	}

	@Override
	@Transactional
	public int saveGetId(User usuario) {
		User usuar= new User();
		usuar=usuarioDao.save(usuario);
		return usuar.getId();
	}

	@Override
	public User findOne(int id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		usuarioDao.deleteById(id);
	}

}
