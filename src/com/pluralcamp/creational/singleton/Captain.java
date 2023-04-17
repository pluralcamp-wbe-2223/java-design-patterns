package com.pluralcamp.creational.singleton;

public final class Captain {

	private static Captain captain;
	// We make the constructor private to prevent the use of "new"
	static int numberOfInstance = 0;

	private Captain() {
		numberOfInstance++;
		System.out.println("Number of instances at this moment=" + numberOfInstance);
	}

	public static synchronized Captain getCaptain() {
		// Lazy initialization
		if (captain == null) {
			captain = new Captain();
			System.out.println("New captain is elected for your team.");
		} else {
			System.out.print("You already have a captain for your team.");
			System.out.println("Send him for the toss.");
		}
		return captain;
	}
	/*
	 * //A non-static nested class (inner class) public class MakeACaptainDerived
	 * extends MakeACaptain {
	 * 
	 * }
	 */
}

// We cannot extend MakeACaptain.The constructor is private in this case.
// class B extends MakeACaptain{}// error
