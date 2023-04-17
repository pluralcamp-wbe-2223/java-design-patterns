package com.pluralcamp.solid.ocp.dont;

import java.util.Arrays;
import java.util.List;

/*
 * Follows SRP for Student.
 * 
 * Students gets a distinction when:
 * - marks are higher than 80 for science
 * - marks are higher than 70 for arts
 * 
 * Does NOT follow the OCP:
 * - The college authority can introduce, in the future,
 * a new stream, such as commerce, and set a new 
 * distinction criteria for this stream: 
 * This will require to modify this class.
 * 
 * Thus, this class is NOT Closed for Modification.
 *
 */
public class DistinctionDecider {

	List<String> science = Arrays.asList("Computer Science", "Physics");
	List<String> arts = Arrays.asList("History", "English");

	public void evaluateDistinction(Student student) {
		if (science.contains(student.department)) {
			if (student.score > 80) {
				System.out.println(student.regNumber + " has received a distinction in science.");
			}
		} else if (arts.contains(student.department)) {
			if (student.score > 70) {
				System.out.println(student.regNumber + " has received a distinction in arts.");
			}
		}
	}
}
