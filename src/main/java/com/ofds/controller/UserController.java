package com.ofds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofds.bean.User;
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

}
