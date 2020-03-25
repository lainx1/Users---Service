package com.lain.serviceusers.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lain.serviceusers.models.entity.User;

public interface UserDao extends JpaRepository<User, Long>{}
