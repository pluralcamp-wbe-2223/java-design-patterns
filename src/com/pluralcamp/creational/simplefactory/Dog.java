package com.pluralcamp.creational.simplefactory;

class Dog implements Animal {
	public void speak() {
		System.out.println("Dog says: Bow-Wow.");
	}

	public void preferredAction() {
		System.out.println("Dogs prefer barking...");
	}
}
