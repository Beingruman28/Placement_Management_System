package com.cg.placement.repository;

import com.cg.placement.entities.College;

public interface ICollegeRepository 
{
   public College addCollege(College college);
   public College updateCollege(College college);
   public College searchCollege(College college);
   public boolean deleteCollege(int id);
   public College schedulePlacement(College placement);
   
   public abstract void beginTransaction();
   public abstract void commitTransaction();

}