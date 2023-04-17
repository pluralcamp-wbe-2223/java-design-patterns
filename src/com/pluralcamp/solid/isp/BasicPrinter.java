package com.pluralcamp.solid.isp;

/*
 * Basic printer is not able
 * to send fax.
 */
public class BasicPrinter implements Printer {

	@Override
	public void printDocument() {
		System.out.println("The basic printer prints a document.");		
	}
	
}
