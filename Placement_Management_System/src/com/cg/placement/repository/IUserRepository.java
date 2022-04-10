package com.cg.placement.repository;

import com.cg.placement.entities.User;

public interface IUserRepository 
{

	public User addNewUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);
	
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();

	
}
