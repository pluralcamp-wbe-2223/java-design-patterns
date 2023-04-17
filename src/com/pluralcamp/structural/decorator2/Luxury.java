package com.pluralcamp.structural.decorator2;

/*
 * A Decorator object is designed in such a way
 * that it has the same interface as the
 * underlying object.
 * So a client object can interact with the
 * decorated object in the same way as it would
 * with the underlying object.
 * A Decorator object contains a reference to
 * the actual object.
 */
public abstract class Luxury extends Home {
	protected Home home;
	public double luxuryCost;

	public Luxury(Home home) {
		this.home = home;
	}

	@Override
	public double getPrice() {
		return home.getPrice();
	}
}
