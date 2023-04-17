package com.pluralcamp.solid.srp.dont;

import java.util.Random;

/*
 * Breaking the SRP:
 * displaying employee details, generating employee id and
 * checking employee seniority, are all different activities.
 * 
 * SRP: There needs to be ONE UNIQUE single reason
 * for change in the class.
 * 
 * Here:
 * - The top manager can set a different criterion to 
 * decide seniority level.
 * - The algorithm to generate the employee id could be
 * another one (decided at a later time by the company).
 * 
 */
public class Employee {

	public String firstName, lastName, empId;
	public double experienceInYears;

	public Employee(String firstName, String lastName, double experience) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.experienceInYears = experience;
	}

	public void displayDetails() {
		System.out.printf("Employee name: %s, %s%n", this.lastName, this.firstName);
		System.out.printf("This employee has %.2f years of experience.%n", this.experienceInYears);
	}

	public String checkSeniority() {
		return this.experienceInYears > 5 ? "senior" : "junior";
	}

	public String generateEmpId() {
		int random = new Random().nextInt(1000);
		this.empId = this.firstName.substring(0, 1) + random;
		return this.empId;
	}
}
