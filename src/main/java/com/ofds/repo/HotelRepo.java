package com.ofds.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofds.bean.Hotel;

public interface HotelRepo  extends JpaRepository<Hotel, Integer> {

}
