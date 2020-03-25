package com.lain.serviceusers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lain.serviceusers.models.dao.UserDao;
import com.lain.serviceusers.models.entity.User;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public User save(User user) {		
		return userDao.save(user);
	}

	@Override
	public User findById(Long id) { 
		return userDao.findById(id).orElse(null);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public Long count() { 
		return userDao.count();
	}

}
