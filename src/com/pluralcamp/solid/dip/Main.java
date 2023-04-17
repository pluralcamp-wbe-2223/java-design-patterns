package com.pluralcamp.solid.dip;

/*
 * Dependency Inversion Principle:
 * 
 * High level modules simply should NOT depend
 * on low-level modules in any way
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("*** Demo that follows the DIP ***\n");
		
		//Using MySQL now
		Database db = new MySQLDatabase();
		UserInterface ui = new UserInterface(db);
		ui.saveEmployeeId("E017");
		
		//Using PostgreSQL now
		db = new PostgresDatabase();
		ui = new UserInterface(db);
		ui.saveEmployeeId("E018");
		
		//Without creating a new UI object
		ui.setDatabase(new MySQLDatabase());
		ui.saveEmployeeId("E019");
		
	}

}
