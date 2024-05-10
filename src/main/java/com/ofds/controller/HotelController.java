package com.ofds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ofds.bean.Hotel;
import com.ofds.repo.HotelRepo;
import com.ofds.service.HotelService;

@CrossOrigin("http://localhost:3000/") 
@RestController
public class HotelController {

	@Autowired
	HotelService service;
	
	
	
	   
	
	@GetMapping("/getAllHotel")  
	public List<Hotel> AllHotel(){
		List<Hotel> List = (List<Hotel>) service.getAllHotel();
		return List;
	} 
	
	@GetMapping("/getHotel/{id}")
	  public Hotel getHotelById(@PathVariable("id") Integer hId) {
	    return service.getHotelById(hId);
	  }
	
	
}
