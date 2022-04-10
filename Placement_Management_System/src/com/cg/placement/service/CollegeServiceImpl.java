package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.repository.CollegeRepositoryimpl;
import com.cg.placement.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService

{
	//STEP 1_ESTABLISHING CONNECTION BETWEEN SERVICE AND REPOSITORY FILES
	private ICollegeRepository dao;
	
	public CollegeServiceImpl() 
	{
		dao = new CollegeRepositoryimpl();
		
	}
//STEP 2_SERVICE CALLS TO PERFORM CRUD OPERTAIONS.
	@Override
	public College addCollege(College college) {
		 
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	
	
	@Override
	public College updateCollege(College college) {
		 
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	
	}

	@Override
	public College searchCollege(College college) 
	{
		College cllege=dao.searchCollege(college);
		
		
		return cllege;
	}

	@Override
	public boolean deleteCollege(int id) {
		dao.beginTransaction();
		dao.deleteCollege(id);
		dao.commitTransaction();
		
		return false;
	}
	
	@Override
	public College schedulePlacement(College placement)
	{
		dao.beginTransaction();
		dao.updateCollege(placement);
		dao.commitTransaction();
		return placement;
	
	} 
	

	
	
	}

