package com.ofds.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofds.bean.FoodOrder;
import com.ofds.bean.Hotel;
import com.ofds.repo.FoodOrderRepo;

@Service
public class FoodService {

    @Autowired
    private FoodOrderRepo repo;

    public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
        return repo.save(foodOrder);
    }
    
    public FoodOrder getFoodOrderById(int foodId) {
    	FoodOrder foodorder =   repo.findById(foodId).get()  ;
           return foodorder ;
       }
	
}