package com.ofds.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofds.bean.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer> {

}
