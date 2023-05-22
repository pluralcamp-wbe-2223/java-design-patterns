package com.pluralcamp.solid.dip;

/*
 * Dependency Inversion Principle:
 * 
 * High level modules simply should NOT depend
 * on low-level modules in any way
 */
public class PostgresDatabase implements Database {

	@Override
	public void saveEmpInDatabase(String empId) {
		//Saving emp id in Postgres db...
		System.out.printf("The id: %s is saved in the "
				+ "PostgreSQL database%n", empId);
	}

}
