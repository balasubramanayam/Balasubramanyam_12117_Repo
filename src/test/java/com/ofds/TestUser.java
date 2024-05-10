//package com.ofds;
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
//import com.ofds.bean.User;
//import com.ofds.repo.UserRepo;
//import com.ofds.service.UserService;
//
//@RunWith(MockitoJUnitRunner.class)
//public class TestUser {
//
//	@Mock
//	UserRepo userRepo;
//
//	@InjectMocks
//	UserService userService;
//
//	@SuppressWarnings("deprecation")
//	@Before
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void testSaveUser1() {
//		User user = new User();
//		user.setId(1);
//		user.setName("Balu");
//		user.setPassword("Password0");
//
//		when(userRepo.save(user)).thenReturn(user);
//
//		User savedUser = userService.saveUser(user);
//
//		assertEquals(user.getId(), savedUser.getId());
//		assertEquals(user.getName(), savedUser.getName());
//		assertEquals(user.getPassword(), savedUser.getPassword());
//	}
//	
//	@Test
//	public void testSaveUser2() {
//		User user = new User();
//		user.setId(1);
//		user.setName("Loki");
//		user.setPassword("Password1");
//
//		when(userRepo.save(user)).thenReturn(user);
//
//		User savedUser = userService.saveUser(user);
//
//		assertEquals(user.getId(), savedUser.getId());
//		assertEquals(user.getName(), savedUser.getName());
//		assertEquals(user.getPassword(), savedUser.getPassword());
//	}
//}