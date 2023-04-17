package com.pluralcamp.solid.isp.dont;

public class Main {
	
	static public void main(String... arguments) {
		System.out.println("*** Demo without ISP ***\n");
		
		Printer printer = new AdvancedPrinter();
		printer.printDocument();
		printer.sendFax();
		
		printer = new BasicPrinter();
		printer.printDocument();
		printer.sendFax(); //Run time error !!
		
		/*
		 * Breaks ISP: if a third printer that can
		 * print documents, send fax and photocopy 
		 * documents too, we would add a
		 * photocopying method in the printer interface:
		 * 
		 * BasicPrinter and AdvancedPrinter would
		 * also need to be changed.
		 */
	}
}
