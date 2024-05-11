package com.ofds.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ofds.bean.Hotel;

import jakarta.persistence.EntityManager;

@Repository
public class HotelRepoImpl implements HotelRepo {

	@Autowired
	private EntityManager entityManager;

	public List<Hotel> getAllHotel() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Hotel> query = currentSession.createQuery("from Hotel", Hotel.class);
		List<Hotel> list = query.getResultList();
		return list;
	}

	@Override
	public Hotel getByHotelId(int hId) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Hotel.class, hId);

	}

}
