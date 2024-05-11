package com.ofds.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofds.bean.FoodOrder;
import com.ofds.repo.FoodOrderRepo;

@Service
public class FoodService {

    @Autowired
    private FoodOrderRepo repo;

    public void saveFoodOrder(FoodOrder foodOrder) {
          repo.save(foodOrder);
    }
    
    public FoodOrder getFoodOrderById(int foodId) {
    	FoodOrder foodorder =   repo.getByFoodOrderId(foodId);
           return foodorder ;
       }
	
}