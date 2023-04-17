package com.pluralcamp.solid.lsp.dont;

/*
 * The override of the previousPaymentInfo()
 * will break the LSP:
 * 
 * GuestUserPayment cannot replace Payment type
 * without changing the app's behavior.
 */
public class GuestUserPayment implements Payment {

	final String name;
	
	public GuestUserPayment() {
		this.name = "guest";
	}
	
	@Override
	public void previousPaymentInfo() {
		//A guest user does not have previous payments
		throw new UnsupportedOperationException();//Breaks LSP
		
	}

	@Override
	public void newPayment() {
		System.out.printf("Processing %s's new payment request...%n", this.name);
		//Some other code, if any			
	}

}
