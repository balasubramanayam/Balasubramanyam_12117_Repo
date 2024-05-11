package com.ofds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofds.bean.User;
import com.ofds.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public void saveUser(User user) {
		userRepo.save(user);
	}

}