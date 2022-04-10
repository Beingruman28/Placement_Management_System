package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.User;

public class UserRepositoryImpl implements IUserRepository { //IMPLEMENT ALL METHODS
	
	//START  JPA LIFECYCLE
	private EntityManager entityManager;
	public UserRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();  //CREATED  EMPTY CONSTRUCTOR
	}
	// Create operation - Repo/DAO

	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	//UPDATE OPERATION
	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	//DELETE OPERATION
	@Override
	public User deleteUser(int id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
		
	}

}
