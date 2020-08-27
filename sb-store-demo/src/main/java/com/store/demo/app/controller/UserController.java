package com.store.demo.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.app.models.entity.User;
import com.store.demo.app.models.service.IUserService;

@RestController 
@CrossOrigin(origins = "http://yipitest.com:4200") 
@RequestMapping(path = "users")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/get")
	public List<User> getUsers(){
		System.out.println("test");
		return userService.findAll();
	}
	

	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userService.save(user);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public User deleteUser(@PathVariable("id") int id) {
		User user = userService.findOne(id);
		userService.delete(id);;
		return user;
	}
	
	
	
}
