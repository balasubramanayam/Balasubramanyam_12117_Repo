package com.ofds.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofds.bean.Hotel;
import com.ofds.repo.HotelRepo;

@Service
public class HotelService {

	@Autowired
	HotelRepo repo;

	@SuppressWarnings("rawtypes")
	public List<Hotel> getAllHotel() {
		Iterator<Hotel> iterator = repo.getAllHotel().iterator();
		@SuppressWarnings("unchecked")
		List<Hotel> List1 = new ArrayList();
		while (iterator.hasNext()) {
			List1.add(iterator.next());
		}
		return List1;
	}

	public Hotel getHotelById(int hId) {
		Hotel hotel = repo.getByHotelId(hId);
		return hotel;
	}
}
