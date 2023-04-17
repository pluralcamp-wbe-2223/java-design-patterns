package com.pluralcamp.structural.decorator2;

public class SwimmingPool extends Luxury {

	public SwimmingPool(Home home) {
		super(home);
		this.luxuryCost = 55000.0;
		System.out.printf("For a swimming pool, you pay an extra of %.2f€%n", this.luxuryCost);
	}

	@Override
	public double getPrice() {
		return home.getPrice() + this.luxuryCost;
	}
}
