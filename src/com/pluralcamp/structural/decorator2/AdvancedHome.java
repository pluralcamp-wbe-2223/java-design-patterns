package com.pluralcamp.structural.decorator2;

public class AdvancedHome extends Home {
	public AdvancedHome() {
		this.additionalCost = 25000.0;
		System.out.println("An advanced home is created with more facilities.");
		System.out.printf("You need to pay %.2f€ for this advanced house.%n", this.getPrice());
	}

	@Override
	public double getPrice() {
		// there is no additional cost for a basic home
		return this.basePrice + this.additionalCost;
	}
}
