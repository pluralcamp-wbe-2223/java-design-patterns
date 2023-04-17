package com.pluralcamp.structural.decorator2;

public abstract class Home {
	public double basePrice;
	public double additionalCost;

	public Home() {
		// Minimum home price is 100.000€
		this.basePrice = 100000.0;
		this.additionalCost = 0.0;
	}

	public abstract double getPrice();
}
