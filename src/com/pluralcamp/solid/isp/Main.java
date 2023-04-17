package com.pluralcamp.solid.isp;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Demo that follows the ISP ***\n");
		
		Printer printer = new BasicPrinter();
		printer.printDocument();
		
		printer = new AdvancedPrinter();
		printer.printDocument();
		
		FaxDevice faxDevice = new AdvancedPrinter();
		faxDevice.sendFax();
	}

}
