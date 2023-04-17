package com.pluralcamp.solid.dip.dont;


/*
 * Breaks DIP:
 * Top level class UserInterface
 * has too much dependency on the
 * bottom-level class MySQLDatabase
 * 
 * We are forced to finish the bottom-level
 * class before finishing or testing the top-level.
 * 
 * What if it's a different database (postgresql...)?
 * 
 */
public class UserInterface {
	
	private MySQLDatabase db;
	
	public UserInterface() {
		this.db = new MySQLDatabase();
	}
	
	public void saveEmployeeId(String empId) {
		//Assuming this is valid data
		System.out.println("Saving employee id to database...");
		db.saveEmpIdInDatabase(empId);
	}
}
