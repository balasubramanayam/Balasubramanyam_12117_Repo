package com.ofds.repo;



import com.ofds.bean.FoodOrder;

public interface FoodOrderRepo {

	

	public void save(FoodOrder foodorder);

	public FoodOrder getByFoodOrderId(int foodId);

	

}
