package com.ofds.repo;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ofds.bean.FoodOrder;

import jakarta.persistence.EntityManager;

@Repository
public class FoodOrderRepoImpl implements FoodOrderRepo {
	@Autowired
	private EntityManager entityManager;

	

	@SuppressWarnings("deprecation")
	@Override
	public void save(FoodOrder foodorder) {
		Session currentSession = entityManager.unwrap(Session.class);
	   	currentSession.saveOrUpdate(foodorder);

	}

	@Override
	public FoodOrder getByFoodOrderId(int foodId) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(FoodOrder.class, foodId);
	}

	

}
