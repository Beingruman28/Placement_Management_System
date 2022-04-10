package com.cg.placement.service;

import com.cg.placement.entities.College;

public interface ICollegeService 
{
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(College college);
	public boolean deleteCollege(int id);
	public College schedulePlacement(College placement);
	
}