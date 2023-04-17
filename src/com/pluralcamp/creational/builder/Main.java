package com.pluralcamp.creational.builder;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Modified Builder Pattern Demo***");
		/*
		 * Making a custom car (through builder) Note the steps: Step1:Get a builder
		 * object with required parameters Step2:Setter like methods are used.They will
		 * set the optional fields also. Step3:Invoke the constructCar() method to get
		 * the final car.
		 */
		final ProductClass customCar1 = new CarBuilder().addHeadlights(5).insertWheels(5).buildBody("Plastic")
				.constructCar();
		System.out.println(customCar1);
		System.out.println("--------------");
		/*
		 * Making another custom car (through builder) with a different sequence and
		 * steps.
		 */
		ModifiedBuilder carBuilder2 = new CarBuilder();
		final ProductClass customCar2 = carBuilder2.insertWheels(7).addHeadlights(6)
				.startUpOperations("I am making my own car").constructCar();
		System.out.println(customCar2);
		System.out.println("--------------");

		/*
		 * customCar2 = carBuilder2.insertWheels(70)//error because customCar2 is final
		 * .addHeadlights(6) .startUpOperations("I am making my own car")
		 * .constructCar(); System.out.println(customCar2);
		 */
		// Verifying the getConstructedCar() method
		final ProductClass customCar3 = carBuilder2.getConstructedCar();
		System.out.println(customCar3);

	}
}
