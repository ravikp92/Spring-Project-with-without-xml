package com.ravi.springboot;

import com.ravi.springboot.services.UserService;
import com.ravi.springboot.services.UserServiceImpl;

public class MainProgram {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		
		userService.retreivAllUsers().forEach(user-> System.out.println(user));
	}
}
