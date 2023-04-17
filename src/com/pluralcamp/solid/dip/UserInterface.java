package com.pluralcamp.solid.dip;

/*
 * Dependency Inversion Principle:
 * 
 * High level modules simply should NOT depend
 * on low-level modules in any way
 */
public class UserInterface {
	
	Database database;
	
	public UserInterface(Database database) {
		this.database = database;
	}
	
	/*
	 * This setter method is optional but
	 * allows us to change the DB implementation
	 * used without creating a new UI object
	 */
	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public void saveEmployeeId(String empId) {
		database.saveEmpInDatabase(empId);
	}
}
