package com.lain.serviceusers.service;

import java.util.List;

import com.lain.serviceusers.models.entity.User;

public interface IUserService {
	public User save(User user);	
	public void delete(User user);
	public User findById(Long id);
	public List<User> findAll();
	public Long count();
}
