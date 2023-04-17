package com.pluralcamp.solid.lsp;

public class RegisteredUserPayment implements NewPayment,PreviousPayment {

	String userName;
	
	public RegisteredUserPayment(String userName) {
		this.userName = userName;
	}
	
	@Override
	public void previousPaymentInfo() {
		System.out.printf("Retrieving %s's last payment details...%n", this.userName);
		//Some other code, if any		
	}

	@Override
	public void newPayment() {
		System.out.printf("Processing %s's new payment request...%n", this.userName);
		//Some other code, if any				
	}

}
