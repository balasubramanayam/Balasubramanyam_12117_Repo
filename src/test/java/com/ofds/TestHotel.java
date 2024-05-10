//package com.ofds;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.ofds.bean.Hotel;
//import com.ofds.service.HotelService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestHotel {
//
//	@Autowired
//	HotelService service;
//
//	@Test
//	public void testGetAllHotel() {
//		List<Hotel> hotels = service.getAllHotel();
//		Assert.assertNotNull(hotels);
//	}
//
//	@Test
//	public void testGetHotelById() {
//		Hotel result = service.getHotelById(1);
//		Assert.assertEquals(1, result);
//	}
//}
//
//
