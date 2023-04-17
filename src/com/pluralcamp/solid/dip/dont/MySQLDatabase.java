package com.pluralcamp.solid.dip.dont;

public class MySQLDatabase {
	
	public void saveEmpIdInDatabase(String empId) {
		//Saving emp id in db...
		System.out.printf("The id: %s is saved in the database%n", empId);
	}
}
