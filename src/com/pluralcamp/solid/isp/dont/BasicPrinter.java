package com.pluralcamp.solid.isp.dont;

/*
 * Basic printer is not able
 * to send fax.
 */
public class BasicPrinter implements Printer {

	@Override
	public void printDocument() {
		System.out.println("The basic printer prints a document.");		
	}

	@Override
	public void sendFax() {
		/*
		 * Be aware of breaking LSP here
		 */
		throw new UnsupportedOperationException();		
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
		/*
		 * Be aware of breaking LSP here
		 */
		throw new UnsupportedOperationException();		
	}

}
