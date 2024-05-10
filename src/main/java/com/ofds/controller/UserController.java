package com.ofds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofds.bean.Hotel;
import com.ofds.bean.User;
import com.ofds.repo.UserRepo;
import com.ofds.service.UserService;

@CrossOrigin("http://localhost:3000/")
@RestController
public class UserController {

	
	@Autowired
	UserService service;
	
	
	
	@PostMapping("/insertUser")
	public String InsertUser(@RequestBody User user) {
		String msg = "";
		try {
		service.saveUser(user);
			msg = "Object Saved";
		} catch (Exception e) {
 
			msg = "Object Not Saved";
		}
		return msg;
	}
	
	    
	@GetMapping("/getAllUser")  
	public List<User> AllHotel(){
		List<User> List = (List<User>) service.getAllUser();
		return List;
	} 
	
	 
	
}
