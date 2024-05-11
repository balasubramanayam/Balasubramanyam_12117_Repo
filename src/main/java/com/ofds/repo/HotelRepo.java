package com.ofds.repo;

import java.util.List;

import com.ofds.bean.Hotel;

public interface HotelRepo {
	public List<Hotel> getAllHotel();

	public Hotel getByHotelId(int hId);

}
