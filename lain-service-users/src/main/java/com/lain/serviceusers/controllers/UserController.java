package com.lain.serviceusers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lain.serviceusers.models.entity.User;
import com.lain.serviceusers.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return userService.save(user);
	}
	
	@PutMapping("/update/{id}")
	public User update(@PathVariable Long id, @RequestBody User user) {
		User _user = userService.findById(id);
		_user.setAvatarUrl(user.getAvatarUrl());
		_user.setNick(user.getNick());
		_user.setStatus(user.getStatus());
		return userService.save(_user);
	}
	
	@PostMapping("/delete/{id}")
	public User delete(@PathVariable Long id) {
		User user = userService.findById(id);
		userService.delete(user);
		return user;
	}
	
	@GetMapping("/detail/{id}")
	public User detail(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/count")
	public Long count() {
		return userService.count();
	}
	
	@GetMapping("/list")
	public List<User> list(){
		return userService.findAll();
	}
}
