package com.ofds.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ofds.bean.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

}