//package com.ofds;
//
//
//
//
//
//
//
//
//
//
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.ofds.bean.FoodOrder;
//import com.ofds.repo.FoodOrderRepo;
//import com.ofds.service.FoodService;
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class FoodServiceTest {
//
//	@Mock
//	FoodOrderRepo foodRepo;
//
//	@InjectMocks
//	FoodService foodService;
//
//	@SuppressWarnings("deprecation")
//	@Before
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void testSaveUser1() {
//	   FoodOrder food = new FoodOrder();
//	   food.setFoodId(1);
//	   food.setFoodName("Biryani");
//	   food.setFoodPrice("1222");
//
//		when(foodRepo.save(food)).thenReturn(food);
//
//		FoodOrder savedfood =foodService.saveFoodOrder(food);
//
//		assertEquals(food.getFoodId(), savedfood.getFoodId());
//		assertEquals(food.getFoodName(), savedfood.getFoodName());
//		assertEquals(food.getFoodPrice(), savedfood.getFoodPrice());
//	}
//	
//}