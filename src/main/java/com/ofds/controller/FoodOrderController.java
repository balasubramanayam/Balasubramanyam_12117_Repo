package com.ofds.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofds.bean.FoodOrder;
import com.ofds.bean.Hotel;
import com.ofds.service.FoodService;

@CrossOrigin("http://localhost:3000/") 
@RestController
public class FoodOrderController {
	@Autowired
	FoodService foodservice;  
	@PostMapping("/insertOrder")
	public String InsertFoodOrder(@RequestBody FoodOrder order) {
		String msg = "";
		try {
			foodservice.saveFoodOrder(order);
			msg = "Object Saved";
		} catch (Exception e) {

			msg = "Object Not Saved";
		}
		return msg;
	}
	
	@GetMapping("/getOrderId/{id}")  
	  public FoodOrder getFoodOrderById(@PathVariable("id") Integer foodId) {
	    return foodservice.getFoodOrderById(foodId);
	  }
	} 
	

