package com.ofds.repo;



import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ofds.bean.User;

import jakarta.persistence.EntityManager;

@Repository
public class UserRepoImpl implements UserRepo{

	@Autowired
	private EntityManager entityManager;


	@SuppressWarnings("deprecation")
	@Override
	public void save(User user) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(user);
	}

}
