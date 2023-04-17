package com.pluralcamp.solid.dip.dont;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Demo without DIP ***\n");

		UserInterface userInterface = new UserInterface();
		userInterface.saveEmployeeId("E017");
		
	}

}
