package com.ravi.springboot.services;

import java.util.List;

import com.ravi.springboot.model.User;
import com.ravi.springboot.model.repository.InMemoryUserRepositoryImpl;
import com.ravi.springboot.model.repository.UserRepository;

public class UserServiceImpl implements UserService{

	private UserRepository userRepository=new InMemoryUserRepositoryImpl();
	
	public List<User> retreivAllUsers() {
		return userRepository.retreivAllUsers();
	}

}
