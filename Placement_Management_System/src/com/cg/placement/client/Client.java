package com.cg.placement.client;

import com.cg.placement.entities.College;
import com.cg.placement.entities.User;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IUserService;
//import com.cg.placement.service.IUserService;
//import com.cg.placement.service.UserServiceImpl;
import com.cg.placement.service.UserServiceImpl;

public class Client
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		User user = new User();
		College college = new College();
				IUserService service = new UserServiceImpl();
				ICollegeService service1 = new CollegeServiceImpl();
		
				
				
				college.setId(12);
				college.setCollegeName("GCE");
				college.setLocation("rmg");
				college.setCollegeAdmin(user);
				service1.addCollege(college);
				service.addUser(user);
				
				// Create
				user.setId(151);
				user.setName("ashwin");
				user.setType("bowler");
				user.setPassword("ashwin123");
				
				service.addUser(user);
				service1.addCollege(college);
				System.out.println("new user has been added");
				
				
				
		/*
		// Update
		user	= service.updateUser(user);
		user.setId(0);
		user.setId(01);
		user.setName("bhumrah");
		user.setPassword("bhumrah10");
		user.setType("bowler");
		service.updateUser(user);
		System.out.println("Update is successful");
	*/
	
				
		
		
	}
}