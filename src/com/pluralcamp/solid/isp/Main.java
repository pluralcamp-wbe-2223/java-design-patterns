package com.pluralcamp.solid.isp;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Demo that follows the ISP ***\n");
		
		Printer printer = new BasicPrinter();
		printer.printDocument();
		
		printer = new AdvancedPrinter();
		printer.printDocument();
		
		printer = new SuperAdvancedPrinter();
		printer.printDocument();
		
		((SuperAdvancedPrinter)printer).sendFax();
		((SuperAdvancedPrinter)printer).photocopy();
		
		FaxDevice faxDevice = new AdvancedPrinter();
		faxDevice.sendFax();
		//faxDevice.printDocument();//No puede
		
		faxDevice = new SuperAdvancedPrinter();
		faxDevice.sendFax();
		
		PhotocopyDevice photocopyDevice = new SuperAdvancedPrinter();
		photocopyDevice.photocopy();
		
		
	}

}
