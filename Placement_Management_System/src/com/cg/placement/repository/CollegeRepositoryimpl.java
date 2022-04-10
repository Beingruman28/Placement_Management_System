package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.College;

public class CollegeRepositoryimpl implements ICollegeRepository    //IMPLEMENT ALL METHODS
{
	
	//START  JPA LIFECYCLE
    private EntityManager entitymanager;
	
	public CollegeRepositoryimpl() 
	{
		entitymanager =JPAUtil.getEntityManager();            //CREATED  EMPTY CONSTRUCTOR
	}
	
	//CREATE OPERATION IN REPORSITORY
	@Override
	public College addCollege(College college) {              
		entitymanager.persist(college);
		return college;
	}
	
	
	//UPDATE OPERATION
	@Override
	public College updateCollege(College college) {           
		entitymanager.merge(college);
		return college;
	}
	
	
	//SEARCH OPERATION
	@Override
	public College searchCollege(College college) {
		College College=entitymanager.find(College.class, college);
		return College;
	}
	
	
	//DELETE OPERATION
	@Override
	public boolean deleteCollege(int id)
	{
		College college=entitymanager.find(College.class, id);
		entitymanager.remove(college);
		return false;
	}

	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
	}

	@Override
	public College schedulePlacement(College placement) 
	{
		//College college =entitymanager.merge(placement);
		return placement;
	}
	

}