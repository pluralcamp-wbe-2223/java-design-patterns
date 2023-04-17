package com.pluralcamp.structural.decorator2;

public class Main {

	public static void main(String[] args) {

		System.out.println("***Using wrappers in different scenarios***");

		// Scenario 1
		System.out.println("Scenario-1: Building a basic home with standard facilities.");
		Home home = new BasicHome();
		printCost(home);

		// Scenario 2
		System.out.println("Scenario-2: Building a basic home. Then adding a playground.");
		home = new BasicHome();
		home = new PlayGround(home);
		printCost(home);

		// Scenario 3
		System.out.println("Scenario-3: Building a basic home. Then adding two playgrounds.");
		home = new BasicHome();
		home = new PlayGround(home);
		home = new PlayGround(home);
		printCost(home);

		// Scenario 4
		System.out.println("Scenario-4: Building a basic home. Then adding a swimming pool and then a playground.");
		home = new BasicHome();
		home = new SwimmingPool(home);
		home = new PlayGround(home);
		printCost(home);

		// Scenario 5
		System.out.println("Scenario-5: Building a basic home. Then adding a playground and then a swimming pool.");
		home = new BasicHome();
		home = new PlayGround(home);
		home = new SwimmingPool(home);
		printCost(home);

		// Scenario 6
		System.out.println("Scenario-6: Building an advanced home now.");
		home = new AdvancedHome();
		printCost(home);

		// Scenario 7
		System.out.println("Scenario-7: Building an advanced home. Then adding an additional playground to it.");
		home = new AdvancedHome();
		home = new PlayGround(home);
		printCost(home);

		// Scenario 8
		System.out.println(
				"Scenario-8: Building an advanced home. Then adding an additional playground and then one swimming pool to it.");
		home = new AdvancedHome();
		home = new PlayGround(home);
		home = new SwimmingPool(home);
		printCost(home);
	}

	private static void printCost(Home home) {
		System.out.printf("Total cost: %.2f€%n%n", home.getPrice());
	}

}
