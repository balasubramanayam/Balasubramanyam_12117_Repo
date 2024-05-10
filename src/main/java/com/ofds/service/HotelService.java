package com.ofds.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofds.bean.Hotel;
import com.ofds.bean.User;
import com.ofds.repo.HotelRepo;
import com.ofds.repo.UserRepo;

@Service
public class HotelService {

	@Autowired
	HotelRepo repo;
	
	public List<Hotel> getAllHotel() {
		Iterator<Hotel> iterator = repo.findAll().iterator();
		List<Hotel>List1 = new ArrayList();
        while (iterator.hasNext()) {
        	List1.add(iterator.next());
        }
		return List1 ; 
	}
	
	public Hotel getHotelById(int hId) {
     Hotel hotel =   repo.findById(hId).get()  ;
        return hotel ;
    }
}
