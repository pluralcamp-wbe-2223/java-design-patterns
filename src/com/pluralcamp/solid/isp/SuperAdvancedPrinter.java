package com.pluralcamp.solid.isp;

public class SuperAdvancedPrinter implements Printer, FaxDevice, PhotocopyDevice{

	@Override
	public void sendFax() {
		System.out.println("The Super advanced printer prints a document.");
		
	}

	@Override
	public void printDocument() {
		System.out.println("The Super advanced printer sends a fax.");
	}

	@Override
	public void photocopy() {
		System.out.println("The Super advanced printer does photocopies.");
		
	}

}
