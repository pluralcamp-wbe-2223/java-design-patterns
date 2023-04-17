package com.pluralcamp.creational.singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***\n");
		System.out.println("Trying to make a captain for your team:");
		// Constructor is private.We cannot use "new" here.
		// Captain c3 = new Captain();//error
		Captain c1 = Captain.getCaptain();
		System.out.println("Trying to make another captain for your team:");
		Captain c2 = Captain.getCaptain();
		if (c1 == c2) {
			System.out.println("c1 and c2 are same instance.");
		}
		// Captain.CaptainDerived derived=c1.new CaptainDerived();
	}
}
