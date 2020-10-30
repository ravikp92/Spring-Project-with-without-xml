package com.ravi.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ravi.springboot.services.UserService;
import com.ravi.springboot.services.UserServiceImpl;

public class MainProgram {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext containers=
				new ClassPathXmlApplicationContext("application-context.xml");
		
		UserService userService=containers.getBean("userService", UserService.class);
		userService.retreivAllUsers().forEach(user-> System.out.println(user));
	}
}
