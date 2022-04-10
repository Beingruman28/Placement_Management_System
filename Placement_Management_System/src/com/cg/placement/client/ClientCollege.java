package com.cg.placement.client;

import java.io.Serializable;

import com.cg.placement.entities.College;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICollegeService;

public class ClientCollege implements Serializable {

		public static void main(String[] args) 
		{
			//CRUD OPERATION CALLING ACTIVITY.
		College college=new College();
		ICollegeService service= new CollegeServiceImpl();
		
		//CRUD 
		
		college.setId(102);
		college.setCollegeName("tendulkar school");
		college.setLocation("mumbai");
		 service.addCollege(college);
		
	//RETRIVE
		 college=service.searchCollege(college);
		  System.out.println("id is"+college.getId());
		  System.out.println("college name is"+college.getCollegeName());
		  System.out.println("college admin is"+college.getCollegeAdmin());
		  System.out.println("location is"+college.getLocation());
		  
		  //update
		 /* college=service.searchCollege(college);
		  college.setCollegeName("anil school");
		  service.updateCollege(college);
		  System.out.println("updated college");
		  
		  //delete
			 college=service.searchCollege(college);
	          service.deleteCollege(100);
	   	 */
		 
		}

	}
