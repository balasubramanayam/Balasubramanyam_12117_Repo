package com.ofds.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofds.bean.Hotel;
import com.ofds.bean.User;
import com.ofds.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}


public List<User> getAllUser() {
	Iterator<User> iterator = userRepo.findAll().iterator();
	List<User>List1 = new ArrayList();
    while (iterator.hasNext()) {
    	List1.add(iterator.next());
    }
	return List1 ; 
}}