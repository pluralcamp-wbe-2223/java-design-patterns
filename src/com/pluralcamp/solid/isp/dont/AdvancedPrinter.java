package com.pluralcamp.solid.isp.dont;

public class AdvancedPrinter implements Printer {

	@Override
	public void printDocument() {
		System.out.println("The advanced printer prints a document.");
	}

	@Override
	public void sendFax() {
		System.out.println("The advanced printer sends a fax.");
	}

	/*
	 * This is added at a later time,
	 * when we want to set the type of
	 * fax we will use for sending fax.
	 * 
	 * Breaks the OCP:
	 * The interface Printer also
	 * needs to be modified.
	 */
	@Override
	public void sendFax(Fax faxType) {
		System.out.println("The advanced printer sends a fax " + 
				"using a fax type of " + faxType.toString());
	}

}
