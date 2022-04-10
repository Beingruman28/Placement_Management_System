package com.cg.placement.client;

import com.cg.placement.entities.Placement;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.PlacemnetServiceImpl;

public class ClientPlacement {
	
			public static void main(String[] args) {
			
			// CRUD operation calling activity
			Placement placement = new Placement();
			
			IPlacementService service = new PlacemnetServiceImpl();
			
			// Creating Placement record
			
			placement.setP_id(3);
			placement.setS_name("Nikita");
			placement.setCollege("PDA College");
			placement.setDate("12/03/2023");
			placement.setQualification("B.E");
			placement.setYear(2021);
			
			service.addPlacement(placement);
			
			System.out.println("Row added");
			
			// Retrieve Placement record
			placement	= service.searchPlacementById(2);
			System.out.println("ID is:"+placement.getP_id());
			System.out.println("Student Name is:"+placement.getS_name());
			System.out.println("College name is:"+placement.getCollege());
			System.out.println("Qualification is:"+placement.getQualification());
			System.out.println("Date is:"+placement.getDate());
			System.out.println("Year is:"+placement.getYear());


			// Update Placement record
			placement	= service.searchPlacementById(1);
			placement.setCollege("KBN College");
			service.updatePlacement(placement);
			System.out.println("Update is successful");

			// Delete Placement record				
			placement	= service.searchPlacementById(1);
			service.cancelPlacement(placement);
			System.out.println("Canceled and Deletion is successful");
		}

	}