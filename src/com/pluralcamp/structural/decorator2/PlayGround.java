package com.pluralcamp.structural.decorator2;

public class PlayGround extends Luxury {

	public PlayGround(Home home) {
		super(home);
		this.luxuryCost = 20000.0;
		System.out.printf("For a playground, you pay an extra of %.2f€%n", this.luxuryCost);
	}

	@Override
	public double getPrice() {
		return home.getPrice() + this.luxuryCost;
	}
}
