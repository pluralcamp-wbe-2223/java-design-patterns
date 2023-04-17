package com.pluralcamp.structural.decorator2;

public class BasicHome extends Home {

	public BasicHome() {
		// No additional cost for a basic home
		System.out.println("A basic home with standard facilities is ready.");
		System.out.printf("You need to pay %.2f€ for this basic house.%n", this.getPrice());
	}

	@Override
	public double getPrice() {
		// there is no additional cost for a basic home
		return this.basePrice;
	}

}
